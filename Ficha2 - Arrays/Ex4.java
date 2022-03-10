import java.util.Arrays;

public class Ex4 {

    public int[] ordenaArrayCrescente ( int[] array) {
        Arrays.sort(array);
        return array;
    }

    public int binarySearch( int[] array, int value){
        return Arrays.binarySearch(array,value);
    }

}
