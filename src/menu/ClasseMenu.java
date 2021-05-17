package menu;

import java.util.Scanner;

import classecalculadora.Calculadora;

public class ClasseMenu {
 public void executarMenu() {
	 
	 Scanner tc = new Scanner(System.in);
		Calculadora calculo =new Calculadora();
		System.out.println("====================");
		System.out.println("CALCULADORA FUCTURA");
		System.out.println("====================");
		System.out.println();
		int opcao;
		while(true) {
		System.out.println("~~~~~~~~~~~~~~~~");
		System.out.printf("Digite uma opção:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
		System.out.println("~~~~~~~~~~~~~~~~");
		opcao = tc.nextInt();
		System.out.printf("VOCÊ ESCOLHEU A OPCÃO %d\n", opcao);
		while(opcao<1||opcao>7) {
			System.out.println("Opção Inválida!!!");
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.printf("Digite uma opção:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
			System.out.println("~~~~~~~~~~~~~~~~");
			opcao = tc.nextInt();
			
		}
		if(opcao==7) {
			System.out.println("VOCÊ ESCOLHEU OPÇÃO SAIR. ");
			System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA FUCTURA!ATÉ A PROXIMA!");
			break;
		}
		switch(opcao) {
		case 1:
			calculo.soma();
		break;
		case 2:
			calculo.subtraçao();
			break;
		case 3:
			calculo.multiplicaçao();
			break;
		case 4:
			calculo.divisao();
		case 5:
			calculo.raizq();
			break;
		case 6:
			calculo.pot();
			break;
			
		}
		
		
		
		
		
		}
	 
 }
	 
 }
	

