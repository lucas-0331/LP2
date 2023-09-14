import java.util.Scanner;

// Escreva o código para calculo da área das formas geométricas: Sempre recebendo 3 valores A,
// B, C. Sendo A o (comprimento) e B(largura)-representam as bases e os lados, e C representa a
// altura/diâmetro.
// Retorne a área das seguintes formas: triangulo; circulo; trapézio; quadrado; retângulo

public class Atividade2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: "); //Comprimento
        int a = input.nextInt();
        System.out.print("Digite o valor de B: "); //Largura - Base - Lado
        int b = input.nextInt();
        System.out.print("Digite o valor de C: "); //Altura - Diâmetro
        int c = input.nextInt();

        System.out.println("Area do Triangulo: " + (c * b) / 2);
        System.out.println("Area do Circulo: " + (3.14 * (c * c)));
        System.out.println("Area do Trapézio: " + ((a + b) * c) / 2);
        System.out.println("Area do Quadrado: " + a * a);
        System.out.println("Area do Retangulo: " + a * b);

        input.close();
    }
}
