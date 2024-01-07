import java.util.Scanner;
public class TransposeOfArray {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        int rowTrans = array[1].length;
        int colTrans = array.length;
        Scanner element = new Scanner(System.in);
        int[][] transpose = new int[rowTrans][colTrans];
        System.out.println("Matris : ");
        for (int i=0 ; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                array[i][j]=element.nextInt();
            }
        }
        for(int i=0; i<transpose.length ; i++){
            for(int j=0; j<transpose[i].length; j++){
                transpose[i][j]=array[j][i];
            }
        }
        System.out.println("Transpose : ");
        for(int[] row:transpose){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}