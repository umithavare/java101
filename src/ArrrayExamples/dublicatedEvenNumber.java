package ArrrayExamples;
import java.util.Arrays;
public class dublicatedEvenNumber {

    static boolean isFind(int[] arr, int value){ //Tekrar eden sayıları 1 kere yazdırmak için kullanılıyor
        for (int i : arr){
            if(i == value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] list = { 2,3,6,6,8,10,14,7,8,12,14,16,14};
        int[] dublicateEvenNumber = new int[list.length];
        int startIndex = 0;
        for(int i = 0 ; i < list.length ; i++){
            for(int j = 0 ; j < list.length ; j++){ //değerleri geziyoruz
                if((i != j) && list[i] == list[j]){ // indeksleri farklı değerleri aynı olan sayıları buluyoruz
                    if(!isFind(dublicateEvenNumber, list[i])){
                        if(list[i] % 2 ==0){ // bulunan sayılar çift mi kontrol ediyoruz
                            dublicateEvenNumber[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }


        for(int value : dublicateEvenNumber){ // for each yaparak ekrana yazdırıyoruz
            if(value != 0 ){
                System.out.println(value);
            }
        }
    }
}
