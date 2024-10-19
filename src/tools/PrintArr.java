package tools;

public class PrintArr {
    public static void PrintArr(int[] arr){
        System.out.print("[");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(i== arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }
}
