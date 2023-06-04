package ArrrayExamples;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class arrayValueSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac adet sayi gireceksiniz"); // girilmek istenen sayi adetini aldik.
        int adet = input.nextInt();
        int[] list = new int[adet];
        System.out.println("Dizinin elemanlarini giriniz;"); // girilen adet kadar eleman topladık.
        for(int i=0 ; i < adet ; i++){
            System.out.println((i + 1 + ". sayiyi giriniz: ") );
            list[i] = input.nextInt();
        }
        Arrays.sort(list); // diziyi kucukten buyuge sıraladık
        System.out.println("Siralama: " + Arrays.toString(list)); // diziyi string olarak yazdırdık
    }
}
