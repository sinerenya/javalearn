package tasks2;

import jdk.internal.org.objectweb.asm.tree.InsnList;

import java.util.Scanner;

public class Task04 {


    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Ad Giriniz:");
        String isim = input.next();
        System.out.println("Ad: " + isim );

        System.out.println("Lütfen Soyadınızı Giriniz:");
        String soyad = input.next();
        System.out.println("Soyad: " + soyad );

        System.out.println("Lütfen Yaşınızı Giriniz:");
        String Yaş = input.next();
        System.out.println("Yaş: " + Yaş );

        System.out.println("Lütfen Kilonuzu Giriniz:");
        String Kilo = input.next();
        System.out.println("Kilo: " + Kilo );

        System.out.println("Lütfen boyunuzu Giriniz:");
        float Boy = input.nextFloat();
        System.out.println("Boyunuz: " + Boy );



        System.out.println("Kaç ay devam edeceksiniz:");
        String ay = input.next();
        System.out.println("kursa devam süresi: " + ay  );

    }
}
