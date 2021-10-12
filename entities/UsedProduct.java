package cursoJavaUdemy.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date manufactureDate = new Date();
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}


	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String toString() {
		return priceTag();
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();

		sb.append(super.getName());
		sb.append(" (used) ");
		sb.append("$");
		sb.append(String.format(" %.2f", super.getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(sdf.format(manufactureDate));
		sb.append(" )");
		
		return sb.toString();
	}

}
