package algorithms.sort;

public class SelectionSort extends Sort{

    public SelectionSort() {
        super();
    }

    @Override
    public void sort() {
        for(int i = 0; i < (length - 1); i++){
            int menor = i;
            for(int j = (i + 1); j < length; j++) {
                comparisons++;
                if(numbers[menor] > numbers[j])
                    menor = j;
            }
            swaps++;
            swap(i, menor);
        }
    }
}
