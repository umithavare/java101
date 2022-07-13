package Giris;
import java.sql.SQLOutput;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

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
