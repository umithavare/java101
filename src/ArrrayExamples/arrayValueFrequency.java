package ArrrayExamples;

public class arrayValueFrequency {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        boolean[] visited = new boolean[list.length];

        for (int i = 0; i < list.length; i++) {
            if (visited[i]) {
                continue; // Daha önce ziyaret edilmiş bir sayıyı tekrar işleme alma
            }
            int count = 1;

            for (int j = i + 1; j < list.length; j++) { // elemanlari gezip ayni olanlari buluyor ve toplam kac tane oldugunu sayiyor
                if (list[i] == list[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            if (count >=2) // 2 ve ustu ayni eleman varsa ekrana yazdiriyor
            System.out.println(list[i] + " sayisi " + count + " kere yazildi.");
        }
    }
}
