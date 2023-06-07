package palindromeGame;
import java.util.Arrays;
public class palindrome {
    static boolean isPalindrome (String str){ // 1. Yol charAt metodu ile karakterlerin eşit olup olmadıklari kontrol edilir.
        int i = 0 , j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j))
                return  false;
                i++;
                j--;
        }
        return true;
    }

    static boolean isPalindrome2 (String str){ // 2.yol equals metodunu kullnarak eşit olup olmadıklarını kontrol edilir.
        String  reverse = "" ;
        for( int i = str.length() - 1 ; i >= 0 ; i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) { // main fonksiyonumuzda metodlarımızı cagırıyoruz.
        System.out.println(isPalindrome2("kavak"));
    }
}
