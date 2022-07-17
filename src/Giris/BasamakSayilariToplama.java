package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class BasamakSayilariToplama {
    public static void main(String[] args) {
        int sayi,basamakToplami= 0, sayiDegeri;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Basamak toplamını hesaplamak istediginiz sayiyi giriniz:");
        sayi = input.nextInt();

        while (sayi != 0){
            sayiDegeri = sayi % 10;
            basamakToplami += sayiDegeri;
            sayi = sayi / 10;
        }
        System.out.println(basamakToplami);
    }
}

