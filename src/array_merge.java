import java.util.Scanner;
public class array_merge {
    public static void main(String[] args) {
        int[] arr1 = makeArr1();
        int[] arr2 = makeArr2();
        int[] arr3 = arrMerge(arr1,arr2);
        for (int i = 0; i < arr3.length; i++){
            System.out.print (arr3[i]+ " ");
        }
    }
    public static int[] makeArr1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array 1: ");
        int length1;
        length1 = scanner.nextInt();
        int[] arr1 = new int[length1];
        for (int i = 0; i< length1; i++){
            System.out.println("Enter position element: "+ i );
            arr1[i] = scanner.nextInt();
        }
        return arr1;
    }
    public static int[] makeArr2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array 2: ");
        int length2;
        length2 = scanner.nextInt();
        int[] arr2 = new int[length2];
        for (int i = 0; i< length2; i++){
            System.out.println("Enter position element:  "+ i );
            arr2[i] = scanner.nextInt();
        }
        return arr2;
    }
    public static int[] arrMerge(int[] arr1, int[] arr2) {
        int[] arrMerge = new int[arr1.length + arr2.length];
        for (int i = 0; i< arrMerge.length; i++){
            if (i< arr1.length){
                arrMerge[i] = arr1[i];
            }
            else {
                arrMerge[i] = arr2[i - arr1.length];
            }
        }
        return arrMerge;
    }
}