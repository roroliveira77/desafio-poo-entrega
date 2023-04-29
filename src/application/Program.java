package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		
		funcionario.salario = sc.nextDouble();
		
		System.out.print("Tax: ");
		funcionario.taxa = sc.nextDouble();
		
		
		
		System.out.println();
		System.out.print("Employee: " + funcionario.name);
		System.out.printf( " $ %.2f" , funcionario.netSalary());
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);

		
		System.out.println();
		System.out.printf("Updated data: " + funcionario);		
		
		sc.close();

	}

}
