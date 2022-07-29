package Giris;
import java.util.Scanner;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/
public class RecursiveUsHesabi {

    static int us(int base, int exp)
    {
        if (exp == 0 )
            return 1 ;
        else return  base * us(base , exp -1);
    }

    public static void main(String[] args) {
        System.out.println("Please enter your  base value:");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        System.out.println("Please enter your exponent value:");
        int exp = input.nextInt();
        System.out.println(us(base,exp));
    }
}
