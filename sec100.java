package cursoJavaUdemy;

import java.util.Locale;
import java.util.Scanner;

public class sec100 {

	public static void aula(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as dimensões da matrix [linha]x[coluna]:");
		Integer n = sc.nextInt();
		Integer m = sc.nextInt();
		
		Integer[][] matriz =  new Integer[n][m];
		
		
		 for(int i = 0 ; i<n;i++) 
		 { 
			 for(int j =0 ;j<m;j++)
			 {
				 System.out.print("Digite o valor da posicão "+i+"x"+j+": ");
				 matriz[i][j] = sc.nextInt(); 
			 } 
		 }
				
		System.out.println();
		percorrerMatriz("imprimir", matriz, n, m);
		System.out.println();

		System.out.print("Digite um valor de procura: ");

		Integer procura = sc.nextInt();
		
		 for(int i = 0 ; i<n;i++) 
		 { 
			 for(int j =0 ;j<m;j++)
			 {
				 if(matriz[i][j] == procura) {
					 System.out.println("Posicao: "+i+","+j);
					 if ( (j-1)>-1) {
							System.out.println("Left: "+matriz[i][j-1]);
						}
					 if( (j+1)<m) {
							System.out.println("Right: "+matriz[i][j+1]);
						}
					 if((i-1)>-1) {
							System.out.println("Up: "+matriz[i-1][j]);
						}
					 if((i+1)<n) {
							System.out.println("Down: "+matriz[i+1][j]);
						}
						System.out.println();
				 }
			 } 
		 }

		
		sc.close();
				
	}
	
	static void percorrerMatriz(String operacao, Integer[][] matriz, Integer n, Integer m) {
		for(int i = 0 ; i<n;i++) {
			for(int j =0 ;j<m;j++) {
				operacao(operacao, matriz, i, j, n, m);
			}
			if(operacao == "imprimir" ||operacao == "imprimirDiagonal" | operacao == "visinhos")
				System.out.println();
		}
	}

	 static void operacao(String operacao, Integer[][] matriz, Integer i, Integer j, Integer n, Integer m) {
		 switch (operacao) {
		case "imprimir":
				System.out.print(matriz[i][j]+"      ");
			break;
		case "preencher":
			System.out.println("Digite o valor da posicão "+i+"x"+j+": ");
		case "imprimirDiagonal":
			if(i == 0 && j == 0)
				System.out.print(matriz[i][j]+" ");
			else if(j == (i+1) && i == j+i)
				System.out.print(matriz[i][j]+" ");
		case "visinhos":
			if ( (j-1)>-1) {
				System.out.println("Left: "+matriz[i][j-1]);
			}else if( (j+1)<m) {
				System.out.println("Right: "+matriz[i][j+1]);
			}else if((i-1)>-1) {
				System.out.println("Up: "+matriz[i-1][j]);
			}else if((i+1)>n) {
				System.out.println("Down: "+matriz[i+1][j]);
			}//else
				//System.out.print(" ");
		default:
			break;
		}
		}
			
}
