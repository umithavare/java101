package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class TersUcgenYazdıranProgram {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Satırlı üçgen istiyorsunuz:");
        sayi = input.nextInt();
        for (int i = 0 ; i <= sayi ; i++) { // satır sayısını yazdırıyor

            for (int j = 0; j < i; j++) { // boslukları yazdırıyor
                System.out.print(" ");
            }
            for (int k = (sayi - i) * 2 - 1; k > 0; k--) {
                System.out.print("*"); // yıldızları yazdırıyor
            }
            System.out.println(); // satır arasındakı boslugu yazdırıyor
        }
    }
}

