package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Ödev
 *
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class CiftSayilariBulanProgram {
    public static void main(String[] args) {
     int sayi, ortalama, temp=0;
     Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:\t");
        sayi = input.nextInt();
        int sayac=0;
        for (int i=1 ; i <= sayi ; i++){
            if (i % 12 == 0) {
                temp += i;
                sayac++;
            }
        }
        ortalama = (temp) / (sayac);
        System.out.println(ortalama);

    }
}
