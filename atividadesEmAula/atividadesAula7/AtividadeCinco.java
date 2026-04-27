package atividadesAula7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AtividadeCinco {
    public static void lerProjeto() throws IOException {
        BufferedReader leitor = new BufferedReader(new FileReader("projeto_mesa.txt"));
        String linha;

        while ((linha = leitor.readLine()) != null) {
            System.out.println(linha);
        }
        leitor.close();
    }
    public static void main(String[] args) {
        try {
            lerProjeto();
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            System.out.println("Limpando a bancada e desligando as maquinas...");
        }
    }
}
