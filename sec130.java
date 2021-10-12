package cursoJavaUdemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.ImportedProduct;
import cursoJavaUdemy.entities.Product;
import cursoJavaUdemy.entities.UsedProduct;

public class sec130 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		System.out.println();		
		for(int i = 1; i <= n ; i++) {
			System.out.println();;
			System.out.println("Product #"+i+" data:");
			Character type;
		    
			do
		    {
		    	System.out.print("Common, used or Imported (c/u/i)? ");
		    	type = sc.next().charAt(0);
		    	
		    }while(!(type == 'i'|| type == 'c' || type == 'u'));
		    
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch (type) {
				case 'c':
					list.add(new Product(name, price));
					break;
				case 'i':
					System.out.print("Customs fee: ");
					Double customsFee = sc.nextDouble();
					list.add(new ImportedProduct(name, price, customsFee));
					break;
				case 'u':
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					Date manufactureDate = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, manufactureDate));
					break;
	
				default:
					break;
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product e : list) {
			System.out.println(e.priceTag());			
		}
		
		sc.close();		
	}
			
}
