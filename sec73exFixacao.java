package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.utils.CurrencyConverter;

  public class sec73exFixacao {
 
  public static void aula(String[] args) { Locale.setDefault(Locale.US);
  
  Scanner sc = new Scanner(System.in); Double dollarValue; Double quantDollars;
  System.out.printf("What's the dollar price? "); dollarValue =
  sc.nextDouble(); System.out.printf("How many dollars will be bought? ");
  quantDollars = sc.nextDouble();
  System.out.println("Amount to be paid in reais is = "+String.format("%.2f",
  CurrencyConverter.total(quantDollars, dollarValue)));
  
  sc.close(); }
  
  }
 