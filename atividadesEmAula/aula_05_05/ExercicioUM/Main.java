package atividadesEmAula.aula_05_05.ExercicioUM;

public class Main {
    public static void main(String[] args) {
        VooComercial voo = new VooComercial("A1010", "Porto Alegre");

        try {
            voo.reservaAssento(8); // Reserva o assento 8
            voo.reservaAssento(8); // ERRO: Assento já ocupado
        } catch (AssentoOcupadoException e) {
            System.out.println("Erro ao reservar este assento:" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            voo.reservaAssento(101);//ERRPO: Assento inválido
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        }
    }
}
