package Odev1.AritmetikOrtlama;

import java.util.Scanner;

public class Task05 {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {

        Scanner saat= new Scanner(System.in);

        System.out.println("saat giriniz:");

        int sc=saat.nextInt() ;
        System.out.println("dakika giriniz:");

        sc*= 3600;
        int dk=saat.nextInt() ;

        dk*=60;

        System.out.println("Saniye giriniz:");

        int sn=saat.nextInt() ;

        sn*=1;


        System.out.println(sn+sc+dk+" Saniye");




    }

}
