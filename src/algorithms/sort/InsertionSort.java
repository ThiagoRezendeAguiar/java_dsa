package algorithms.sort;

public class InsertionSort extends Sort{

    public InsertionSort(){
        super();
    }
    @Override
    public void sort() {
        for(int i = 1; i < length; i++){
            int tmp = numbers[i];
            int j;
            for(j = (i - 1); j >= 0 && numbers[j] > tmp;j--){
                comparisons++;
                numbers[j + 1] = numbers[j];
                swaps++;
            }
            comparisons++;
            numbers[j + 1] = tmp;
            swaps++;
        }
    }
}
