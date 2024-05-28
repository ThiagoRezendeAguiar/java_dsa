package algorithms.sort;

public class QuickSort extends Sort{

    public QuickSort(){
        super();
    }
    @Override
    public void sort() {
        sort(0, length-1);
    }

    private void sort(int left, int right){
        int i = left, j = right;
        int pivot = numbers[(left+right)/2];
        while(i <= j){
            while (numbers[i] < pivot){
                i++;
                comparisons++;
            }
            comparisons++;
            while (numbers[j] > pivot){
                j--;
                comparisons++;
            }
            comparisons++;
            if (i <= j) {
                swap(i, j);
                swaps++;
                i++;
                j--;
            }
        }
        if (left < j)  sort(left, j);
        if (i < right)  sort(i, right);
    }
}
