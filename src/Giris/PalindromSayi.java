package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println("Lütfen bir sayi giriniz");
        Scanner input= new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Palindrom sayi mi :\t" + isPalindrom(number));
    }
}




