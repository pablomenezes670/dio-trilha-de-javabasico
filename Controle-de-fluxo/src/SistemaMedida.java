public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "G";

        switch (medida){
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinida");
        }
    }
}
