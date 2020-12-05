class Produto{
    private int cod;
    private String desc;
    private double valorCompra;
    private double custo;
    private double margemLucro;
    private int qtdeEstoque;

    // Constructors
    public Produto(int cod, String desc){
        this.cod = cod;
        this.desc = desc;
    }

    public Produto(int cod, String desc, double valorCompra, double custo, double margemLucro){
        this.cod = cod;
        this.desc = desc;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
    }

    public Produto(int cod, String desc, double valorCompra, double custo, double margemLucro, int qtdeEstoque){
        this.cod = cod;
        this.desc = desc;
        this.valorCompra = valorCompra;
        this.custo = custo;
        this.margemLucro = margemLucro;
        this.qtdeEstoque = qtdeEstoque;
    }


    // Getters and Setters
    public int getCod(){return this.cod;}
    public double getValorDeCompra(){return this.valorCompra;}
    public double getCusto(){return this.custo;}
    public double getMargemDeLucro(){return this.margemLucro;}
    public int getQtdeEmEstoque(){return this.qtdeEstoque;}
    public String getDesc(){return this.desc;}

    public void setValorDeCompra(double valor){this.valorCompra = valor;}
    public void setCusto(double custo){this.custo = custo;}
    public void setMargemDeLucro(double margem){this.margemLucro = margem;}
    public void setQtdeEstoque(int qtde){this.qtdeEstoque = qtde;}


    // Methods
    public void compra(int quantidade){qtdeEstoque += quantidade; }
    public void venda(int quantidade){qtdeEstoque -= quantidade;}
    public double calculaPrecoVenda(){
        double precoVenda =  this.valorCompra + this.custo + 
        this.margemLucro*(this.valorCompra + this.custo);
        return precoVenda;
    }

}