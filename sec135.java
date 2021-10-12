package cursoJavaUdemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Company;
import cursoJavaUdemy.entities.Individual;
import cursoJavaUdemy.entities.TaxPayer;

public class sec135 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer numPayers;
		List<TaxPayer> list = new ArrayList<>();
		Double total = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		numPayers = sc.nextInt();
		
		for(int i =0; i< numPayers; i++)
		{
			System.out.println();
			Character type;
			System.out.println("Tax payer#"+numPayers+" data:");
			
			do {
				System.out.print("Individual ou company (i/c) ? ");
				type = sc.next().charAt(0);
			}while(!( type == 'i' || type == 'c' ));
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			
			switch (type) {
			case 'i':
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
				total += new Individual(name, anualIncome, healthExpenditures).tax();
				break;
			case 'c':
				System.out.print("Number of employees: ");
				Integer employeesNumber = sc.nextInt();
				list.add(new Company(name, anualIncome, employeesNumber));
				total += new Company(name, anualIncome, employeesNumber).tax();
				break;
			default:
				break;
			}
			
		}
		
		System.out.println();
		
		for(TaxPayer e : list) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f", total));
		
		sc.close();
	}
			
}
