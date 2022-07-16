package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, totalN = 1, totalR = 1, fark, totalFark = 1, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon formülü = C(n,r)");
        System.out.println("Lütfen n değerini giriniz");
        n = input.nextInt();
        System.out.println("Lütfen r değerini giriniz");
        r = input.nextInt();
        for (int i = 1 ; i <= n ; i++){
            totalN = totalN * i ;
        }
        for (int i = 1 ; i <= r ; i++){
            totalR = totalR * i;
        }
        totalFark = n-r;
        for (int i = 1 ; i <= totalFark ; i++){
            totalFark = totalFark * i;
        }

        sonuc = totalN / (totalR * totalFark);
        System.out.println(sonuc);
    }
}
