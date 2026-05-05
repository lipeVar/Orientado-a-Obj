package Desafios._28_04.exercicioTres;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<MaquinaIndustrial> maquinas = new ArrayList<>();

        InjetoraPlastico injetora = new InjetoraPlastico("INJ-01");
        BracoRoboticoMontagem robo = new BracoRoboticoMontagem("ROB-01");
        PrensaHidraulica prensa = new PrensaHidraulica("PRE-01");

        maquinas.add(injetora);
        maquinas.add(robo);
        maquinas.add(prensa);

        // abastecer
        injetora.abastecerPlastico(10);

        // tentar produzir desligado
        for (MaquinaIndustrial m : maquinas) {
            try {
                m.produzirLote(60);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        // ligar máquinas
        for (MaquinaIndustrial m : maquinas) {
            m.ligar();
        }

        // produção real
        for (int i = 0; i < 3; i++) {
            for (MaquinaIndustrial m : maquinas) {
                try {
                    m.produzirLote(40);
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: " + e.getMessage());
                } catch (EquipamentoDescalibradoException e) {
                    System.out.println("ALARME ROBÔ: " + e.getMessage());
                } catch (SuperaquecimentoException e) {
                    System.out.println("ALARME PRENSA: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        // relatório final
        for (MaquinaIndustrial m : maquinas) {
            System.out.println("\nMáquina: " + m.getNumeroSerie());
            System.out.println("Peças: " + m.getPecasProduzidasTotais());
            System.out.println("Energia: " + m.getEnergiaConsumidaKWh());
        }
    }
}
