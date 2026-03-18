import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos carros você deseja: ");
        int resp = teclado.nextInt();
        teclado.nextLine();

        Carro[] carros = new Carro[resp];
        
        for(int i = 0; i < resp; i++) {
            carros[i] = new Carro();

            System.out.println("========Carro " + (i+1) + "==========");

            System.out.println("Digite a marca do " + (i+1) + "° carro: ");
            carros[i].marca = teclado.nextLine();

            System.out.println("Digite o modelo do " + (i+1) + "° carro: ");
            carros[i].modelo = teclado.nextLine();

            while (true) {
                System.out.println("Digite o ano de fabricação do " + (i+1) + "° carro: ");

                if(teclado.hasNextInt()) {
                    carros[i].anoFabricacao = teclado.nextInt();
                    teclado.nextLine();
                    break;
                } else {
                    System.out.println("Digite um ano Valido!!");
                    teclado.nextLine();
                }
                    
            }
            
            
        }

        for(int i = 0; i < resp; i++) {
            System.out.println(" ");
            System.out.println("=======DADOS DO CARRO " + (i+1) +"=======");

            System.out.println("Marca: " + carros[i].marca);
            System.out.println("Modelo: " + carros[i].modelo);
            System.out.println("Ano de Fabricação: " + carros[i].anoFabricacao);
        }
        

        teclado.close();
    }
}
