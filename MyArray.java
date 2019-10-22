import java.util.Scanner;

public class MyArray {
   private int [] arr;
    public MyArray(int size)
    {
        arr = new int[size];
    }
   public void getInput()
   {
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       {
           arr[i] = sc.nextInt();
       }
   }
   public void displayArray()
   {
       for(int i=0;i<arr.length;i++)
       {
           System.out.println("Array["+i+"] = "+arr[i]);
       }
   }
   public void doubleElements()
   {
       for(int i=0;i<arr.length;i++)
       {
           arr[i] *=2;
       }
   }
   public void doubleSize()
   {
       int [] temp = new int[arr.length*2];
       int i=0;
       for(;i<arr.length;i++)
           temp[i]=arr[i];
       for(int j=0;i<temp.length;i++,j++)
       {
           temp[i] = arr[j]*2;
       }
           arr=temp;
   }

}
