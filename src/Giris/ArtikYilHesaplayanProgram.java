package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class ArtikYilHesaplayanProgram {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Artık yıl sorgulamak için yıl giriniz orn:2000 :\t");
        yil = input.nextInt();
        if (yil % 4 ==0 || yil % 400 == 0)
            System.out.println(yil + "\tArtık yıldır.");
        else System.out.println(yil + "\t Artık yıl değildir.");

    }
}

