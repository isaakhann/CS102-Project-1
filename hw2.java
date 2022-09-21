public class hw2{
    public static int[] odd_even (int arr[]){
        int res[]=new int[2];
        int sum_even;
        int sum_odd;

        for (int i=0 ; i<arr.length ; i++){
            if(i%2 ==0)
            sum_even+=arr[i];
            else
            sum_odd+=arr[i];
        }
        res[0]=sum_even;
        res[1]=sum_odd;

        return res;
        }
}
