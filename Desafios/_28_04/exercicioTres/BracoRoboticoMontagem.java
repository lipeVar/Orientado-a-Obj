package Desafios._28_04.exercicioTres;

public class BracoRoboticoMontagem extends MaquinaIndustrial {

    private double percentualCalibracao;

    public BracoRoboticoMontagem(String serie) {
        super(serie);
        this.percentualCalibracao = 100.0;
    }

    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    @Override
    public void produzirLote(int qtd) throws Exception {

        if (!isLigada())
            throw new MaquinaDesligadaException("Máquina desligada!");

        if (percentualCalibracao < 20.0)
            throw new EquipamentoDescalibradoException("Equipamento descalibrado!");

        double energia = 15.0;

        percentualCalibracao -= qtd * 0.5;
        if (percentualCalibracao < 0) percentualCalibracao = 0;

        registrarProducao(qtd, energia);

        System.out.println("Robô produziu " + qtd + " peças.");
    }
}
