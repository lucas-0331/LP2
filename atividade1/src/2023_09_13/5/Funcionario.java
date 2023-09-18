public class Funcionario {
    public String nomeFuncionario;
    public int idFuncionario;
    public double horaTrabalhada;
    public double valorHoraTrabalhada;
    public double salarioFuncionario;

    public Funcionario(String nomeFuncionario, int idFuncionario, double horaTrabalhada, double valorHoraTrabalhada, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.horaTrabalhada = horaTrabalhada;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.salarioFuncionario = salarioFuncionario;
    }

    public void imprimirPagamentoFuncionario() {
        System.out.printf("\nID Funcionario:.................. %d\n", idFuncionario);
        System.out.printf("Nome do Funcionario.............. %s\n", nomeFuncionario);
        System.out.printf("Valor por Hora:.................. %.2f R$\n", valorHoraTrabalhada);
        System.out.printf("Quantidade de Hora Trabalhada:... %.2f R$\n", horaTrabalhada);
        System.out.printf("Salario:......................... %.2f R$\n", salarioFuncionario);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }    

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(double horaTrabalhada) {
        this.horaTrabalhada = horaTrabalhada;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
}