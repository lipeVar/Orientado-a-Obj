package Desafios.aula_28_04.exercicioUm;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<NaveEspacial> naves = new ArrayList<>();

        NaveCargueiro cargueiro = new NaveCargueiro("C1", 5000, 1000, 1000);
        cargueiro.setPesoCargaAtual(500);

        NaveCombate combate = new NaveCombate("F1", 3000, 2000, 10, true);

        NaveExploracao exploracao = new NaveExploracao("E1", 4000, 1500, true);

        naves.add(cargueiro);
        naves.add(combate);
        naves.add(exploracao);

        //teste de encapsulamento
        try{
            cargueiro.setCombustivelAtual(6000);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        //teste polimorfismo
        for(NaveEspacial nave:naves) {
            try{
                System.out.println("Tipo: " + nave.getClass().getSimpleName());
                nave.viajar(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
