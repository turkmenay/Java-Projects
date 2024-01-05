public class MinAndMaxValueOfArray {
    public static void main(String[] args) {

        int[] arr = {1,3,5,8,-300,25,20,660,49,4};
        int min = arr[0];
        int max = arr[0];
        for (int a:arr) {
            if(a<min)
                min=a;
            if(a>max)
                max=a;
        }
        System.out.println("Minimum Value of Array : "+min);
        System.out.println("Maximum Value of Array : "+max);
    }
}