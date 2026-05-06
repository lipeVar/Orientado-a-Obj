package atividadesEmAula.aula_05_05.ExercicioDOIS;

public abstract class ItemCardapio {
    private String nome;
    private double precoBase;

    public ItemCardapio(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPrecoFinal();
}
