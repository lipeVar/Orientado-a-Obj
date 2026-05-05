package Desafios._28_04.exercicioDoisContinuacao;

public class Administrativo extends FuncionarioHospital {

    private String departamento;
    private boolean cargoDeGestao;

    public Administrativo(String nome, String matricula, double salarioBase,
                          String departamento, boolean cargoDeGestao) {
        super(nome, matricula, salarioBase);
        this.departamento = departamento;
        this.cargoDeGestao = cargoDeGestao;
    }

    @Override
    public double calcularSalarioFinal() {
        double salario = getSalarioBase();

        if (cargoDeGestao) {
            salario += 1500;
        }

        return salario;
    }
}
