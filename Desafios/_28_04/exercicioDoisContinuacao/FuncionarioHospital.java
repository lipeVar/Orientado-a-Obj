package Desafios._28_04.exercicioDoisContinuacao;

public abstract class FuncionarioHospital {

    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    public FuncionarioHospital(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        setSalarioBase(salarioBase);
        this.horasTrabalhadasMensais = 0;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412) {
            throw new ValorInvalidoException("Salário base inválido!");
        }
        this.salarioBase = salarioBase;
    }

    public void setHorasTrabalhadasMensais(int horas) {
        if (horas < 0 || horas > 300) {
            throw new ValorInvalidoException("Carga horária inválida!");
        }
        this.horasTrabalhadasMensais = horas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getHorasTrabalhadasMensais() {
        return horasTrabalhadasMensais;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract double calcularSalarioFinal();

    public void exibirResumoMensal() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas: " + horasTrabalhadasMensais);
        System.out.println("Salário Final: " + calcularSalarioFinal());
        System.out.println("------------------------");
    }
}