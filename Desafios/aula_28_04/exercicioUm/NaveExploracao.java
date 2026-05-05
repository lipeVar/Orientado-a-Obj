package Desafios.aula_28_04.exercicioUm;

public class NaveExploracao extends NaveEspacial{
    private boolean sensoresAvancados;

    public NaveExploracao(String id, double combMax, double vel, boolean sensoresAvancados){
        super(id, combMax, vel);
        this.sensoresAvancados = sensoresAvancados;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia*0.3;

        if(sensoresAvancados) {
            consumo+=50;
        }

        return consumo;
    }
}
