import java.util.Scanner;

// Fazer um programa que leia de dois funcionários o número de um funcionário, seu número de
// horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
// mostre o número e o salário do funcionário, com duas casas decimais. Utilize um vetor pra
// armazenar sem a criação de uma classe funcionário.

public class Atividade4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int quantidadeFuncionario = 2;
        int tamanhoVetor = 5;
        int[] idFuncionario = new int[tamanhoVetor];
        Double[] horaTrabalhada = new Double[tamanhoVetor];
        Double[] valorHoraTrabalhada = new Double[tamanhoVetor];
        Double[] salarioFuncionario = new Double[tamanhoVetor];

        for(int i = 0; i < quantidadeFuncionario; i++) {
            System.out.printf("ID do Funcionario %d: ", i + 1);
            idFuncionario[i] = input.nextInt();
            System.out.printf("Horas Trabalhadas do Funcionario %d: ", i + 1);
            horaTrabalhada[i] = input.nextDouble();
            System.out.printf("Valor por Hora Trabalhada do Funcionario %d: ", i + 1);
            valorHoraTrabalhada[i] = input.nextDouble();

            salarioFuncionario[i] = horaTrabalhada[i] * valorHoraTrabalhada[i];
        }

        for(int i = 0; i < quantidadeFuncionario; i++) {
            System.out.printf("\nID do Funcionario %d: %d\n", i + 1, idFuncionario[i]);
            System.out.printf("Salario do Funcionario %d: %.2fR$\n", i + 1, salarioFuncionario[i]);
        }

        input.close();
    }
}
