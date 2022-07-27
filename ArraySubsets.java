import java.util.ArrayList;
import java.util.List;

public class ArraySubsets {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        List<List<Integer>> result = subsets(nums);
       for (List<Integer> list : result) {
        for (int list2 : list) {
            System.out.print(list2);
        }
        System.out.println("");
       }
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int length = (int) Math.pow(2,nums.length);
        for(int i=0;i<length;i++){
            result.add(SubSetItem(nums,i));
        }

        result.add(new ArrayList<Integer>());
        
        return result;
    }
    
    private static List<Integer> SubSetItem(int[] nums, int num){
        int pos=0;
        List<Integer> subset =new ArrayList<Integer>();
        while(num != 0){
            if((num & 1) == 1){
                subset.add(nums[pos]);
            }
            pos++;
            num = num >> 1;
        }
        
        return subset;
    }
}
