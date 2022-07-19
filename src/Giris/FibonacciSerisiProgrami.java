package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class FibonacciSerisiProgrami {
    public static void main(String[] args) {
        int elemanSayisi, toplam = 0, sayi1 = 0, sayi2 = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Elemanli bir fibonacci serisi istiyorsunuz:");
        elemanSayisi = input.nextInt();
        for (int i = 1 ; i <= elemanSayisi ; i++){
            toplam = sayi1 + sayi2;
            System.out.println(sayi1 + "+" + sayi2 + "=" + toplam);
            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
