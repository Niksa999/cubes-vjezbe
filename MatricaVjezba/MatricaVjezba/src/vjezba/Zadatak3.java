package vjezba;

import java.util.Scanner;

public class Zadatak3 {
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
				
			}
		}
		int suma=0;
		int aritmeticka=0;
		int brojac=0;
		for(int i=0;i<matrica.length;i++) {
			for(int j=0;j<matrica[i].length;j++) {
				if(i + j > matrica.length) {
					suma+=matrica[i][j];
					brojac++;
				}
				
			}
		}
		aritmeticka=suma/brojac;
		System.out.println("Aritmeticka sredina je "+aritmeticka);
		
		
	}

}
