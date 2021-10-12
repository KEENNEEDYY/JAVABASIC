package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

import cursoJavaUdemy.entities.Aluno;
  
 public class sec70ex3 {
  
  public static void aula(String[] args) { Locale.setDefault(Locale.US);
  
  Scanner sc = new Scanner(System.in);
  
  Aluno aluno = new Aluno();
  
  aluno.setName(sc.nextLine()); do { aluno.setNotaA(sc.nextDouble());
  if(aluno.getNotaA()>30) { System.out.println("Note A invalide"); }
  }while(aluno.getNotaA()>30);
  
  do { aluno.setNotaB(sc.nextDouble()); if(aluno.getNotaB()>35 ) {
  System.out.println("Note B invalide"); } }while(aluno.getNotaB()>35 ) ;
  
  do { aluno.setNotaC(sc.nextDouble()); if(aluno.getNotaC()>35 ) {
  System.out.println("Note C invalide"); } }while(aluno.getNotaC()>35);
  
  System.out.println("FINAL GRADE = "+String.format("%.2f",
  aluno.notaFinal())); aluno.aprovado();
  
  sc.close(); }
  
  }
 