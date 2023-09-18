import java.util.Scanner;

// Fazer um programa que leia um funcionário o número do funcionário, seu número de horas
// trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o
// número e o salário do funcionário, com duas casas decimais. Utilize a classe funcionário.

public class Atividade5 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ID do Funcionario: ");
        int idFuncionario = input.nextInt();

        System.out.print("Nome do Funcionario: ");
        String nomeFuncionario = input.next();

        System.out.print("Quantas horas trabalhadas: ");
        double horaTrabalhada = input.nextDouble();

        System.out.print("Valor da hora: ");
        double valorHoraTrabalhada = input.nextDouble();

        double salarioFuncionario = valorHoraTrabalhada * horaTrabalhada;

        Funcionario funcionario = new Funcionario(nomeFuncionario, idFuncionario, horaTrabalhada, valorHoraTrabalhada, salarioFuncionario);

        funcionario.imprimirPagamentoFuncionario();

        input.close();
        // funcionario.close();
    }
}