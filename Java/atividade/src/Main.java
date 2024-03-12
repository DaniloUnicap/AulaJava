import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        System.out.println("=== Selecione uma das opções abaixo ===");
        System.out.println(
                "1- Inserir carro" +
                "\n2- Consultar" +
                "\n3- Listar carros" +
                "\n4- Remover carro" +
                "\n5- Sair"
        );

        Carro c1 = new Carro("Uno", "Fiat", "1234567", 2008, "Branca" );


        while(true) {
            int opcao = dado.nextInt();
            switch (opcao) {
                case 1:


                    break;
                case 2:
                    c1.exibirInfoCarro();

                    break;
                case 3:


                    break;
                case 4:

                    break;
                case 5:
                    dado.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }
    }
}