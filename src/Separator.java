import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Separator {
    int[] array;
    public Separator(int[] array){
        this.array = array;
    }
    public int[] even(){
        int evenSize = 0;
        for (int value : array) {
            if (value % 2 == 0)
                evenSize++;
        }
        // odd and even arrays with size
        int[] even = new int[evenSize];
        // odd and even array iterator
        int j = 0;
        for (int k : array) {
            if (k % 2 == 0)
                even[j++] = k;
        }
        return even;
    }
    public int[] odd() {
        int oddSize = 0;
        for (int value : array) {
            if (value % 2 != 0)
                oddSize++;
        }
        // odd and even arrays with size
        int[] odd = new int[oddSize];
        int k = 0;
        for (int j : array) {
            if (j % 2 != 0)
                odd[k++] = j;
        }
        return odd;
    }

}
