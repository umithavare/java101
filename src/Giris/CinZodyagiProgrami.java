package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class CinZodyagiProgrami {
    public static void main(String[] args) {
        double dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dogum yilinizi sayi olarak giriniz 'orn: 2000' : \n");
        dogumYili = input.nextDouble();
        if (dogumYili >0 )
        {
            String zodyagınız = null;
            if (dogumYili % 12 == 0)
                zodyagınız = "maymun";
            if (dogumYili % 12 == 1)
                zodyagınız = "horoz";
            if (dogumYili % 12 == 2)
                zodyagınız = "köpek";
            if (dogumYili % 12 == 3)
                zodyagınız = "domuz";
            if (dogumYili % 12 == 4)
                zodyagınız = "fare";
            if (dogumYili % 12 == 5)
                zodyagınız = "öküz";
            if (dogumYili % 12 == 6)
                zodyagınız = "kaplan";
            if (dogumYili % 12 == 7)
                zodyagınız = "tavşan";
            if (dogumYili % 12 == 8)
                zodyagınız = "ejderha";
            if (dogumYili % 12 == 9)
                zodyagınız = "yılan";
            if (dogumYili % 12 == 10)
                zodyagınız = "at";
            if (dogumYili % 12 == 11)
                zodyagınız = "koyun";

            System.out.println("Zodyağınız:\t" + zodyagınız);
        }
        else System.out.println("Lütfen Doğru bir yıl giriniz");

    }
}
