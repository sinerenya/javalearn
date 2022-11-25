package halukjava;

import java.util.Scanner;

public class Switsch03 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("aylar kaç gün çeker:");

        int ayno =sc.nextInt();
        switch ( ayno) {
            case 1 :
                System.out.println("girilen ay 31 çeker ");
                break;
            case 2 :
                System.out.println("girilen rakam BİR");
                break;
            case 3 :
                System.out.println("girilen ay 31 çeker");
                break;
            case 4:
                System.out.println("girilen ay 30 çeker");
                break;
            case 5:
                System.out.println("girilen ay 31 çeker");
                break;
            case 6:
                System.out.println("girilen ay 30 çeker");
                break;
            case 7 :
                System.out.println("girilen ay 31 çeker");
                break;
            case 8 :
                System.out.println("girilen ay 31 çeker");
                break;
            case 9:
                System.out.println("girilen ay 30 çeker");
                break;
            case 10 :
                System.out.println("girilen ay 31 çeker");
                break;
            default:
                System.out.println("adam gibi bir ay gir:(");}

















    }
}
