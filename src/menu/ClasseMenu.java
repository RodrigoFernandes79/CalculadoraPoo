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
		System.out.printf("Digite uma op��o:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
		System.out.println("~~~~~~~~~~~~~~~~");
		opcao = tc.nextInt();
		System.out.printf("VOC� ESCOLHEU A OPC�O %d\n", opcao);
		while(opcao<1||opcao>7) {
			System.out.println("Op��o Inv�lida!!!");
			System.out.println("~~~~~~~~~~~~~~~~");
			System.out.printf("Digite uma op��o:\n1-SOMAR\n2-SUBTRAIR\n3-MULTIPLICAR\n4-DIVIDIR\n5-RAIZ QUADRADA\n6-POTENCIA\n7-SAIR\n");
			System.out.println("~~~~~~~~~~~~~~~~");
			opcao = tc.nextInt();
			
		}
		if(opcao==7) {
			System.out.println("VOC� ESCOLHEU OP��O SAIR. ");
			System.out.println("OBRIGADO POR UTILIZAR A CALCULADORA FUCTURA!AT� A PROXIMA!");
			break;
		}
		switch(opcao) {
		case 1:
			calculo.soma();
		break;
		case 2:
			calculo.subtra�ao();
			break;
		case 3:
			calculo.multiplica�ao();
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
	

