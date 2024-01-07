import java.util.Arrays;
public class FrekansOfElementsInArray {
    public static void main(String[] args) {
        int[] array = {2,200,200,62,42,9,5,32,65,32};
        int[] sortArr = new int[array.length];
        for (int a=0 ; a<array.length; a++){
            sortArr[a] = array[a];
        }
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(array));

        int repeated=0;
        for(int b=0 ; b<sortArr.length ; b++){
            int frekans = 0;
            if(sortArr[b]%2==0 && repeated!=sortArr[b]){
                for(int c=b ; c<sortArr.length; c++){
                    if(sortArr[b]==sortArr[c]){
                        frekans++;
                    }
                    if(frekans!=1){
                        repeated=sortArr[b];
                    }
                }
                System.out.println(sortArr[b]+" was repeated "+frekans+" times");
            }
        }
    }
}