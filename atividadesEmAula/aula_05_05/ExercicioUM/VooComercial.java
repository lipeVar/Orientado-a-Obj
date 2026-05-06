package atividadesEmAula.aula_05_05.ExercicioUM;

public class VooComercial {
    private String numeroVoo;
    private String destino;
    private boolean[] assentos;
    
    // Construtor
    public VooComercial(String numeroVoo, String destino) {
        this.numeroVoo = numeroVoo;
        this.destino = destino;
        this.assentos = new boolean[100]; // todos começam como disponíveis (false)
    }

    // getters
    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getDestino() {
        return destino;
    }

    // Método para reservar um assento
    public void reservaAssento(int numeroAssento) throws AssentoOcupadoException {
        if(numeroAssento < 1 || numeroAssento > 100) {
            throw new IllegalArgumentException("Assento inválido. Escolha um número entre 1 e 100.");
        }

        // ajuste para índice do array (0-99)
        int indice = numeroAssento - 1;
        if (assentos[indice]) {
            throw new AssentoOcupadoException("Assento " + numeroAssento + " ja esta ocupado.");
        }

        // Reserva o assento
        assentos[indice] = true;
        System.out.println("Assento" + numeroAssento + " Reservado com sucesso!");
    }
}
