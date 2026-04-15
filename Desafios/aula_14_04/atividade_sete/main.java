package Desafios.aula_14_04.atividade_sete;

import java.util.InputMismatchException;
import java.util.Scanner;

class paciente {
    public String getPlanoSaude() {
        return "Plano de Saúde: Premium Plus Ultra";
    }
}

public class main {
        //método para cadastrar paciente
        public void cadastrarPaciente() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("-----SISTEMA HOSPITALAR DO HOSPITAL-----");
            System.out.println("Digite o nome do paciente:");
            String nome = scanner.nextLine();

            
        //validação caso o nome seja vazio ou nulo
            if(nome == null || nome.trim().isEmpty()) {
                throw new NullPointerException("O nome do paciente não pode estar vazio...");
            }

            System.out.println("Digite o PESO do paciente:");
            float peso = scanner.nextFloat();

            //validação caso seja negativo
            if(peso <= 0) {
                throw new InputMismatchException("O peso do paciente deve ser um valor positivo..."); 
            }

            System.out.println("Paciente cadastrado com sucesso!");
            System.out.println("O nome do paciente é: " + nome + " e o peso dele é: " + peso + "Kg");
            
            /* try {
                //simulando falha NullPointerException
                String nomeVazio = null;
                if(nomeVazio == null) {
                    throw new NullPointerException("O nome do paciente não pode ser nulo...");
                }
            } catch (NullPointerException | InputMismatchException e) {
                System.out.println("Erro de entrada de dados");
                System.out.println("Por favor preencha a ficha novamente..." + e.getClass().getSimpleName()); 
            
            } catch (Exception e) {
                System.out.println("Erro critico, contatee a TI." + e.getMessage());
            }

            //Teste de falha de banco de dados
            try {
                // paciente que n foi encontrsdo no banco
                paciente pacienteBanco = null;
                
                System.out.println("Buscando plano de saúde do paciente...");
                String plano = pacienteBanco.getPlanoSaude();

                System.out.println("Plano de Saúde:" + plano);
            } catch (NullPointerException e) {
                System.out.println("ALERTA DE FALHA DE SEGURANÇA!");
            } */
        }
            
        public static void main(String[] args) {
            main hospital = new main();

            try {
                hospital.cadastrarPaciente();

                //catch para os erros
            } catch (NullPointerException e) {
                System.out.println("Erro de cadastro: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Erro de digitação: Você deve inserir um número válido para o peso do paciente. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro no Sistema do Hospital: " + e.getMessage());
            }

        } 
}
