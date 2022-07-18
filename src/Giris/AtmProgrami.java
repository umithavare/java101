package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class AtmProgrami {
    public static void main(String[] args) {
        int right=5;
        String userName, password;
        double balance =3000;
        int select;
        Scanner input = new Scanner(System.in);
        while(right > 0){
            System.out.println("Kullanıcı adınızı giriniz");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz");
            password = input.nextLine();
            if (userName.equals("admin") && password.equals("admin123")){
                System.out.println("Merhaba Java Bankasına Hoş geldiniz!!");
                do {
                    System.out.println("1-Para Yatırma\n 2-Para çekme\n 3-Bakiye Sorgulama\n 4-Çıkış Yapma");
                    System.out.println("Lütfen Yapmak istediğiniz işlemi Seçiniz.");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Para miktari:");
                            int price= input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Para miktari:");
                            int output = input.nextInt();
                            if (output > balance)
                                System.out.println("Yeterli Bakiyeniz Bulunmamaktadır");
                            else balance -= output;
                            break;
                        case 3:
                            System.out.println("Bakiyenir: \t" +balance);
                            break;
                    }
                }
                while (select != 4);{
                    System.out.println("Hoşçakalın Tekrar Görüşmek Üzere");
                    break;
                    }
            }
            else {
                right--;
                System.out.println("Giriş bilgilerinizi hatali girdiniz. Lütfen Tekrar Deneyiniz");
                if (right==0)
                    System.out.println("Hesabınız bloke olmuştur.Lütfen Banka İle iletişime Geçiniz.");
                else System.out.println("Kalan hakkınız:" +right);
            }
        }
    }
}
