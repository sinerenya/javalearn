package tasks2;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz:");
        Float boy=input.nextFloat();
        System.out.println("Boy:"+boy);

        System.out.println("Lütfen kilonuzu giriniz:");

        String kg=input.next();

        System.out.println( "kilonuz:"+kg);



    }
}
