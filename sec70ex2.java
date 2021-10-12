package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Employee1;

public class sec70ex2 {

	public static void aula(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee1 employee = new Employee1();
		
		System.out.printf("Name: ");
		employee.setName(sc.nextLine());
		System.out.printf("Gross salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.printf("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: "+employee.getName()+", $ "+String.format("%.2f",(employee.getGrossSalary()-employee.getTax())));
		
		System.out.printf("Which percentage to incresase salary?");
		Double aux;
		aux = sc.nextDouble();
		
		System.out.println("Updated data: "+employee.getName()+", $ "+String.format("%.2f",((employee.getGrossSalary()-employee.getTax())+(employee.getGrossSalary()*(aux/100)))));
		
		sc.close();
	}

}