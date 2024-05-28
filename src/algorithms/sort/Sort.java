package algorithms.sort;
import java.util.Random;

public abstract class Sort {

    protected int[] numbers;
    protected int length;

    protected int comparisons;
    protected int swaps;

    public Sort(){
        Random random = new Random();
        this.comparisons = 0;
        this.swaps = 0;
        this.length = random.nextInt(20, 150);
        this.numbers = new int[this.length];
        for(int i = 0; i < this.length; i++){
            this.numbers[i] = random.nextInt(1000);
        }
    }

    protected void swap(int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
    public abstract void sort();

    public void print(){
        for(int number: numbers){
            System.out.print(number + " ");
        }
        if(comparisons != 0 && swaps != 0){
            System.out.println("\n\nTotal number of comparisons: " + comparisons);
            System.out.println("Total number of swaps: " + swaps);
        }

    }
}
