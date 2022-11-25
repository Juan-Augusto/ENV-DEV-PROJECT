package main;

import java.util.Scanner;

import util.Calculadora;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		Scanner scanner = new Scanner(System.in);
		
		int opcao = -1;
		
		double numeroA, numeroB = 0;
		while (true) {
			System.out.print("Digite uma opção (1-soma, 2-subtracao, 3-divisao, 4-multiplicacao, 5-exponencial, 6-raiz quadrada, 7-piso, 8-teto, 0-sair): ");
			opcao = scanner.nextInt();
			
			if(opcao == 0)
				break;
			
			System.out.print("Digite o primeiro numero: ");
			numeroA = scanner.nextDouble();
			if(opcao < 6) {
				System.out.print("Digite o segundo numero: ");
				numeroB = scanner.nextDouble();
			}
			
			switch (opcao) {
			case 1:{
				System.out.println(calculadora.soma(numeroA, numeroB));
				break;
			}
			case 2:{
				System.out.println(calculadora.subtracao(numeroA, numeroB));
				break;
			}
			case 3:{
				System.out.println(calculadora.divisao(numeroA, numeroB));
				break;
			}
			case 4:{
				System.out.println(calculadora.multiplicacao(numeroA, numeroB));
				break;
			}
			case 5:{
				System.out.println(calculadora.exponencial(numeroA, numeroB));
				break;
			}
			case 6:{
				System.out.println(calculadora.raiz_quadrada(numeroA));
				break;
			}
			case 7:{
				System.out.println(calculadora.piso(numeroA));
				break;
			}
			case 8:{
				System.out.println(calculadora.teto(numeroA));
				break;
			}
			default:
				System.out.println("Digite um número entre 0 e 4");
				break;
			}
		}
		
		scanner.close();
	}

}
