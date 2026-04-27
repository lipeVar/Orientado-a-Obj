package atividadesAula7;
import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            String[] notasMusicais = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
            System.out.println("Digite o número da nota musical (1 a 7):");
            int numeroNota = teclado.nextInt();
            if (numeroNota < 1 || numeroNota > 7) {
                throw new ArrayIndexOutOfBoundsException("O numero digitado deve estar entre 1 e 7...");
            }
            System.out.println("A nota musical correspondente é: " + notasMusicais[numeroNota - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        }
        teclado.close();
    }
}
