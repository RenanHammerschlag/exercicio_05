//1. Faça um programa para solicitar o nome e a idade de uma pessoa.
//Se sua idade for menor que 18 anos, escrever a mensagem: "É
//menor".

package control;
import java.util.Scanner;
public class main_class {
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Digite sua idade: ");
//		int idade = sc.nextInt();
//		
//		if(idade < 18) {
//			System.out.println("É menor");
//		}else {
//			System.out.println("É maior");
//		}
//		sc.close();
//	}
	
//	2. Crie um programa para solicitar o ano atual e o ano de
//	nascimento de uma pessoa. Calcular sua idade aproximada e
//	informá-la. Se sua idade for inferior a 16 anos, escrever a
//	mensagem "Não pode votar"; caso contrário, emitir a mensagem
//	"É eleitor".
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Ano atual: ");
//		int ano_Atual = sc.nextInt();
//		
//		System.out.print("Ano de nascimento: ");
//		int ano_Nasc = sc.nextInt();
//		
//		int idade = ano_Atual - ano_Nasc;
//		
//		if(idade < 16) {
//			System.out.println(idade);
//			System.out.println("Não pode votar");
//		}else {
//			System.out.println(idade);
//			System.out.println("É eleitor");
//		}
//		sc.close();
//	}
	
//	3. Faça um programa para solicitar o nome e as duas notas e um
//	aluno. Calcular sua média e informá-la. Se ela for inferior a
//	7, escrever "Reprovado”; caso contrário escrever "Aprovado".
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Nome: ");
//		String nome_Aluno = new String();
//		nome_Aluno = sc.next();
//		
//		System.out.print("Nota 1: ");
//		double nota_1 = sc.nextDouble();
//		
//		System.out.print("Nota 2: ");
//		double nota_2 = sc.nextDouble();
//		
//		double media = (nota_1 + nota_2) /2;
//		
//		System.out.println("Nome: "+nome_Aluno);
//		if(media < 7) {
//			System.out.println("Nota: "+ media +" Reprovado! ");
//		}else {
//			System.out.println("Nota: "+ media + " Aprovado");
//		}
//		sc.close();
//	}
	
//	4. Elabore um programa para solicitar o nome, o sexo e o salário
//	bruto de um empregado. Se o seu sexo for masculino, descontar
//	5% de seu salário; caso contrário, descontar 3%. Informar o
//	valor do desconto e o salário líquido.
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Nome: ");
//		String nome = new String();
//		nome = sc.next();
//		
//		System.out.print("Sexo: ");
//		String sexo = new String();
//		sexo = sc.next();
//		
//		System.out.print("Salario bruto:");
//		double salario = sc.nextDouble();
//		
//		if(sexo.equalsIgnoreCase("Masculino")) {
//			double desconto_Masc =  salario * 0.05;
//			double salario_liquido_Masc = salario - desconto_Masc;
//			System.out.println("Nome: "+nome);
//			System.out.println("Seu salario liquido: "+salario_liquido_Masc);
//		}else if(sexo.equalsIgnoreCase("feminino")) {
//			double desconto_Fem =  salario * 0.03;
//			double salario_liquido_Fem = salario - desconto_Fem;
//			System.out.println("Nome: "+nome);
//			System.out.println("Seu salario liquido: "+salario_liquido_Fem);
//		}
//		
//		sc.close();
//	}

	
//	5. Faça um programa que leia dois números e mostre qual o maior
//	dos dois. O programa deve informar caso sejam iguais.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite dois numeros: ");
		int num_1 = sc.nextInt(), num_2 = sc.nextInt();
		
		if(num_1 > num_2) {
			System.out.println("Primeiro é maior");
		}else if(num_2 > num_1) {
			System.out.println("Sefundo é maior");
		}else if(num_1 == num_2) {
			System.out.println("São iguais");
		}

		
		sc.close();
	}
}

