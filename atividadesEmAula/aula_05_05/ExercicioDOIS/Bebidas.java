package atividadesEmAula.aula_05_05.ExercicioDOIS;

public class Bebidas extends ItemCardapio{
    private boolean isAlcoolica;

    public Bebidas(String nome, double precoBase, boolean isAlcoolica) {
        super(nome, precoBase);
        this.isAlcoolica = isAlcoolica;
    }

    @Override
    public double calcularPrecoFinal() {
        if(isAlcoolica) {
            return getPrecoBase() * 1.10; // 10% de acréscimo para bebidas alcoólicas
        }
        return getPrecoBase();
    }
}
