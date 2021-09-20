package aplicatiton;

import java.util.Scanner;

import entities.Media;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Media a = new Media();
		Media b = new Media();
		
		System.out.println("Informe o primeiro aluno: ");
		a.aluno = sc.nextLine();
		
		System.out.println("Informe a primeira nota de " + a.aluno );
		a.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota de " + a.aluno );
		a.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota de " + a.aluno );
		a.nota3 = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Informe o segundo aluno: ");
		b.aluno = sc.nextLine();
		
		System.out.println("Informe a primeira nota de " + b.aluno );
		b.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota de " + b.aluno );
		b.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota de " + b.aluno );
		b.nota3 = sc.nextDouble();
		
		double nota1 = a.notaFinal();
		double nota2 = b.notaFinal();
		
		System.out.println("Nota final de " + a.aluno + ": " + nota1);
		System.out.println("Nota final de " + b.aluno + ": " + nota2);
		
		if (nota1 >= 60) {
			System.out.println(a.aluno + " APROVADO");
		}else {
			System.out.println(a.aluno + " REPROVADO");
		}
		
		if (nota2 >= 60) {
			System.out.println(b.aluno + " APROVADO");
		}else {
			System.out.println(b.aluno + " REPROVADO");
		}
		
		sc.close();
		
	}

}
