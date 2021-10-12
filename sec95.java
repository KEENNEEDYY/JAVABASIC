package cursoJavaUdemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sec95 {

	public static void aula(String[] args) {
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		list.add("Maria");
		list.add("Alex");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.printf("Tamanho da lista = "+list.size()+"%n"+"Elementos da lista:"+"%n");
		for(String x : list) {
			System.out.println(x);
		}System.out.println();
		
		System.out.println("Index of Bob = "+list.indexOf("Bob"));
		for(String x : list) {
			System.out.println(x);
		}System.out.println();
		
		System.out.println("Filtrando lista por todo aquele que comeca com a letra A: ");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for( String x : result) {
			System.out.println(x);
		}System.out.println();
		
		System.out.printf("Filtrando lista pelo primeiro item que começa com uma determinada letra %n"+"Digite uma letra para filtro: ");
		Character filter = sc.next().charAt(0);
		String resultf = list.stream().filter(x -> x.charAt(0) == filter).findFirst().orElse(null);
		System.out.println(resultf);
		
		sc.close();
	}
}
