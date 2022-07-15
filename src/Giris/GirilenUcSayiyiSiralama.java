package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
 */
public class GirilenUcSayiyiSiralama {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz:\t");
        a = input.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz:\t");
        b = input.nextInt();
        System.out.println("Lütfen üçüncü sayiyi giriniz\t");
        c = input.nextInt();
        if (a>b && a>c) {
            if (b > c)
                System.out.println(a + ">" + b + ">" + c);
            else System.out.println(a +">" + c + ">" + b);
        }

        if (b>a && b>c) {
            if (a > c)
                System.out.println(b + ">" + a + ">" + c);
            else System.out.println(b + ">" + c + ">" + a);
        }
        if (c>a && c>b) {
            if (a > b)
                System.out.println(c + ">" + a + ">" + b);
            else System.out.println(c + ">" + b + ">" + a);
        }
    }
}
