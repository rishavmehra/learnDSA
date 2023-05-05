import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static List<Integer> findDuplicate(int[] arr) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1){
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }

}
