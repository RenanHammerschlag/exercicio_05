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
	
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);
		
	// 	System.out.print("Digite dois numeros: ");
	// 	int num_1 = sc.nextInt(), num_2 = sc.nextInt();
		
	// 	if(num_1 > num_2) {
	// 		System.out.println("Primeiro é maior");
	// 	}else if(num_2 > num_1) {
	// 		System.out.println("Sefundo é maior");
	// 	}else if(num_1 == num_2) {
	// 		System.out.println("São iguais");
	// 	}

		
	// 	sc.close();
	// }

//	6. Crie um programa para ler o valor do salário-mínimo, o nome e
//	o salário bruto de um empregado. Se o seu salário for menor
//	que um salário-mínimo descontar 2%; se for igual, descontar
//	5%, e se for superior, descontar 8%. Informar o valor do
//	desconto e o salário líquido.
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		double salario_minimo = 1320.00;
//		
//		System.out.print("Nome: ");
//		String nome = new String();
//		nome = sc.next();
//		
//		System.out.print("Slario bruto: ");
//		double salario_bruto = sc.nextDouble();
//		
//		if(salario_bruto < salario_minimo) {
//			double salarioMenor_ajuste= salario_bruto - (salario_bruto * 0.02);
//			System.out.println(salarioMenor_ajuste);
//		}else if(salario_bruto == salario_minimo) {
//			double salarioIgual_ajuste= salario_bruto-(salario_bruto*0.05);
//			System.out.println(salarioIgual_ajuste);
//		}else if(salario_bruto > salario_minimo) {
//			double salarioMaior_ajuste = salario_bruto - (salario_bruto*0.08);
//			System.out.println(salarioMaior_ajuste);
//		}
//		
//		sc.close();
//	}
//	
	
//	7. Elabore um programa que leia três números diferentes e informe
//	o maior deles.
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Digite 3 numeros: ");
//		int num_1 = sc.nextInt();
//		int num_2 = sc.nextInt();
//		int num_3 = sc.nextInt();
//		
//		if(num_1 > num_2 && num_1 > num_3) {
//			System.out.print("Num_1 é maior.");
//		}else if(num_2 > num_1 && num_2 > num_3) {
//			System.out.print("Num_2 é maior.");
//		}else if(num_3 > num_2 && num_3 > num_1) {
//			System.out.print("Num_3 é maior.");
//		}
//		sc.close();
//	}
	
//	8. Faça um programa que leia o código, a quantidade, o preço
//	unitário e a forma de pagamento (1 - Dinheiro, 2 - Pix, 3 -
//	Cartão débito, 4 - Cartão crédito) de um produto. Pagamentos
//	em dinheiro recebem um desconto de 10%, em cartão de débito 5%
//	em cartão de crédito 3% e em pix 12%. O programa deve informar
//	o valor do desconto e o valor final a pagar.
	
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.print("Codigo: ");
//		int cod = sc.nextInt();
//		
//		System.out.print("Quantidade: ");
//		int qtd = sc.nextInt();
//		
//		System.out.print("Preço: ");
//		double preco_unitario = sc.nextDouble();
//		
//		System.out.print("Forma de pagamento  (1 - Dinheiro, 2 - Pix, 3 - Cartão débito, 4 - Cartão crédito)");
//		int forma_pagamento = sc.nextInt();
//		
//		double valor = qtd * preco_unitario;
//		if(forma_pagamento == 1) {
//			//desconto 10%
//			System.out.println("Codigo: " + cod);
//			System.out.println("Desconto de 10%!");
//			double valor_final_dinheiro = valor - (valor * 0.1);
//			System.out.println("Valor final: " + valor_final_dinheiro);
//		}else if(forma_pagamento == 2) {
//			//desconto 12%
//			System.out.println("Codigo: " + cod);
//			System.out.println("Desdconto de 12%!");
//			double valor_final_pix = valor - (valor * 0.12);
//			System.out.println("Valor final: " + valor_final_pix);
//		}else if(forma_pagamento == 3) {
//			//desconto 5%
//			System.out.println("Codigo: " + cod);
//			System.out.println("Desconto de 5%!");
//			double valor_final_debito = valor - (valor*0.05);
//			System.out.println("Valor final: " + valor_final_debito);
//		}else if(forma_pagamento ==4) {
//			//desconto 3%
//			System.out.println("Codigo: " + cod);
//			System.out.println("Desconto de 3%");
//			double valor_final_credito = valor - (valor * 0.03);
//			System.out.println("Valor final: " + valor_final_credito);
//		}
//		
//		sc.close();
//	}
	
//	9. Dado três valores X,Y,Z, verificar se eles podem ser o
//	comprimento dos lados de um triângulo e, se forem, verificar
//	se é um triângulo, equilátero, isósceles ou escaleno. Se eles
//	não formarem um triângulo, escreverem uma mensagem. Obs: O
//	comprimento de cada lado de um triângulo é menor do que a soma
//	dos comprimentos dos outros dois lados; chama-se triângulo
//	equilátero ao triângulo que tem os comprimentos dos três lados
//	iguais; chama-se triângulo isósceles ao triângulo que tem os
//	comprimentos de dois lados iguais. Portanto, todo triângulo
//	equilátero é também isósceles; chama-se triângulo escaleno ao
//	triângulo que tem os comprimentos dos três lados diferentes.
	
//	
//	public static void main(String args[]) {
//		//triangulo = x + y > z || x + z > y || y + z > x;
//		//triangulo isoceles = x == y || x == z || y == z;
//		//triangul equilatero = x = y && y = z ;
//		//triangulo escaleno = x != y && y != z;
//	
//		Scanner sc = new Scanner(System.in);
//	
//		System.out.println("De os lados do triangulo: ");
//		
//		double x = sc.nextDouble(), y = sc.nextDouble(),z = sc.nextDouble();
//		
//		if(x + y > z || x + z > y || y + z > x) {
//			System.out.println("é um triangulo");
//			if(x == y & y == z ) {
//				System.out.print("Equilatero");
//			}else if(x == y || x == z || y == z) {
//				System.out.print("Isoceles");
//			}else if(x != y && y!=z){
//				System.out.print("Escaleno");
//			}
//		}else {
//			System.out.println("Não é um triangulo");
//		}
//		sc.close();
//		
//	}
}

