package Odev1.AritmetikOrtlama;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

     Scanner sc=new Scanner(System.in);

        System.out.println("Lo Üç Basamaklı Sayı Gir:" );

        int sayi=sc.nextInt();
        int birler= sayi/100;
        int onlar= sayi/10;
        int yüzler= sayi/1;

        System.out.println("birler Basamağı:"+birler);
        System.out.println("onlar basamağı:"+onlar);
        System.out.println("yüzler Basamağı:"+yüzler);





    }
}
