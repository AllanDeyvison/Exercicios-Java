package Arrays;

import java.util.Scanner;

public class ExercicioDoisVetor {

	public ExercicioDoisVetor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		int [] vetor = new int [6];
		int somap=0,contim=0;
		String pares = "N�meros pares digitados: " ,impares = "N�meros �mpares digitados: ";
		
		for (int i=0;i<6;i++)
		{
			System.out.println("N�mero: ");
			vetor[i] = scanner.nextInt();
			
			if (vetor[i]%2==0)
			{ 
				
				pares = pares + vetor[i] + " ";
				somap = somap + vetor[i];
			}
			else
			{
				impares = impares +vetor[i] + " ";
				contim++;
			}
		}
		System.out.println(pares +"\n"+ impares);
		System.out.println("N�meros pares somados: "+somap);
		System.out.println("Quantidade de n�meros �mpares digitados: "+contim);

	}

}
