package cursoJavaUdemy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Client;
import cursoJavaUdemy.entities.Order;
import cursoJavaUdemy.entities.OrderItem;
import cursoJavaUdemy.entities.Product;
import cursoJavaUdemy.enums.OrderStatus;

public class sec122 {

	public sec122(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String ClientName = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(ClientName, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status PENDING_PAYMENT, PROCESSING, SHIPPED or DELIVERED: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order1 = new Order( new Date(), status, client);
		
		System.out.print("How many items to this order?");
		Integer N = sc.nextInt();sc.nextLine();
		
		for(int i = 1; i<=N; i++) {
			System.out.println("Enter #"+N+" item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();			
			System.out.print("Quantity: ");
			Integer quant = sc.nextInt();sc.nextLine();
			Product product1 = new Product(productName, price);
			OrderItem orderItem = new OrderItem(quant, product1);
			
			order1.addItem(orderItem);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order1);
		
		sc.close();
	}
			
}
