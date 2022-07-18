package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class NKadarSayininMaxMinHesaplama {
    public static void main(String[] args) {
        int min = 0, max = 0, counter ;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet Sayi girmek istiyorsunuz:\t");
        counter = input.nextInt();
        for (int i=1; i <= counter ; i++){
            System.out.print(i + "." + "\tSayiyi giriniz:\t" );
            int number = input.nextInt();
            if (i==1){
                max = number;
                min = number;
            }
            if (number > max)
                max = number;
            if (number < min)
                min = number;
        }
        System.out.println("En büyük sayi:\t" + max + "\nEn küçük sayi:\t" + min);
    }
}
