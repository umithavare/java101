package ArrrayExamples;
/** @umithavare patika.dev linkim: https://app.patika.dev/umith **/

public class arrayHarmonikSayi {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 6};
        float toplam = 0;
        double result = 0;
        for (int sayi : numbers){
            toplam += (1f / sayi );
        }
        result = numbers.length / toplam;
        System.out.println("Dizideki harmonik sayi ortalamasi:\t " + result);
    }
}
