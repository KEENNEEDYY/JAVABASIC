package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Rectangle;

public class sec70ex1 {

	public static void aula(String[] args) {
		Locale.setDefault(Locale.US);
		
		Rectangle rec = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height");
		rec.setWidth(sc.nextDouble());
		rec.setHeight(sc.nextDouble());
		
		System.out.println("AREA ="+ rec.area());
		System.out.println("PERIMETER ="+ rec.perimeter());
		System.out.println("DIAGONAL ="+rec.diagonal());
		
		sc.close();
	}

}
