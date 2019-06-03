package com.br.exercicio.dois;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		// Iniciando o scanner
		Scanner scan = new Scanner(System.in);
		
		// Input usuário
		System.out.println("Informe um número: ");
		int numeroInformado = scan.nextInt();
		
		int multiplicador = 1;
		
		for (int contagem = 1; contagem <= 10; contagem++) {
			int resultado = numeroInformado * multiplicador;
			System.out.println(numeroInformado + " x " + multiplicador + " = " + resultado);
			multiplicador++;
		}

	}

}
