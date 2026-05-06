package atividadesEmAula.aula_05_05.ExercicioDOIS;

public class PratoPrincipal extends ItemCardapio {
    private int tempoPreparo; // em minutos

    public PratoPrincipal(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase);
        this.tempoPreparo = tempoPreparo;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
