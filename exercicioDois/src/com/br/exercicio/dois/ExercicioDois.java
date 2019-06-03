package com.br.exercicio.dois;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		// Iniciando o scanner
		Scanner scan = new Scanner(System.in);
		
		// Input usuário
		System.out.println("Informe um número: ");
		int numeroInformado = scan.nextInt();
		
		System.out.println("Por onde quer iniciar a tabuada de " + numeroInformado + "?");
		int pontoPartida = scan.nextInt();
		
		System.out.println("Até que número você quer que a tabuada multiplique?");
		int pontoFinal = scan.nextInt();
		
		int multiplicador = pontoPartida;
		
		for (int contagem = multiplicador; contagem <= pontoFinal; contagem++) {
			int resultado = numeroInformado * contagem;
			System.out.println(numeroInformado + " x " + contagem + " = " + resultado);
			multiplicador++;
		}
		

	}

}
