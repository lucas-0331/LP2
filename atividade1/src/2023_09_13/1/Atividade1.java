import java.util.Scanner;

// Crie um código que lei dois números e realize a soma destes, imprimindo o resultado.

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("  [1] - Soma");
        System.out.println("  [2] - Subtração");
        System.out.println("  [3] - Multiplicação");
        System.out.println("  [4] - Divisão");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("\nSelecione uma opção: ");
        Double operacao = input.nextDouble();
        System.out.print("Digite o valor de A: ");
        Double numero_1 = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        Double numero_2 = input.nextDouble();

        switch(operacao) {
            case 1:
                System.out.println("Resultado da soma: %.1f", numero_1 + numero_2);
                break;

            case 2:
                System.out.println("Resultado da subtração: %.1f", numero_1 - numero_2);
                break;

            case 3:
                System.out.println("Resultado da multiplicação: %.1f", numero_1 * numero_2);
                break;

            case 4:
                System.out.println(("Resultado da divisão: %.1f"), numero_1 / numero_2);
                break;

            default:
                System.out.println("Opção ínvalida");
        }

        input.close();
    }
}