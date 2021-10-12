package cursoJavaUdemy.entities;

public class Individual extends TaxPayer{
	
	private Double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public Double tax() {
		Double tax = getAnualIncome();
		return ((tax > 20000.0) ? getAnualIncome()*(25./100.): getAnualIncome()*(15./100.))-((getHealthExpenditures() > 0.) ? (getHealthExpenditures()*(50./100)):0.0);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%.2f", tax()));
		return super.toString()+sb.toString();
	}
}
