package Odev1.AritmetikOrtlama;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */

     Scanner sc= new Scanner(System.in);
		System.out.println(" bir sayi giriniz :");
		int sayi=sc.nextInt();
		int birler= sayi%10;
		int yuzler= sayi/100;
		System.out.println("birler + yuzler :"+ (birler +yuzler));











		
	}

}
