package candidatura;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

public static void main(String[] args) {
		String [ ] candidatos = {"FELIPE", "LETICIA", "JOÃO", "NETO", "LUCAS"};
		for (String candidato : candidatos) {
			entrandoEmContato(candidato);
			
			
		}
	
	
}
      static void entrandoEmContato (String candidato) {
    	  int tentativasRealizadas = 1;
    	  boolean continuarTentando = true;
    	  boolean atendeu = false;
    	  do {
    		  atendeu = atender();
    		  continuarTentando = !atendeu;
    		  if (continuarTentando)
    			  tentativasRealizadas++;
    		  else
    			  System.out.println("CONTATO REALIZADO COM SUCESSO");
    		  
    		  
    	  }while (continuarTentando && tentativasRealizadas < 3);
    	  
    	  if(atendeu)
    		  System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA ");
    	  else
    		  System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + "NUMERO MAXIMO DE TENTATIVA " + tentativasRealizadas + "REALIZADA");
    	  
      }
      static boolean atender() {
    	  return new Random().nextInt(3)==1;
      }
      

	  static void imprimirSelecionados () {
		  String [ ] candidatos = {"FELIPE", "LETICIA", "JOÃO", "NETO", "LUCAS"};
		  System.out.println("Imprimindo a lista de candidatoos informando o indice do elemento");
		  
		  for(int indice = 0; indice < candidatos.length; indice++) {
			  System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice] );
		  }
		  for(String candidato : candidatos) {
			  System.out.println("O candidato selecionado foi " + candidato);
		  }
	
}

	  static void selecaoCandidatos () {
		  String [] candidatos = {"FELIPE", "LETICIA", "JÃO", "NETO", "LUCAS", "MIRELA", "FERNANDA", "MARIA", "MAYLA", "MAITE"};
	  
		  int candidatosSelecionados = 0;
		  int candidatosAtual = 0;
		  double salarioBase = 2000.0;
		  while( candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
		  String candidato = candidatos [candidatosAtual];
		  double salarioPretendido = valorPretendido();
		  
		  
		  System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
		  if (salarioBase >= salarioPretendido) {
			  System.out.println("O candidato " + candidato + " foi selecionado para vaga");
			  candidatosSelecionados++;
		  }
		  candidatosAtual++;
		  
	  }
  }
	  static double valorPretendido (){
	  return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);

	  
  }
	  static void analisarCndidato (double salarioPretendido) {
		  double salarioBase = 2000.0;
		  if (salarioPretendido < salarioBase) {
			  System.out.println("LIGAR PARA CANDIDATO");
		  }else if(salarioBase == salarioPretendido) {
	   		  System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPROSTA");
   }
		  else {
			  System.out.println("AGUARDAR PROPROSTA DO DEMAIS CANDIDATOS");


		  }
	  }
	}