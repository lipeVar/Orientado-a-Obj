package Desafios.aula_28_04.exercicioDois;

public class funcionarioHospital {
    private String nome;
    private String matricula;
    private double salBase;
    private int trabalhoMensal;

    public funcionarioHospital(String nome, String matricula, double salBase) {
        this.nome = nome;
        this.matricula = matricula;
        setSalBase(salBase);
        this.trabalhoMensal = 0;
    }

    public void setSalBase(double salBase) {
        if(salBase < 1412) {
            throw new ValorInvalidoException("Salario Base Invalido!");
        }
        this.salBase = salBase;
    }

    public void setTrabalhoMensal(itn horas) {
        if(horas<0 || horas> 300) {
            throw new = ValorInvalidoException("Carga horario invalido");
        }
        
    }
}
