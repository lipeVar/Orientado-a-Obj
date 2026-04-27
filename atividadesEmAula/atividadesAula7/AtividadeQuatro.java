package atividadesAula7;

import java.util.Scanner;

public class AtividadeQuatro {
    Scanner teclado = new Scanner(System.in);
    private class Catraca {
        public void validarIngresso(int idade, boolean isSocio) {
            System.out.println("Qual é a sua idade? ");
            int idade1 = teclado.nextInt();

            System.out.println("Você é sócio?");
            boolean isSocio1 = teclado.nextBoolean();

            System.out.println("Você esta acompanhado?(S/N) ");
            String acompanhado = teclado.next();
            if (idade1 < 18 && !isSocio1&& acompanhado.equalsIgnoreCase("N")) {
                throw new IllegalArgumentException("Acesso negado: Menores não sócios devem estar acompanhados para entrar.");
            } else {
                System.out.println("Acesso permitido: Bom Jogo!");
            }
        }
    }
    public static void main(String[] args) {
        AtividadeQuatro atividade = new AtividadeQuatro();
        Catraca catraca = atividade.new Catraca();
        try {
            catraca.validarIngresso(0, false);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
