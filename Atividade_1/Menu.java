import java.util.Scanner;

class Menu {
    private String descricao;
    private Scanner sc = new Scanner(System.in);

    // Constructors
    public Menu(String desc) {
        this.descricao = desc;
    }

    // Methods
    public Produto criarProduto() {
        System.out.println("___\nCriar Produto\n___");
        System.out.println("Preencha os campos abaixo:");
        System.out.println("Código");
        int codProd = sc.nextInt();
        System.out.println("Descrição");
        String descProd = sc.next();
        System.out.println("Valor de compra");
        double vlCompra = sc.nextDouble();
        System.out.println("Custo");
        double custoProd = sc.nextDouble();
        System.out.println("Margem de Lucro");
        double margLucro = sc.nextDouble();
        System.out.println("Quantidade em estoque");
        int qtdeEstoque = sc.nextInt();
        Produto p = new Produto(codProd, descProd, vlCompra, custoProd, margLucro, qtdeEstoque);       
        return p;
    }

    public void comprarProduto(RevendaComArray r){
        System.out.println("___\nComprar Produto\n___");
        System.out.println("Preencha os campos abaixo:");
        System.out.println("Código");
        int cod = sc.nextInt();
        System.out.println("Quantidade");
        int qtde = sc.nextInt();
        r.comprar(cod, qtde);
    }

    public void venderProduto(RevendaComArray r){
        System.out.println("___\nVender Produto\n___");
        System.out.println("Preencha os campos abaixo:");
        System.out.println("Código");
        int cod = sc.nextInt();
        System.out.println("Quantidade");
        int qtde = sc.nextInt();
        r.vender(cod, qtde);
    }

    public void consultaPreco(RevendaComArray r){
        System.out.println("___\nConsultar preço de Produto\n___");
        System.out.println("Preencha os campos abaixo:");
        System.out.println("Código");
        int cod = sc.nextInt();
        r.consultaPrecoVenda(cod);
    }

    public void listarPrecos(RevendaComArray r){
        System.out.println("___\nLista de preços\n___");
        r.listaPrecos();
    }

    public void consultarProduto(RevendaComArray r){
        System.out.println("___\nConsultar informações de Produto\n___");
        System.out.println("Preencha os campos abaixo:");
        System.out.println("Código");
        int cod = sc.nextInt();
        r.consultarProduto(cod);
    }
       
}
