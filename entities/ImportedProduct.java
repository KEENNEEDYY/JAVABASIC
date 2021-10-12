package cursoJavaUdemy.entities;

public class ImportedProduct extends Product{
	
	private Double customFee;
	
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customFee) {
		super(name, price);
		this.customFee = customFee;
	}
	
	public Double totalPrice(){
		return super.price + customFee; 
	}
	
	public Double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(Double customFee) {
		this.customFee = customFee;
	}
	
	@Override 
	public Double getPrice() {
		return totalPrice();
	}

	@Override
	public String toString() {
		return priceTag();
	}

	@Override
	public final String priceTag(){
		StringBuilder sb = new StringBuilder();
		sb.append(" (Custom fee: $ ");
		sb.append(this.customFee);
		sb.append(" )");

		return super.priceTag()+ sb.toString();		
	}
}
