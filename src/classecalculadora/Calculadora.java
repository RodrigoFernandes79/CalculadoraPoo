package classecalculadora;

import java.util.Scanner;

public class Calculadora {
	Scanner tc=new Scanner(System.in);
	//Atributos:
	public int num1, num2;
	public double resultado;
	
	// métodos:
	
	public void soma() {
		solicita2Numeros();
		resultado= num1 +num2;
		imprimaResultado();
		
	}
	public void subtraçao() {
		solicita2Numeros();
		resultado=num1 - num2;
		imprimaResultado();
	}
	public void multiplicaçao() {
		solicita2Numeros();
		resultado=num1*num2;
		imprimaResultado();
		
	}

	public void divisao() {
		solicita2Numeros();
		resultado=num1/num2;
		imprimaResultado();
	}
	public void raizq() {
		solicita1Numero();
		 resultado=Math.sqrt(num1);
		 imprimaResultado();
		}
	public void pot() {
		solicita2Numeros();
		 resultado=Math.pow(num1,num2);
		 imprimaResultado();
	}
	public void verifiqueSeParOuImparSeDivisivelPor3() {
		if(resultado%2==0) {
			 System.out.println(" É PAR");
		}else {
			System.out.println("É IMPAR");
		}if (resultado%3==0) {
			System.out.println("É DIVISÍVEL por 3!");
		}else {
			System.out.println("NÃO É DIVISIVEL por 3!");
	
		}
		}
		public void solicita2Numeros() {
			System.out.println("Digite o primeiro número:");
			 num1 = tc.nextInt();
			System.out.println("Digite o segundo número:");
			 num2=tc.nextInt();
		
		}public void solicita1Numero() {
			System.out.println("Digite o número:");
			num1 =tc.nextInt();
		
			
		}public void imprimaResultado() {
			System.out.println("O Resultado é: " + resultado);
			verifiqueSeParOuImparSeDivisivelPor3();
			
		
			
		}
			
		}



	






