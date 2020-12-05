class RevendaComArray{
    private Produto[] produtos;
    private int indice;

    // Constructors
    public RevendaComArray(int qtdeProdutos){
        produtos = new Produto[qtdeProdutos];
        indice = 0;    
    }

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
                System.out.println("A compra foi realizada com sucesso");
                break;
            }
        }
        if(i == indice) System.out.println("Produto não disponível");
    }

    public void vender(int cod, int qtde){
        int i;
        for(i = 0; i < indice; i++){
            if(cod == produtos[i].getCod()){
                Produto produto = produtos[i];
                produto.venda(qtde);
                System.out.println("Venda realizada com sucesso");
                break;
            }
        }
        if(i == indice) System.out.println("Produto não disponível");
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