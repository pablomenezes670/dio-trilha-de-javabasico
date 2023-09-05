
//Estrutura condicionais ternario

public class ResultadoEscolar3 {
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String Resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(Resultado);
    }
}
