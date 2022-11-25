package halukjava;

import java.util.Scanner;

public class Swich02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("agam bir Ay gir:");

        int ay =sc.nextInt();
        switch ( ay ) {
            case 1  :
                System.out.println("girilen AY OCAK");
                break;
            case 2 :
                System.out.println("girilen AY SUBAT");
                break;
            case 3 :
                System.out.println("girilen AY MART");
                break;
            case 4:
                System.out.println("girilen AY NİSAN");
                break;
            case 5:
                System.out.println("girilen AY  MAYIS");
                break;
            case 6:
                System.out.println("girilen AY HAZRRAN");
                break;
            case 7 :
                System.out.println("girilen AY TEMMUZ");
                break;
            case 8 :
                System.out.println("girilen AY  AGUSTOS");
                break;
            case 9:
                System.out.println("girilen AY EYLÜL");
                break;
            case 10 :
                System.out.println("girilen AY EKİM");
                break;
            default:
                System.out.println("adam gibi bir AY gir:(");}















    }
}
