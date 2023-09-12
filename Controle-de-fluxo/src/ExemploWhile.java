import java.util.concurrent.ThreadLocalRandom;;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
            double valorDoces = ValorAleatorio();
            if(valorDoces > mesada)
            valorDoces = mesada;

            System.out.println("Doce do valor: " + valorDoces + " Adicionado ao carinho");
            mesada = mesada - valorDoces;
        }
            System.out.println("Mesada: " + mesada);
            System.out.println("Joãozinho gastou tudo...");
    }

    private static double ValorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
