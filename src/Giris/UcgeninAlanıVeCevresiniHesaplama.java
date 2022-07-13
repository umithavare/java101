package Giris;
import java.util.Scanner;
import java.lang.Math;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**

 Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
 Formül

 Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

 𝑢 = (a+b+c) / 2

 Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 */
public class UcgeninAlanıVeCevresiniHesaplama {
    public static void main(String[] args) {
        double a,b,c,u,alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üçgenin birinci kenarının uzunluğunu giriniz:");
        a = input.nextDouble();
        System.out.println("Lütfen üçgenin ikinci kenarının uzunluğunu giriniz:");
        b = input.nextDouble();
        System.out.println("Lütfen üçgenin üçüncü kenarının uzunluğunu giriniz:");
        c = input.nextDouble();
        //kullanıcıdan verıler alındı.

        //hesaplamalar yapıldı
        u = (a + b + c) / 2 ;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Üçgenin Çevresi :\t" + u + "\nücgenin Alanı :\t" +alan);



    }
}
