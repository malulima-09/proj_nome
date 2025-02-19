package projetos_LPA.aula04;

import java.util.Scanner;

public class ativ_aula4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	//Variáveis 
	 double horatrab,valorhora,salbruto,salliquido ,inss;
	
	// Instaciar classe Scanner
	Scanner ler = new Scanner(System.in);
	
    //Entrada de dados 
	
	System.out.println("informe valorhora :");
	horatrab = ler.nextDouble();

	System.out.println("informe o valor de horatrab :");
	valorhora = ler.nextDouble();

	// Processamento
	salbruto = horatrab * valorhora;
	inss = salbruto * 0.12 ;
	salliquido= salbruto - inss; 
	
	// Saída
	System.out.println("o valor do salbruto é : " + salbruto);
	System.out.println("o valor do salliquido é: " + salliquido);
    
	}

}
