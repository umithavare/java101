package Giris;
import java.util.Scanner;
    /** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Not Ortalaması Hesaplayan Program
 *
 * Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
 * Ödev
 *
 * Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
 */
public class NotOrtHesaplayanProgram {
    public static void main(String[] args) {
        // Değişkenler oluşturuldu.
        int mat,fzk,kim,trk,trh,mzk,ortalama;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Dersini notunu giriniz: ");
        mat = input.nextInt();
        System.out.println("Fizik Dersinin notunu giriniz: ");
        fzk = input.nextInt();
        System.out.println("Kimya Dersinin notunu giriniz: ");
        kim = input.nextInt();
        System.out.println("Türkçe Dersinin notunu giriniz: ");
        trk = input.nextInt();
        System.out.println("Tarih Dersinin notunu giriniz: ");
        trh = input.nextInt();
        System.out.println("Müzik Dersinin notunu Giriniz");
        mzk = input.nextInt();
        // bütün inputlar alındı
        ortalama = (mat + fzk + kim + trk + trh + mzk) / 6 ; //ortalama hesaplandı
        boolean gecme = ortalama >= 60;
        String sonuc = gecme ? "Gecti" : "Kaldi";

        System.out.println("Ortalamanız:\t" +ortalama  + "\nGeçme Durumunuz:\t" +sonuc);

    }
}
