import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

            int conta = 1021;
            String agencia = "067-8";
            String nomeCliente = "MARIO ADRADE";
            double saldo = 237.48;



            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite conta do Usuario : ");
            int dados = scanner.nextInt();


        if(dados == conta){

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");

        }else{

            System.out.println("Nenhum usuario encontrado com essa conta...");

        }
           
         

    }
}
