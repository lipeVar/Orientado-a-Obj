package atividadesEmAula.aula_05_05.ExercicioDOIS;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemCardapio> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public double fechaConta() {
        double total = 0;
        for(ItemCardapio item : itens) {
            total += item.calcularPrecoFinal();
        }
        return total;
    }
}
