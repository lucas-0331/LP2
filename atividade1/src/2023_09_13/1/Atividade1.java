import java.util.Scanner;

// Crie um código que lei dois números e realize a soma destes, imprimindo o resultado.

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int numero_1 = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int numero_2 = input.nextInt();
        int resultado = numero_1 + numero_2;

        System.out.println("Resultado da soma: " + resultado);

        input.close();
    }
}