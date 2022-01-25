package one.digitalInnovation.basecamp;

import one.digitalinnovation.basecamp.Quadrilatero;

public class Main {

	public static void main(String[] args) {
		//Calculadora
		System.out.println("Exercicio calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7, 8);
		Calculadora.divisao(5, 2.5);
		
		//Mensagem
		System.out.println();
		System.out.println("Exercicio mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(1);
		
		//Emprestimo
		System.out.println();
		System.out.println("Exercicio Emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000,5);
		
		
		//Quadrilatero
		System.out.println("Exercicio quadrilatero");
		Quadrilatero.area(3);
		Quadrilatero.area(5,5);
		Quadrilatero.area(7, 8, 9);
		
		
		
		
		
		
		
	}
	
}
