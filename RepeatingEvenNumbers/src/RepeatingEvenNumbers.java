import java.util.Arrays;
public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] array = {2,5,6,2,7,3,21,3,6,7,8,30};
        int[] result = new int[array.length];
        int resultIndex=0;
        for(int i=0 ; i<array.length; i++){
            for (int j=0 ; j<array.length; j++){
                if(array[i]%2==0){
                    if((i!=j)  && (array[i]==array[j])){
                        result[resultIndex++]=array[j];
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}