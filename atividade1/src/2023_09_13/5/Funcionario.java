public class Funcionario {
    public String nomeFuncionario;
    public int idFuncionario;
    public int horaTrabalhada;
    public int minutoTrabalhado;
    public double valorHoraTrabalhada;
    public double salarioFuncionario;

    public Funcionario(String nomeFuncionario, int idFuncionario, int horaTrabalhada, int minutoTrabalhado, double valorHoraTrabalhada, double salarioFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.idFuncionario = idFuncionario;
        this.horaTrabalhada = horaTrabalhada;
        this.minutoTrabalhado = minutoTrabalhado;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
        this.salarioFuncionario = salarioFuncionario;
    }

    public void imprimirPagamentoFuncionario() {
        System.out.printf("\nID Funcionario:.................. %d\n", idFuncionario);
        System.out.printf("Nome do Funcionario.............. %s\n", nomeFuncionario);
        System.out.printf("Valor por Hora:.................. %.2f R$\n", valorHoraTrabalhada);
        System.out.printf("Quantidade de Hora Trabalhada:... %d:%d Hr(s)\n", horaTrabalhada, minutoTrabalhado);
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

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public void setHoraTrabalhada(int horaTrabalhada) {
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

    public int getMinutoTrabalhado() {
        return minutoTrabalhado;
    }

    public void setMinutoTrabalhado(int minutoTrabalhado) {
        this.minutoTrabalhado = minutoTrabalhado;
    }
}