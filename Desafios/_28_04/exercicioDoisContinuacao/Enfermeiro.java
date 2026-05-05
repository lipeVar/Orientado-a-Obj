package Desafios._28_04.exercicioDoisContinuacao;

public class Enfermeiro extends FuncionarioHospital {

    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(String nome, String matricula, double salarioBase,
                      String setor, double percentual) {
        super(nome, matricula, salarioBase);
        this.setor = setor;
        setPercentualInsalubridade(percentual);
    }

    public void setPercentualInsalubridade(double p) {
        if (p != 0.10 && p != 0.20 && p != 0.40) {
            throw new ValorInvalidoException("Percentual inválido!");
        }
        this.percentualInsalubridade = p;
    }

    @Override
    public double calcularSalarioFinal() {

        double bonus = getSalarioBase() * percentualInsalubridade;

        int horas = getHorasTrabalhadasMensais();
        double extra = 0;

        if (horas > 160) {
            extra = (horas - 160) * 50;
        }

        return getSalarioBase() + bonus + extra;
    }
}
