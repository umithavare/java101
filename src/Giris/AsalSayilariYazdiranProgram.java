package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class AsalSayilariYazdiranProgram {
    public static void main(String[] args) {
        int asalSayi = 0;
        for (int i = 1; i < 100; i++) {
            int sayac = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0)
                    sayac++;
            }
            if (sayac == 2) {
                asalSayi += i;
                System.out.println(i);
            }
        }
    }
}