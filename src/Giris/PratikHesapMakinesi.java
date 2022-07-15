package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class PratikHesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk Sayıyı Giriniz:");
        n1 = input.nextInt();
        System.out.println("Lütfen İkinci Sayıyı Giriniz:");
        n2 = input.nextInt();
        System.out.println("Lütfen Yapmak istediğiniz işlemin sayı Numarasını giriniz\n");
        System.out.println("1- Toplama İşlemi\n 2- Çıkarma İşlemi\n 3- Çarpma İşlemi\n 4-Bölme İşlemi\n");
        select = input.nextInt();
        switch(select)
        {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşlemi Sonucu:" + (n1 * n2));
                break;
            case 4:
                System.out.println("Bölme İşlemi Sonucu:" + (n1 / n2));
                break;
            default:
                System.out.println("Lütfen Geçerli Bir Seçim Yapınız.");

        }
    }
}
