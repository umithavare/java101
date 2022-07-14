package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Ödev
 *
 * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
 *
 * 𝜋 sayısını = 3.14 alınız.
 *
 * Formül : (𝜋 * (r*r) * 𝛼) / 360
 */
public class DaireDilimininAlanınıBulanProgram {
    public static void main(String[] args) {
        double pi = 3.14, a, r, alan;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Daire diliminin yarıçapını giriniz.");
        r = input.nextDouble();
        System.out.println("Lütfen Daire diliminin açı derecesini giriniz.");
        a = input.nextDouble();
        alan = (pi * (r*r) * a) / 360;
        System.out.println("Daire Diliminin Alanı: \t" + alan);
    }
}
