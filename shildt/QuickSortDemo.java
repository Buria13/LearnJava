package shildt;

public class QuickSortDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'х', 'a', 'r', 'p', 'j', 'i'};

        for (char i : a) {
            System.out.print(i + " ");
        }

        QuickSort.qsort(a);
        System.out.println();


        for (char i : a) {
            System.out.print(i + " ");
        }
    }
}
