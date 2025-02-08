package lab3.sort;

public class LabSorter {
    
    public int[] sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LarSorterTest {


    @Test
    public void test() {

        int[] sourceArray = new int[]{5, 8, 3, 2, 97, 23, 56, 12, 7, 44, 22};

        int[] result = new LabSorter().sort(sourceArray);

        Assertions.assertNotNull(result);

        int lastElement = Integer.MIN_VALUE;
        for (int i = 0; i < result.length; i++) {
            Assertions.assertTrue(lastElement < result[i]);
            lastElement = result[i];
        }
    }
}
