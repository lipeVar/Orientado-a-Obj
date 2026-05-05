package Desafios.aula_28_04.exercicioUm;

public class NaveCombate extends NaveEspacial{
    private int numeroArmas;
    private boolean escudoAtivado;

    public NaveCombate(String id, double combMax, double vel, int numeroArmas, boolean escudoAtivado) {
        super(id, combMax, vel);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia*0.8;

        if(escudoAtivado) {
            consumo*=1.15;
        }
        return consumo;
    }
}
