package La�osdedecisao;

import java.util.Scanner;

public class imparraiz {
	
	public static void main (String[] args) {
		
		double num, raiz,nqua;
		Scanner ler = new Scanner (System.in); 
		
		System.out.println("N�mero: ");
		num =ler.nextDouble();
		
		if (num%2==0)
		{
		   raiz = Math.sqrt(num);
		   System.out.println("N�mero par.\nRaiz: "+raiz);
		}
		else
		{
			nqua = Math.pow(num,2);
			System.out.println("N�mero �mpar.\nN�mero elevado ao quadrado:"+nqua);
		}
	}

}
