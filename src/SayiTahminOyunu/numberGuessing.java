package SayiTahminOyunu;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class numberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);  // 0 ile 100 arasında random sayı üretti.
        int right = 0;
        int usersNumber;
        int [] wrongValues = new int[5];
        boolean isWin = false;
        boolean isMistake = false;
        while (right < 5 ){
            System.out.println("Lutfen bir sayi giriniz: ");
            usersNumber = input.nextInt();
            if (usersNumber < 0 || usersNumber > 99){ // girilen sayiların 0 ile 100 arasinda olmasi icin uyarı yazildi
                System.out.println("lutfen 0-100 arasinda sayi giriniz: ");
                if (isMistake){
                    right++;
                    System.out.println("Cok fazla hatali deneme yaptiniz. Kalan hak : " + (5-right));
                } else{
                    isMistake = true;
                    System.out.println("Bir sonraki hatali girisinizde deneme hakkiniz azalacaktir.");
                }
                continue;
            }
            if (usersNumber == number){      // girilen sayi ile üretilen sayinin esit mi oldugu kontrol edildi
                System.out.println("Tebrikler dogru tahmin ettiniz. Tahmin ettiginiz sayi : " + number);
                isWin = true;
                break;
            }
            else {
                System.out.println("Hatali sayi girdiniz");
                if (usersNumber > number){
                    System.out.println(usersNumber + " sayi gizli sayidan buyuktur");
                }
                else {
                    System.out.println(usersNumber + " sayi gizli sayidan kucuktur.");
                }
                wrongValues[right++]= usersNumber; // girilen yanlis degerleri diziye atadi.
                System.out.println("Kalan hakkiniz: " + (5-right));
            }
        }

        if (!isWin){ // kaybedilince ekrana yazdirilacak olan degerler belirtildi
            System.out.println("Kaybettiniz...");
            if (!isMistake){
                System.out.println("Tahminleriniz: " + Arrays.toString(wrongValues));
            }
        }
    }
}
