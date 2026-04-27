package atividadesAula7;
import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero:");
            int num1 = teclado.nextInt();
            System.out.println("Digite o segundo numero:");
            int num2 = teclado.nextInt();
            int resultado = num1 / num2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro Matematico: Impossivel dividir por zero...");
        }
        teclado.close();
    }
}
