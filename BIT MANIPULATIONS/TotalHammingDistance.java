public class TotalHammingDistance {
    public static void main(String[] args) {
        int arr[] =new int[]{4,14,2};
        System.out.println(totalHammingDistance(arr));
    }
    public static int totalHammingDistance(int[] nums) {
        
        int length=nums.length;
        int sum=0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                sum+= hammingDistance(nums[i],nums[j]);
            }
        }
        
        
        return sum;
    }
    
    private static int hammingDistance(int a, int b){
        int count=0;
         for(int i=0;i<32;i++){
        if((a & 1) != (b & 1))
               count++;
             a= a >> 1;
             b= b >> 1;
        }
        System.out.println(count);
        return count;
    }
}
