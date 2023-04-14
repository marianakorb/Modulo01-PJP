package exercicios;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int valor[] = new int[15];
		
		   System.out.print("Digite o 1º valor: ");  
		    valor[0] = sc.nextInt();  
		    int menor = valor[0]; int maior = valor[0];

		    for(int i = 1; i < valor.length; i++){  
		        System.out.print("Digite o " +(i+1)+"º valor: ");  
		        valor[i] = sc.nextInt();  
		        if(valor[i] > maior){   
		            maior = valor[i];  
		        }  
		    }  
		    for (int j = 1; j < valor.length; j++) {  
		        if(valor[j] < menor){  
		            menor = valor[j];  
		        }
		    }
		    
		    System.out.println("Maior valor = "+ maior);
			System.out.println("Menor valor = "+ menor);
		    sc.close(); 
	}
}
