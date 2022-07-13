package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 */
public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        double fiyat,kdvliFiyat,kdvTutari;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ürün Fiyati giriniz: ");
        fiyat = input.nextDouble();
        kdvTutari = fiyat * 0.18;
        kdvliFiyat= fiyat + kdvTutari;
        System.out.println("Kdv Miktari %18'dir.");
        System.out.println("Kdv'siz Fiyat :\t" +fiyat + "\nKdv Tutarı :\t"+ kdvTutari + "\nKdv'li fiyat :\t" + kdvliFiyat);
    }
}
