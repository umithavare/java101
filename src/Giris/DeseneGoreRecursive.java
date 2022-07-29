package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class DeseneGoreRecursive {
    static void sayiDeseni(int a, int b, int c) {
            if(a > 0){
                System.out.print(a + " ");
                a = a-5;
                c=a;
                sayiDeseni(a,b,c);
            }
            else if (a <= 0 ) {
                System.out.print(c + " ");
                c = c + 5 ;
                if (b == c ){
                    System.out.print(b);
                }
                else sayiDeseni(a, b ,c);
            }
    }
    public static void main(String[] args) {
        System.out.print("Lutfen bir sayi giriniz:");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        sayiDeseni(sayi,sayi,sayi);
    }
}
