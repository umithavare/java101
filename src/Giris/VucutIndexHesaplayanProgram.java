package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Vücut Kitle İndeksi Hesaplama
 *
 * Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 * Formül
 *
 * Kilo (kg) / Boy(m) * Boy(m)
 */

public class VucutIndexHesaplayanProgram {
    public static void main(String[] args) {
        double boy,kilo,vucutIndex;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinde yazınız");
        boy = input.nextDouble();
        System.out.println("Lütfen Kilonuzu yazınız.");
        kilo = input.nextDouble();
        vucutIndex = kilo / (boy * boy);
        System.out.println("Boyunuz :\t" + boy + "\nKilonuz : \t" + kilo + "\nVucut İndeksiniz : \t" +vucutIndex);
    }
}
