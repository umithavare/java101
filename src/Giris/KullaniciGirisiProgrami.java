package Giris;
import java.util.Scanner;
public class KullaniciGirisiProgrami {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int secim;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz:\t");
        userName = input.nextLine();
        System.out.println("Lütfen Şifre Giriniz:\t");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("12345")) {
            System.out.println("Başarılı Bir şekilde Giriş Yaptınız");
        } else if (userName.equals("patika") && (password != "12345")) {
            System.out.println("Şifre Yanlış. Şifreyi sıfırlamak isterseniz 1'e İstemiyorsanız 2' ye Tıklayınız.");
            secim = input.nextInt();
            if (secim == 1) {
                System.out.println("Lütfen Yeni Şifre Giriniz:");
                newPassword = input.nextLine();
                if (newPassword.equals(password) || newPassword.equals("12345"))
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                else {
                    password = newPassword;
                    System.out.println("Yeni Şifre Başarıyla oluşturuldu");
                }
            } else if (secim == 2)
                System.out.println("lütfen Tekrardan Giriş Yapmayı deneyiniz.");

            else {
                System.out.println("Yanlış Seçim yaptınız");
            }
        } else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
