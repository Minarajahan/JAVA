import java.util.Arrays;

class SortingArray {

    static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {5, 1, 8, 3, 2};
        SortingArray.sortArray(intArray);


        Float[] floatArray = {5.4f, 1.2f, 8.8f, 3.3f, 2.1f};
        SortingArray.sortArray(floatArray);
    }
}
