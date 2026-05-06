package atividadesEmAula.aula_05_05.ExercicioDOIS;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        PratoPrincipal prato1 = new PratoPrincipal("Pizza de Calabresa", 75.00, 45);
        Bebidas bebida1 = new Bebidas("Stella 600", 12.00, true);

        PratoPrincipal prato2 = new PratoPrincipal("Lasanha", 60.00, 30);
        Bebidas bebida2 = new Bebidas("Coca Cola", 8.00, false);
        
        // Adicionando itens ao pedido
        pedido.adicionarItem(prato1);
        pedido.adicionarItem(bebida1);
        pedido.adicionarItem(prato2);
        pedido.adicionarItem(bebida2);

        // Fechando a conta
        double total = pedido.fechaConta();
        System.out.println("Total da conta: R$" + total);
    }
}
