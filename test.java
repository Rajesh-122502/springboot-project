import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] nums = { 3, 3 };
        int target = 6;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == target) {
                break;
            } else if (arr[i] + arr[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        int[] result = new int[2];
        int x=0;
        for (x = 0; x < nums.length; x++) {
            if (nums[x] == arr[i]){
                result[0] = x;
                break;
            }
        }
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] == arr[j]){
                if(x!=y){
                result[1] = y;
                break;
            }
            }
        }
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}


/*
int[] arr= nums.clone();
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        int[] result = new int[2];
        int x=0;
        for (x = 0; x < nums.length; x++) {
            if (nums[x] == arr[i]){
                result[0] = x;
                break;
            }
        }
        for (int y = 0; y < nums.length; y++) {
            if (nums[y] == arr[j]){
                if(x!=y){
                result[1] = y;
                break;
            }
            }
        }
        return result;    */