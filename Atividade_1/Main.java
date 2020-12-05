import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // Elabore um programa que cria uma Revenda e oferece um menu com 
        // operações para criar produto, comprar, vender,
        // consultar preço, listar preco além de consultar e 
        // alterar os atributos valor de compra, custo e margem de lucro em um
        // determinado produto
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Seja bem vind@");
        System.out.println("Por favor, digite a quantidade de produtos de seu estoque logo abaixo");
        Menu menu = new Menu("interfaceConsole");
        RevendaComArray r = new RevendaComArray(sc.nextInt());

        while(true){
            System.out.println("___");
            System.out.println("Menu");
            System.out.println("1 - Criar produto\n2 - Comprar produto\n3 - Vender produto\n4 - Consultar preço de um produto");
            System.out.println("5 - Listar preços\n6 - Consultar produto\n7 - Alterar produto\n0 - Sair/Voltar");
            int opcaoMenu = sc.nextInt();
            if (opcaoMenu == 0) break;
            switch(opcaoMenu){
                case 1:
                r.insereProduto(menu.criarProduto());
                break;
                case 2:
                menu.comprarProduto(r);
                break;
                case 3:
                menu.venderProduto(r);
                break;
                case 4:
                menu.consultaPreco(r);
                break;
                case 5:
                menu.listarPrecos(r);
                break;
                case 6:
                menu.consultarProduto(r);
                break;
                default:
                System.out.println("Opção inválida, retornando ao menu");
                break;
            }
        }  
        
        sc.close();
    }
}