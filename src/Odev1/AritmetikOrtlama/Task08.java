package Odev1.AritmetikOrtlama;

import java.util.Scanner;

public class Task08 {
    /*
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {



        Scanner saat= new Scanner(System.in);

        System.out.println("saniye giriniz:");

        int sc=saat.nextInt() ;

        sc/=360;
        System.out.println(sc);



    }
}
