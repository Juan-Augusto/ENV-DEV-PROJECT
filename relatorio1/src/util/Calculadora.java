package util;

public class Calculadora {
	public double soma(double numeroA, double numeroB) {
		return numeroA + numeroB;
	}

	public double subtracao(double numeroA, double numeroB) {
		return numeroA - numeroB;
	}

	public double divisao(double numeroA, double numeroB) {
		if (numeroB == 0) {
			System.out.println("Impossível realizar uma divisão por zero");
		} else {
			return numeroA / numeroB;
		}
		return numeroA / numeroB;
	}

	public double multiplicacao(double numeroA, double numeroB) {
		return numeroA * numeroB;
	}

	public double exponencial(double numeroA, double numeroB) {
		return Math.pow(numeroA, numeroB);
	}

	public double raiz_quadrada(double numeroA) {
		if (numeroA < 0) {
			System.out.println("Impossível encontrar a raiz quadrada de um número negativo");
		} else {
			return Math.sqrt(numeroA);
		}
		return numeroA;
	}

	public double piso(double numeroA) {
		return Math.floor(numeroA);
	}

	public double teto(double numeroA) {
		return Math.ceil(numeroA);
	}

}
