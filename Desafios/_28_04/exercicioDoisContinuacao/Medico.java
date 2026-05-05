package Desafios._28_04.exercicioDoisContinuacao;

public class Medico extends FuncionarioHospital {

    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    public Medico(String nome, String matricula, double salarioBase,
                  String especialidade, double valorPorPlantao, int quantidadePlantoes) {
        super(nome, matricula, salarioBase);
        this.especialidade = especialidade;
        this.valorPorPlantao = valorPorPlantao;
        setQuantidadePlantoes(quantidadePlantoes);
    }

    public void setQuantidadePlantoes(int qtd) {
        if (qtd < 0) {
            throw new ValorInvalidoException("Plantões inválidos!");
        }
        this.quantidadePlantoes = qtd;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
    }
}
