import java.util.Scanner;

public class Atividade7 {

    static double pi = 3.14159;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option = 0;
        double a = 0;
        double b = 0;
        double c = 0;

        do {

            System.out.println("Geometria 2000");
            System.out.println("\n [1] - Triângulo Retângulo");
            System.out.println(" [2] - Circulo");
            System.out.println(" [3] - Trapézio");
            System.out.println(" [4] - Quadrado");
            System.out.println(" [5] - Retângulo");
            System.out.print("> ");

            option = input.nextInt();

            switch (option) {
                case 0:
                    System.out.println("Tchau");
                    break;

                case 1:
                    a = input.nextDouble();
                    c = input.nextDouble();
                    System.out.printf("Retângulo: %.2f\n", a * c);
                    break;

                case 2:
                    c = input.nextDouble();
                    System.out.printf("Círculo: %.2f\n", pi * (c * c));
                    break;
                
                case 3:
                    a = input.nextDouble();
                    b = input.nextDouble();
                    c = input.nextDouble();
                    System.out.printf("Trapézio: %.2f\n", ((a + b) * c) / 2);
                    break;

                case 4:
                    b = input.nextDouble();
                    System.out.printf("Quadrado: %.2f\n", b * b);
                    break;
                
                case 5:
                    a = input.nextDouble();
                    b = input.nextDouble();
                    System.out.printf("Retângulo: %.2f\n", a * b);
                    break;
                
                default:
                    System.out.println("Opção invalida!");
            }
        } while (option != 0);

        input.close();
    }
}
