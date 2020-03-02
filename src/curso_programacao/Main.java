package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.567893;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		String product1 = "computer";
		String product2 = "Office desk";
		int age = 39;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Ol� mundo!!!");
		System.out.println(y); // com quebra de linha
		System.out.print(x); // sem quebra de linha
		
		System.out.printf("%.3f%n", x); // 3 casas decimais, aparece com (,) pq � a configuracao do computador
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", x); // 3 casas decimais, aparece com (.) pq configurei locale para US 
		
		// Concatenado valores
		System.out.printf("Altura: " + "%.3f%n", x);  
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); 
		
		// Exercicio 01 
		System.out.println("------ Exercicio 01 -------"); 
		Locale.setDefault(new Locale("pt", "BR")); //Seta local padrao Portugues
		System.out.println("Products:"); 
		System.out.printf("Computer, with price is $ %.2f%n", price1);
		System.out.printf("%s , with price is $ %.2f%n", product2, price2); 
		System.out.println(); 
		System.out.printf("Record: %d years old, code %d and gender: %s%n", age, code, gender); 
		System.out.println(); 
		System.out.printf("Measure with eight decimal places: %f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure); 
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure); 
		

	}

}