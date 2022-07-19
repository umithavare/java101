package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        int sayi, toplam=0;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Lütfen Sayiyi giriniz.");
            sayi = input.nextInt();
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " Mükemmel sayidir.");
            }
            else System.out.println(sayi + " Mükemmel sayi degildir.");
        }
    }
}
