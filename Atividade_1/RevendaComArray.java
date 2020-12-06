class RevendaComArray{
    private Produto[] produtos;
    private int indice;

    // Constructors
    public RevendaComArray(int qtdeProdutos){
        produtos = new Produto[qtdeProdutos];
        indice = 0;    
    }

    //Getters and Setters
    public Produto[] getProdutos(){return produtos;}

    // Methods
    public void insereProduto(Produto p){ 
        produtos[indice] = p;
        indice++;
    }

    public void comprar(int cod, int qtde){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                Produto produto = produtos[i];
                produto.compra(qtde);
                break;
            }
        }
        if(i == indice){
            System.out.println("___");
            System.out.println("Produto não disponível");
        }
    }

    public void vender(int cod, int qtde){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                Produto produto = produtos[i];
                produto.venda(qtde);
                break;
            }
        }
        if(i == indice){
            System.out.println("___");
            System.out.println("Produto não disponível");
        }
    }

    public void consultaPrecoVenda(int cod){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                Produto produto = produtos[i];
                double valorVenda = produto.calculaPrecoVenda();
                System.out.println("___");
                System.out.println("Produto: " + produto.getDesc());
                System.out.printf("O valor de venda: %.2f\n", valorVenda);
                break;
            }
        }
        if(i == indice){
            System.out.println("___");
            System.out.println("Produto não disponível");
        }
    }

    public void consultarProduto(int cod){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                System.out.println(produtos[i].toString());
                break;
            } 
        }
        if(i == indice){
            System.out.println("___");
            System.out.println("Produto não disponível");
        }
    }

    public Produto buscarProduto(int cod){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                break;
            }
        }
        if(i == indice){
            System.out.println("___");
            System.out.println("Produto não disponível");
            Produto p = new Produto(-1, "none");
            return p;
        }
        return produtos[i];
    }

    public void listaPrecos(){
        for(int i = 0; i < indice; i++){
            Produto p = produtos[i];
            System.out.println("___");
            System.out.println("Código: " + p.getCod());
            System.out.println("Descrição: " + p.getDesc());
            System.out.printf("Preço: %.2f\n", p.calculaPrecoVenda());
        }
    }
}