package L01_ForlLoop;

import java.util.Scanner;

public class C02_Forloop {
    public static void main(String[] args) {

        // girilen sayıdan 100 e kadar 4 ün katı tamsayıları print eden code create ediniz

        Scanner sc = new Scanner (System.in);

        System.out.println("bir pozitif tam sayı giriniz");
        int sayı =sc.nextInt();

        if (sayı>100 ){

            System.out.println("agam hani 100den küçük gitrecektin");

            for (int i= sayı; i <100 ; i++)

                if (i%4==0){
                    System.out.println(i+" ");

                    System.out.println("selam");
                }
        }
    }



}
