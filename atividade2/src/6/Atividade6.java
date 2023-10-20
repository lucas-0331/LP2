import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int option = 0;
        int a = 0;
        int b = 0;

        do {
            System.out.println("\n\n Calculadora 2000");
            System.out.println("\n [1] - Soma");
            System.out.println(" [2] - Multiplicação");
            System.out.println(" [3] - Divisão");
            System.out.println(" [4] - Subtração");
            System.out.println(" [0] - Sair");
            System.out.print("> ");
            option = input.nextInt();

            if(option != 0) {
                System.out.printf("Digite o valor de A: ");
                a = input.nextInt();
                System.out.printf("Digite o valor de B: ");
                b = input.nextInt();
            }
            
            switch(option) {
                case 0: 
                    System.out.println("Tchau");
                    break;
                
                case 1:
                    System.out.printf("%d + %d = %d\n", a, b, (a + b));
                    break;
                
                case 2:
                    System.out.printf("%d * %d = %d\n", a, b, (a * b));
                    break;
                
                case 3:
                    System.out.printf("%d / %d = %d\n", a, b, (a / b));
                    break;
                
                case 4:
                    System.out.printf("%d - %d = %d\n", a, b, (a - b));
                    break;
            }
        } while(option != 0);

        input.close();
    }
}