package Desafios.aula_28_04.exercicioUm;

public class NaveCargueiro extends NaveEspacial{
    private double pesoCargaAtual;
    private double capacidadeMaximaCarga;

    public NaveCargueiro(String id, double combMax, double vel, double capacidadeMaximaCarga) {
        super(id, combMax, vel);
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
    }

    public void setPesoCargaAtual(double peso) {
        if(peso > capacidadeMaximaCarga) {
            throw new IllegalArgumentException("Carga excede o limite");
        }
        this.pesoCargaAtual = peso;
    }

    @Override
    public double calcularConsumo(double distancia) {
        return(distancia * 0.5) + (pesoCargaAtual*0.2);
    }
}
