import java.util.*;
class delete_an_element{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the element");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position ");
        int pos=sc.nextInt();
        // System.out.println("Enter the element");
        // int ele=sc.nextInt();
        for(int i=(pos-1);i<(size-1);i++){
            arr[i]=arr[i+1];
        }
        size--;
        //arr[pos-1]=ele;
        System.out.println("After deletion");
        for(int i=i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}