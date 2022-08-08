public class DivSum {
    public static void main(String[] args) {
        int arr[] =new int[]{0,1,2,3,4};
        System.out.println(subarraysDivByK(arr, 3));
    }
    
    public static int subarraysDivByK(int[] nums, int k) {
        int mod[] =new int[nums.length];
        mod[0]++;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            mod[sum%k]++;
        }
        int ans =0;
        for(int i=0;i<mod.length;i++){
            int x=mod[i];
            ans+=(x * (x-1))/2;
        }

        return ans;

    }
}
