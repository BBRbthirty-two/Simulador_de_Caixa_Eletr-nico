import java.util.Locale;
import java.util.Scanner;

public class Simulador_Caixa_Eletronico 
{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        int opcao;
        double valorDeposito, valorSaque;
        double saldo = 0.0;

        do {

            System.out.println("|    MENU DE OPÇÕES    |"); 
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Realizar Depósito");
            System.out.println("3 - Realizar Saque");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {

                System.out.println("Saldo: R$ " + saldo);

            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito: ");
                valorDeposito = entrada.nextDouble();
                saldo = saldo + valorDeposito;

                if (valorDeposito <= 0){
                    System.out.println("Valor inválido.");
                }


            } else if (opcao == 3) {    
                System.out.print("Quanto deseja sacar: ");
                valorSaque = entrada.nextDouble();
                if (valorSaque <= saldo) {
                    saldo = saldo - valorSaque;
                    System.out.println("Saque realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }

            } else if(opcao == 4) {
                System.out.println("Sistema Encerrado. Agradecemos por utilizar o caixa eletrônico.");
            } else{
                System.out.println("Opção inválida.");
            }
       } while (opcao != 4);
         entrada.close();
    }
}


    

