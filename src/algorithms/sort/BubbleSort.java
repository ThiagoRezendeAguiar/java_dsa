package algorithms.sort;

public class BubbleSort extends Sort{

    public BubbleSort(){
        super();
    }

    @Override
    public void sort(){
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length - i - 1; j++){
                comparisons++;
                if(numbers[j] > numbers[j + 1]){
                    swaps++;
                    swap(j, j + 1);
                }
            }
        }
    }

}
