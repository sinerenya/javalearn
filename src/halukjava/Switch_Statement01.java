package halukjava;

import java.util.Scanner;

public class Switch_Statement01 {
    public static void main(String[] args) {

        /*
Switch Case deyimi islev bakimindan if deyimine çok benzemektedir.
Çok sayida if islem bloklari kullandigimizda programin okunurlugu azalacak ve
programi izlemek zorlasacaktir. Programimizin bir degerini bir çok degerle
 karsilastirmak gerektiginde switch komutunu kullanacagiz. Switch seçenegi
 ile degiskenin durumuna göre bir çok durum içersinden bir tanesi gerçeklestirilir.
 Istersek de if deyimi ile switch case'' yi birlikte kullanabiliriz.
  Switch in yaptigi is kisaca, ifadenin degerini sirayla sabitlerle karsilastirarak ve her satiri islemektir.
  çok sayıda koşul içeren durumlarda switch kullanmak if'e göre programınızın daha hızlı çalışmasını sağlıyor.
  Bunun haricinde iki koşul ifadesi arasında dikkate değer bir performans farklılığı bulunmuyor.

 ahan da TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ.. CISSS
 */

        Scanner sc =new Scanner(System.in);
        System.out.println("agam bir rakam gir:");

        int rakam=sc.nextInt();
        switch ( rakam) {
        case 0 :
        System.out.println("girilen rakam SIFIR");
        break;
            case 1 :
                System.out.println("girilen rakam BİR");
                break;
            case 2 :
                System.out.println("girilen rakam İKİ");
                break;
            case 3 :
                System.out.println("girilen rakam ÜÇ");
                break;
            case 4:
                System.out.println("girilen rakam DÖRT");
                break;
            case 5:
                System.out.println("girilen rakam BEŞ");
                break;
            case 6 :
                System.out.println("girilen rakam ALTI");
                break;
            case 7 :
                System.out.println("girilen rakam YEDİ");
                break;
            case 8 :
                System.out.println("girilen rakam SEKİZ");
                break;
            case 9 :
                System.out.println("girilen rakam DOKUZ");
                break;
            default:
                System.out.println("adam gibi bir rakam gir:(");}















        }
}
