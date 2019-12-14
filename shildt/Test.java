package shildt;

import java.util.Arrays;

public class Test {
    static void recursion(int arr[]){
        int i = arr.length - 1;
        System.out.print(arr[i] + " ");
        if(i > 0) recursion(Arrays.copyOf(arr, i));

        //System.out.println(arr.length - 1);
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 7, 11, 123123123};

        recursion(a);



    }
}
