package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        double km=0, normalTutar=0;
        double yasIndirimi, indirimliTutar=0;
        double yolculukTipiIndirimi=0, toplamTutar=0;
        double yasIndirimOrani=0;
        int yas, yolculukTipi;
        Scanner input = new Scanner(System.in);


        System.out.println("Lütfen gitmek istediğiniz mesafeyi km cinsinden yazınız:\n");
        km = input.nextDouble();
        if (km <= 0)
            System.out.println("hatali km girdiniz. Programi tekrardan başlatınız.");
        System.out.println("Lütfen Yaşınızı giriniz:");
        yas = input.nextInt();
        if (yas < 12){
            yasIndirimOrani = 0.5;
        } else if (yas > 12 && yas < 24) {
            yasIndirimOrani = 0.1;
        }
        else if (yas < 65){
            yasIndirimOrani = 0.3;
        }
        System.out.println("yolculuk tipini seçiniz:\n 1- Gidiş\n   2- Gidiş-dönüş");
        yolculukTipi = input.nextInt();
        if(yolculukTipi == 1) {
            System.out.println("Sadece gidiş bileti seçtiniz.");
            yolculukTipiIndirimi= 0;
            normalTutar = km * 0.10;
            yasIndirimi = normalTutar * yasIndirimOrani;
            indirimliTutar = normalTutar - yasIndirimi;
            toplamTutar = indirimliTutar;
            System.out.println("Kilometre:" +km + "\nyolculuk tipi:" + yolculukTipi + "\nyas indirim oranı : " +yasIndirimOrani + "\nyas indirimi : " + yasIndirimi + "\nyolculuk tipi inidirmi:" + yolculukTipiIndirimi + "\ntoplam tutar : " + toplamTutar);


        }
        else if(yolculukTipi == 2) {
            System.out.println("gidis-dönüs bileti seçtiniz.");
            yolculukTipiIndirimi = indirimliTutar * 0.20 ;
            normalTutar = km * 0.10;
            yasIndirimi = normalTutar * yasIndirimOrani;
            indirimliTutar = normalTutar - yasIndirimi;
            toplamTutar = (indirimliTutar - yolculukTipiIndirimi) * 2;
            System.out.println("Kilometre:" +km + "\nyolculuk tipi:" + yolculukTipi + "\nyas indirim oranı : " +yasIndirimOrani + "\nyas indirimi : " + yasIndirimi + "\nyolculuk tipi inidirmi:" + yolculukTipiIndirimi + "\ntoplam tutar : " + toplamTutar);

        }
        else
            System.out.println("yanlış seçim yaptınız. Tekrardan deneyiniz.");


    }
}

