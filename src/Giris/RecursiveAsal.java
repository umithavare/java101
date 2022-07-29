package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class RecursiveAsal {
    static boolean asalMi(int sayi,int index){
        if(sayi <= 2)
            return (sayi==2)?true :false;
        if (sayi % index == 0 )
            return false;
        if (index*index > sayi)
            return true;
        return asalMi(sayi,index+1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Lutfen sorgulamak istediğinz sayiyi giriniz:");
            int sayi = input.nextInt();
            if (asalMi(sayi,2)) {
                System.out.println(sayi + " Asal sayidir.");
            }
            else System.out.println(sayi + " Asal sayi degildir.");
        }
    }
}
