package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class EbobEkokProgrami {
    public static void main(String[] args) {
        int sayi1, sayi2, ebob=0, ekok, sayac=1;
        boolean control=true;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("lütfen 1. sayıyı giriniz");
            sayi1 = input.nextInt();
            System.out.println("Lütfen ikinci sayıyı giriniz");
            sayi2 = input.nextInt();
            if (sayi1 < 0 || sayi2 < 0)
                System.out.println("Lütfen Pozitif Sayılar Giriniz");
            else control=false;
        }
        while(control);
        while(sayi1 >= sayac){
            if ((sayi1 % sayac == 0) && (sayi2 % sayac==0))
                ebob = sayac;
            sayac++;
        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println("Sayinin ebobu:\t" + ebob + "\nSayinin ekoku:\t" + ekok);
    }
}
