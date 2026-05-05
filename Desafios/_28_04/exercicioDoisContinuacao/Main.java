package Desafios._28_04.exercicioDoisContinuacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<FuncionarioHospital> lista = new ArrayList<>();

        Medico m = new Medico("João", "001", 5000, "Cirurgião", 1000, 5);
        Enfermeiro e = new Enfermeiro("Maria", "002", 3000, "UTI", 0.40);
        Administrativo a = new Administrativo("Carlos", "003", 2000, "RH", true);

        e.setHorasTrabalhadasMensais(180);

        lista.add(m);
        lista.add(e);
        lista.add(a);

        // Testes de erro
        try {
            a.setSalarioBase(900);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            e.setPercentualInsalubridade(0.99);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            m.setHorasTrabalhadasMensais(400);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        // Polimorfismo
        for (FuncionarioHospital f : lista) {
            f.exibirResumoMensal();
        }
    }
}
