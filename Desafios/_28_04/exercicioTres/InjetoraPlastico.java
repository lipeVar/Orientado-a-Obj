package Desafios._28_04.exercicioTres;

public class InjetoraPlastico extends MaquinaIndustrial {

    private double kgMateriaPrima;

    public InjetoraPlastico(String serie) {
        super(serie);
    }

    public void abastecerPlastico(double kg) {
        if (kg < 0) throw new IllegalArgumentException("Valor inválido!");
        kgMateriaPrima += kg;
    }

    @Override
    public void produzirLote(int qtd) throws Exception {

        if (!isLigada())
            throw new MaquinaDesligadaException("Máquina desligada!");

        double necessario = qtd * 0.2;

        if (kgMateriaPrima < necessario)
            throw new FaltaMateriaPrimaException("Falta matéria prima!");

        kgMateriaPrima -= necessario;

        double energia = qtd * 0.5;

        registrarProducao(qtd, energia);

        System.out.println("Injetora produziu " + qtd + " peças.");
    }
}
