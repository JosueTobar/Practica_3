package calculadora;

import java.util.Scanner;

public class Vista {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String num1 = "", num2 = "";
		Integer menu = 0;
		do {
		System.out.println("----- CALCULADORA --------");
		System.out.println("Sumar       ------------: 1");
		System.out.println("Restar      ------------: 2");
		System.out.println("Multiplicar ------------: 3");
		System.out.println("Dividir     ------------: 4");
		System.out.println("Salir       ------------: 0"); 
		menu = leer.nextInt();
		
			do {
				System.out.print("Ingrese primer  valor : ");
				num1 = leer.next();	
			}while(Calculadora.validar(num1)!=true);
			
		     do {
					System.out.print("Ingrese segundo valor : ");
					num2 = leer.next(); 
		     }while(Calculadora.validar(num2)!=true);
				
			System.out.println("-------------------------");
		
		switch (menu) {
		case 1:
			System.out.println("Total----------------:"+Calculadora.sumar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
			break;
		case 2:
			 System.out.println("Total----------------:"+Calculadora.restar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
			break;
		case 3:
			 System.out.println("Total----------------:"+Calculadora.multiplicar(Double.parseDouble(num1) ,Double.parseDouble(num2)));
			break;
		case 4:
			if(Double.parseDouble(num2) != 0 ) {
				System.out.println("Total----------------:"+Calculadora.dividir(Double.parseDouble(num1) ,Double.parseDouble(num2)));
			}else {
				System.err.print("No se puede dividir entre 0");
			}
			 
			break;

		default:
			break;
		}
		}while(menu != 0);
	}

}
