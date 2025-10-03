//Java program to reverse an array
public class ArrayReversal
{
  public static void reverseArray(int[] arr)
  {
        int start = 0;
        int end = arr.length - 1;
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i : myArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        reverseArray(myArray);
        System.out.println("Reversed Array: ");
        for (int i : myArray)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
