package ArrrayExamples;

public class bYazdiranProgram {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) { // satırları kontrol edip yıldızları ekliyoruz
                    letter[i][j] = " * ";
                }
                else if (j == 0 || j == 3) { // sütünları kontrol edip yıldızları ekliyoruz
                    letter[i][j] = " * ";
                }
                else {
                    letter[i][j] = "   "; // bunlar dışında kalanlara boşluk ekliyoruz
                }
            }
        }

        for(String[] row: letter){ //for each yaparak matrisimizi yazdırıyoruz
            for(String col: row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
