package tasks2;

import java.util.Scanner;

public class _24_Scanner3 {

    public static void main(String[] args) {

     /*  kullanıcını sevdiği meyveyi print eden code create ediniz  */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Sevdiğiniz Meyveyi Giriniz:");

        String meyve = input.next();
        System.out.println("meyve : " + meyve );


    }
}
