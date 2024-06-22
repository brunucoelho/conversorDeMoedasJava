import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        while (true) {
            System.out.print(" **************************************************** \n");
            //System.out.println("\n");
            System.out.print(" -----  Seja bem vindo ao conversor de moedas (: ---- \n");
            System.out.print(" 1) Dólar (USD)  ->  Pesos Argentinos(ARS)            \n");
            System.out.print(" 2) Pesos Argentinos(ARS)  ->  Dólar (USD)            \n");
            System.out.print(" 3) Dólar (USD)  ->  Real (BRL)                       \n");
            System.out.print(" 4) Real (BRL)  ->  Dólar (USD)                       \n");
            System.out.print(" 5) Dólar (USD)  ->  Peso colombiano (COP)            \n");
            System.out.print(" 6) Peso colombiano (COP)  ->  Dólar (USD)            \n");
            System.out.print(" 7) Sair                                              \n");
            System.out.print(" **************************************************** \n");
            //System.out.println("\n");
            System.out.print("Escolha uma opção válida: \n");

            int opcao = menu.nextInt();

            if (opcao == 0) {
                System.out.print("\nConversor Finalizado!");
                menu.close();
                break;
            }

            System.out.print("Digite o valor que deseja converter: \n");
            double valor = menu.nextDouble();

            switch (opcao) {
                case 1:
                    System.out.printf("\nValor de %.2f [USD] corresponde ao valor final de -> %.2f [ARS]\n", valor, BuscadorMoeda.converterMoeda("USD", "ARS", valor));
                    break;

                case 2:
                    System.out.printf("\nValor de %.2f [ARS] corresponde ao valor final de -> %.2f [USD]\n", valor, BuscadorMoeda.converterMoeda("ARS", "USD", valor));
                    break;

                case 3:
                    System.out.printf("\nValor de %.2f [USD] corresponde ao valor final de -> %.2f [BRL]\n", valor, BuscadorMoeda.converterMoeda("USD", "BRL", valor));
                    break;

                case 4:
                    System.out.printf("\nValor de %.2f [BRL] corresponde ao valor final de -> %.2f [USD]\n", valor, BuscadorMoeda.converterMoeda("BRL", "USD", valor));
                    break;

                case 5:
                    System.out.printf("\nValor de %.2f [USD] corresponde ao valor final de -> %.2f [COP]\n", valor, BuscadorMoeda.converterMoeda("USD", "COP", valor));
                    break;

                case 6:
                    System.out.printf("\nValor de %.2f [COP] corresponde ao valor final de -> %.2f [USD]\n", valor, BuscadorMoeda.converterMoeda("COP", "USD", valor));
                    break;

                default:
                    System.out.print("\nEssa conversão não é permitida, favor digitar um número válido!\n");
                    break;
            }
        }
    }
}
