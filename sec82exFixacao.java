package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Conta;
  
  public class sec82exFixacao {
  
  public static void aula(String[] args) { Locale.setDefault(Locale.US);
  
  Scanner sc = new Scanner(System.in); Conta conta = new Conta();
  
  System.out.print("Enter account number: "); conta.setNumero(sc.nextInt());
  System.out.print("Enter account holder: "); sc.nextLine();
  conta.setNome(sc.nextLine());
  System.out.print("Is there an inigial deposit (y/n)? ");
  
  if( sc.next().charAt(0) == 'y') { conta.primeiroDeposito();
  System.out.println("Enter initial deposit value: ");
  conta.depositar(sc.nextDouble()); System.out.println(conta); }else {
  System.out.println(conta); }
  
  System.out.println("Enter a deposit value: ");
  conta.depositar(sc.nextDouble()); System.out.println(conta);
  
  System.out.println("Enter a withdraw value: "); conta.sacar(sc.nextDouble());
  System.out.println(conta);
  
  sc.close(); }
  
  }
 