package cursoJavaUdemy;
  
import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Rent;
  
  public class sec91ex {
  
  public static void aula(String[] args) { Locale.setDefault(Locale.US);
  
  Scanner sc = new Scanner(System.in); Rent[] rent = new Rent[10]; Integer
  numEstudents;
  
  
  System.out.print("How many roons will be rented?"); numEstudents =
  sc.nextInt();sc.nextLine();
  
  for(int i=0; i<numEstudents;i++) { System.out.println("Rent #"+(i+1)+": ");
  System.out.print("Name: "); String name = sc.nextLine();
  System.out.print("Email: "); String email = sc.nextLine();
  System.out.print("Room: "); Integer room = sc.nextInt();sc.nextLine();
  rent[room] = new Rent(name, email, room); System.out.println(); }
  
  System.out.println("Busy roons:"); for(int i=0; i<rent.length;i++) {
  if(rent[i]!=null) { System.out.println(rent[i]); } }
  
  
  sc.close(); }
  
  }
 