package algorithms.search;

public class Search {

    /**
     * Linear Search <br>
     * O(n)
     * */
    public static int linearSearch(int[] numbers, int number){
        int steps = 0;
        for(int i = 0; i < numbers.length; i++){
            steps++;
            if(numbers[i] == number){
                System.out.println("Number of steps taken by Linear Search: " + steps);
                return i;
            }
        }
        System.out.println("Number of steps taken by Linear Search: " + steps);
        return -1;
    }

    /**
     * Binary Search <br>
     * O(log(n))
     * */
    public static int binarySearch(int[] numbers, int number){
        int left = 0, right = numbers.length - 1, middle, steps = 0;
        while(left <= right){
            steps++;
            middle = (left + right) / 2;

            if(numbers[middle] == number){
                System.out.println("Number of steps taken by Binary Search: " + steps);
                return middle;
            } else if(numbers[middle] > number){
                right =  middle - 1;
            } else {
                left =  middle + 1;
            }

        }

        System.out.println("Number of steps taken by Binary Search: " + steps);
        return -1;
    }

    public static int recursiveBinarySearch(int[] numbers, int number, int left,int right){
        if(left <= right){
            int middle = (left + right) / 2;
            if(numbers[middle] == number){
                return middle;
            } else if(numbers[middle] > number){
                return recursiveBinarySearch( numbers , number, left,middle - 1);
            } else {
                return recursiveBinarySearch( numbers , number,middle + 1, right);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {3, 5, 7, 8, 20, 45};


        System.out.println("Position: " + linearSearch(array, 45));
        System.out.println("Position: " + binarySearch(array, 45));
        System.out.println("Position: " + recursiveBinarySearch(array, 45,0, array.length));
    }
}
