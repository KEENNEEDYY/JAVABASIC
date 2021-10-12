package cursoJavaUdemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Employee2;

public class sec96 {

	public static void aula(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Integer aux;
		List<Employee2> list = new ArrayList<>();
		
		System.out.print("How many employees will be registred? ");
		aux = sc.nextInt();sc.nextLine();
		for(int i = 0; i< aux;i++)
		{
			System.out.printf("%n"+"Employee #"+(i+1)+": ");
			System.out.printf("%n"+"Id: ");
			int id = sc.nextInt();sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			list.add(new Employee2(id, name, salary));
		}
		System.out.printf("%n"+"Enter the employee id that will have salary increase: "+"%n");
		int id = sc.nextInt();sc.nextLine();
		Employee2 almento = list.stream().filter(x-> x.getId() ==id).findFirst().orElse(null);
		if(almento == null) {
			System.out.println("This id cod is not exist!");			
		}else {
			System.out.printf("%n"+"Enter the percentage: ");
			almento.increaseSalary(sc.nextDouble());
		}
		
		System.out.printf("%n"+"List of employees:"+"%n");
		for(Employee2 objInterator: list) {
			System.out.println(objInterator);
		}
		
		sc.close();
	}
	
/*	public boolean hasId(List<Employee> list, Integer id) {
		int aux = (int) id;
		Employee achou = list.stream().filter(x-> x.getId() == aux).findFirst().orElse(null);
		if(achou != null) {
			return true;
		}
		return false;
	}*/
}
