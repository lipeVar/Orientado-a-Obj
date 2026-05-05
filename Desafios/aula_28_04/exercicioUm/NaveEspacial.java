package Desafios.aula_28_04.exercicioUm;

public abstract class NaveEspacial {
    private String identificador;
    private double combustivelMaximo;
    private double combustivelAtual;
    private double velocidadeBase;

    public NaveEspacial(String identificador, double combustivelMaximo, double velocidadeBase) {
        this.identificador = identificador;
        this.combustivelMaximo = combustivelMaximo;
        this.combustivelAtual = combustivelMaximo;
        this.velocidadeBase = velocidadeBase;
    }

    //getter e setter
    public String getIdentificador() {
        return identificador;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }

    public void setCombustivelAtual(double combustivelAtual) {
        if(combustivelAtual < 0 || combustivelAtual > combustivelMaximo) {
            throw new CombustivelInvalidoException("Valor de combustivel invalido");
        }
        this.combustivelAtual = combustivelAtual;
    }

    //Metodo abstrato
    public abstract double calcularConsumo(double distancia);

    //metodo concreto
    public void viajar(double distancia) throws CombustivelInsuficienteException {
        double consumo = calcularConsumo(distancia);

        if(consumo > combustivelAtual) {
            throw new CombustivelInsuficienteException("Combustivel Insuficiente");
        }
        combustivelAtual -= consumo;

        System.out.println("A nave " + identificador + " viajou " + distancia + " Anos-luz. Combustivel restante: " + combustivelAtual);
    }
}



