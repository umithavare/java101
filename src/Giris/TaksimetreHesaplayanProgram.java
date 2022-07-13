package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/


/**
 * Taksimetre Programı
 *
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
 *
 *     Taksimetre KM başına 2.20 TL tutmaktadır.
 *     Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 *     Taksimetre açılış ücreti 10 TL'dir.
 */

public class TaksimetreHesaplayanProgram {
    public static void main(String[] args) {
        int acilisUcreti=10;
        double toplamTutar,kmTutar,km,kmFiyati=2.20;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Km gitmek istiyorsunuz?");
        km = input.nextDouble();
        kmTutar = km * kmFiyati;
        toplamTutar = kmTutar + acilisUcreti;
        boolean odeme = toplamTutar > 20;
        Double odenecekMiktar = odeme ? toplamTutar : 20;
        System.out.println("Km Başına Fiyat:\t" + kmFiyati + "\nKm Tutarı: \t" + kmTutar + "\nOdenecek Miktar: \t " + odenecekMiktar);
    }
}
