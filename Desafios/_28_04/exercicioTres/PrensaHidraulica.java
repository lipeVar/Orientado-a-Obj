package Desafios._28_04.exercicioTres;

public class PrensaHidraulica extends MaquinaIndustrial {

    private double temperaturaAtual;

    public PrensaHidraulica(String serie) {
        super(serie);
        this.temperaturaAtual = 25.0;
    }

    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    @Override
    public void produzirLote(int qtd) throws Exception {

        if (!isLigada())
            throw new MaquinaDesligadaException("Máquina desligada!");

        if (temperaturaAtual >= 90.0)
            throw new SuperaquecimentoException("Máquina superaquecida!");

        temperaturaAtual += qtd * 1.5;

        double energia = qtd * 2.0;

        registrarProducao(qtd, energia);

        System.out.println("Prensa produziu " + qtd + " peças.");
    }
}
