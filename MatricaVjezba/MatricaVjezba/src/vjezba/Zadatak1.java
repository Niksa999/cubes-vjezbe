package vjezba;

import java.util.Scanner;

public class Zadatak1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Unesite broj kolona ");
		int brojKolona=scan.nextInt();
		System.out.println("Unesite broj redova ");
		int brojRedova=scan.nextInt();
		
		int[][] matrica = new int[brojRedova][brojKolona];
		
		for(int i=0;i<matrica.length;i++) {
			for(int j=0;j<matrica[i].length;j++) {
				System.out.println("Unesite clan matrica na poziciju "+"["+i+"]"+"["+j+"]");
				matrica[i][j]=scan.nextInt();
				System.out.println("Nesto novo");
				System.out.println("Najnovije");
			}
		}
		int zbir =0;
		for(int i=0;i<matrica.length;i++) {
			for(int j=0;j<matrica[i].length;j++) {
				zbir+=matrica[i][j];
				
			}
		}
		System.out.println("Zbir je "+zbir);
		
		
		
		
		
		
		
		
	}

}
