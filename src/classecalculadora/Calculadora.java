package classecalculadora;

import java.util.Scanner;

public class Calculadora {
	Scanner tc=new Scanner(System.in);
	//Atributos:
	public int num1, num2;
	public double resultado;
	
	// m�todos:
	
	public void soma() {
		solicita2Numeros();
		resultado= num1 +num2;
		imprimaResultado();
		
	}
	public void subtra�ao() {
		solicita2Numeros();
		resultado=num1 - num2;
		imprimaResultado();
	}
	public void multiplica�ao() {
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
			 System.out.println(" � PAR");
		}else {
			System.out.println("� IMPAR");
		}if (resultado%3==0) {
			System.out.println("� DIVIS�VEL por 3!");
		}else {
			System.out.println("N�O � DIVISIVEL por 3!");
	
		}
		}
		public void solicita2Numeros() {
			System.out.println("Digite o primeiro n�mero:");
			 num1 = tc.nextInt();
			System.out.println("Digite o segundo n�mero:");
			 num2=tc.nextInt();
		
		}public void solicita1Numero() {
			System.out.println("Digite o n�mero:");
			num1 =tc.nextInt();
		
			
		}public void imprimaResultado() {
			System.out.println("O Resultado �: " + resultado);
			verifiqueSeParOuImparSeDivisivelPor3();
			
		
			
		}
			
		}



	






