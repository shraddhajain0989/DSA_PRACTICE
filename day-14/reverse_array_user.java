import java.util.Scanner;
public class reverse_array_user {
    public static void main(String[]args)
    {   

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<size;i++)
    {
        arr[i]=sc.nextInt();
    }
    reverseArray(arr);
    System.out.println("Reversed array: ");
    for(int i=0;i<size;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
