package atividadesAula7;

import java.util.Scanner;

public class AtividadeSeis {
    private class AlimentadorPet {
        public void liberarRacao(int quantidadeGramas) {
            int maximaTigela = 100;
            if (quantidadeGramas < 0) {
                throw new IllegalArgumentException("Quantidade de ração não pode ser negativa.");
            }
            if (quantidadeGramas > maximaTigela) {
                throw new IllegalStateException("A tigela vai transbordar");
            }
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a quantidade de ração em gramas: ");
            int quantidadeGramas = teclado.nextInt();

            try {
                liberarRacao(quantidadeGramas);
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (IllegalStateException e) {
                System.out.println("Erro: " + e.getMessage());
            }
            teclado.close();
        }
    }
}
