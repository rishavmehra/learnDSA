import java.util.Arrays;

class MissingNumber {
 //https://leetcode.com/problems/missing-number/description/

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 0, 4};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length){
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correct]){
            swap(arr, i, correct);
            } else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++){
            if(arr[index] != index){
                return  index;
            }
        }
        return arr.length;
        
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] = temp;
    }
}