import java.util.Scanner;
public class assign3
{

    public static int[] odd_even (int arr[]){
        int res[]=new int[2];
        int sum_even=0;
        int sum_odd=0;

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

 public static int[] max_min(int arr[])
    {
        int min=99;
        int max=-99;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        int res[] = new int[2];
        res[0]=max;
        res[1]=min;

        return res;
    }
    public static int[] average(int arr[])
    {
        int res[]= new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];
        int avg=sum/arr.length;

        for(int i=0;i<arr.length;i++)
        res[i]=arr[i]-avg;

        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=in.nextInt();
        System.out.println("Enter the array elements");
        int arrayy[]=new int[size];

        for(int i=0;i<size;i++)
        arrayy[i]=in.nextInt();


        int choice=9;
        while(choice !=0){

            System.out.println("Enter your choice (Zero to quit)");
            System.out.println("1: Max and Min Elements");
            System.out.println("2: Differences of Average");
            System.out.println("3: Sum of Even and odd");
            System.out.println("0: Quit");
            choice=in.nextInt();
            if(choice==1)
                System.out.println("The max and min elements are: " + max_min(arrayy)[0] + " and " + max_min(arrayy)[1] + " respectively");
            if(choice==2){
                System.out.println("differences of average is:");
            for(int i=0;i<arrayy.length;i++)
                System.out.print(average(arrayy)[i]+" ");
        }
            if(choice==3){
        System.out.println("Sum of even and odd elements are: " + odd_even(arrayy)[0] +" "+ odd_even(arrayy)[1]+ "respectıvely");
        }
    }

    }
}