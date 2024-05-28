package algorithms.sort;

public class Main {
    public static void main(String[] args) {
        Sort sort = new QuickSort();

        System.out.println("Before sorting: ");
        sort.print();

        sort.sort();

        System.out.println("\nAfter sorting: ");
        sort.print();
    }
}
