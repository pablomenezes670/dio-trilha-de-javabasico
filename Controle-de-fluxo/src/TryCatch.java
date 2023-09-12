import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu Sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua Altura");
        double altura = scanner.nextDouble();

        System.out.println("Digite sua Idade");
        int idade = scanner.nextInt();

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

        }
        catch(java.util.InputMismatchException e){
            System.err.println("O Campos idade e altura precisa ser numericos !!!");

        }
        
        
    }

    
}