package cursoJavaUdemy.entities;

public class Company extends TaxPayer{
	
	private Integer employeesNumber;
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer employeesNumber ) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	
	@Override
	public Double tax() {
		return (this.employeesNumber > 10. ) ? getAnualIncome()*(14./100.) : getAnualIncome()*(16./100.);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%.2f", tax()));
		return super.toString()+sb.toString();
	}

}
