package atividadesAula7;

import java.util.Scanner;

public class atividadeTres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Digite sua idade: ");
            String idade = teclado.nextLine();
            
            int idadeInt = Integer.parseInt(idade);
            System.out.println("Sua idade é: " + idadeInt);

        } catch (NumberFormatException e) {
            System.out.println("Utilize apenas algarismos numericos para informar a idade.");
        }
        teclado.close();
    }
}
