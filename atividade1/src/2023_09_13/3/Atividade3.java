import java.util.Scanner;

// Fazer um programa que leia de um funcionário o número de um funcionário, seu número de
// horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
// mostre o número e o salário do funcionário, com duas casas decimais. Utilize variáveis comuns
// sem a criação de uma classe funcionário.

public class Atividade3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("ID do Funcionario: ");
        int idFuncionario = input.nextInt();
        System.out.print("Carga Horario do Funcionario: ");
        Double horasTrabalhadas = input.nextDouble();
        System.out.print("Valor por Hora Trabalhada do Funcionario: ");
        Double valorHoraTrabalhada = input.nextDouble();

        Double salarioFuncionario = horasTrabalhadas * valorHoraTrabalhada;

        System.out.printf("ID do Funcionario: %d\nSalario do Funcionario: %.2f\n", idFuncionario, salarioFuncionario);

        input.close();
    }
}
