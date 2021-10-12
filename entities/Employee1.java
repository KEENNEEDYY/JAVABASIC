package cursoJavaUdemy.entities;

public class Employee1 {
	
	private String name;
	private Double grossSalary;
	private Double tax;
	
	public Double netSalary() {
		return this.grossSalary - (this.grossSalary*this.tax);
	}
	public void increaseSalary(Double percentage) {
		this.grossSalary += this.grossSalary*percentage;
	}
	
	
	public Employee1() {
		
	}
	public Employee1(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}

}
