package ArrrayExamples;
import java.util.Arrays;
import java.util.Scanner;
public class arrayMaxMinFinder {
    public static void main(String[] args) {
        double number;
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number:\t");
        number = input.nextDouble();
        Arrays.sort(list); // diziyi küçükten büyüğe doğru sıralıyoruz.
        int maxClosevalue = 0 ;
        int minClosevalue = 0 ;
        for (int counter : list){ // en yakın max değer bulunuyor.
            if (number < counter) {
                maxClosevalue = counter;
                break;
            }
        }
        for(int i = list.length-1; i > 0; i--){ //en yakın min deger bulunuyor
            if (number > list[i]) {
                minClosevalue = list[i];
                break;
            }
        }
        System.out.println("Max Close Value is = " + maxClosevalue);
        System.out.println("Min Close Value is = " + minClosevalue);
    }
}
