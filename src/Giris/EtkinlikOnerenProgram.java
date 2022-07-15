package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

/**
 * Koşullar :
 *
 *     Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
 *     Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
 *     Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
 *     Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 *
 * Ödev
 *
 * Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
 */

public class EtkinlikOnerenProgram {
    public static void main(String[] args) {
        double havaSicakligi;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Hava Sıcaklığını Santigrat cinsinden giriniz:\t");
        havaSicakligi = input.nextDouble();
        if (havaSicakligi < 5)
            System.out.println("Kayak yapabilirsiniz.");
        if (havaSicakligi >= 5 && havaSicakligi <= 15)
            System.out.println("Sinemaya Gitmek için Harika bir Sıcaklık. Sinemaya gidebilirsiniz.");
        if (havaSicakligi >=15 && havaSicakligi <= 25)
            System.out.println("Piknik için harika bir Sıcaklık. Pikniğe gidebilirisiniz.");
        if (havaSicakligi > 25)
            System.out.println("Hava çok sıcak. Yüzmeye gidebilirsiniz.");
    }
}

