package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/


/**
 * Manav Kasa Programı
 *
 * Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
 *
 * Meyveler ve KG Fiyatları
 *
 *     Armut : 2,14 TL
 *     Elma : 3,67 TL
 *     Domates : 1,11 TL
 *     Muz: 0,95 TL
 *     Patlıcan : 5,00 TL
 */
public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlıcanFiyat = 5;
        double armut, elma, domates, patlıcan, muz, toplamTutar;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Kilo Armut Almak İstersiniz?");
        armut = input.nextDouble();
        System.out.println("Kaç Kilo Elma Almak İstersiniz?");
        elma = input.nextDouble();
        System.out.println("Kaç Kilo Domates Almak İstersiniz?");
        domates = input.nextDouble();
        System.out.println("Kaç Kilo Muz Almak İstersiniz?");
        muz = input.nextDouble();
        System.out.println("Kaç Kilo Patlıcan Almak İstersiniz?");
        patlıcan = input.nextDouble();

        toplamTutar= (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlıcan * patlıcanFiyat);
        System.out.println("Toplam Tutarınız :\n" + toplamTutar);

    }
}
