package ArrrayExamples;

public class matrixTranspose {
    public static void main(String[] args) {
        int [][] matrix = { {2,3,4}, {5,6,4} }; // matrisi tanımladık
        int [][] matrixT = new int [matrix[0].length][matrix.length];
        System.out.println("A matrisi");    // A matrisini yazdırdık
        for(int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(+ matrix[i][j]+ " ");
            }
            System.out.println();
        }
        for(int i = 0 ; i < matrix.length ; i++){ // a matrisinin transpozu alındı
            for (int j = 0 ; j < matrix[i].length ; j++){
                matrixT[j][i] =  matrix[i][j];
            }
            System.out.println();
        }
        System.out.println("A matrisinin transpozu "); // transpozu ekrana yazdırdık
        for (int i = 0; i < matrixT.length; i++) {
            for (int j = 0; j < matrixT[i].length; j++) {
                System.out.print(matrixT[i][j] + " ");
            }
            System.out.println();
        }
    }
}
