public class UniqueNumberThree {

    public static void main(String[] args) {
        int arr[] =new int[]{-2,-2,1,1,4,1,4,4,-4,-2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int arr[] =new int[32];
        for(int i=0;i<nums.length;i++){
           arr = UpdateSum(arr,nums[i]);             
        }
        
        for(int j=0;j<32;j++){
            arr[j]= arr[j] % 3;
        }               
        
        return ConvertBinaryArrayToNumber(arr);
    }
    
    private static int[] UpdateSum(int arr[], int num){
        for(int i=0;i<32;i++){
            int iThBit = num & (1 << i);
            if(iThBit > 0){
                arr[i]++;
            }
        }
        
        return arr;
    }
    
    private static int ConvertBinaryArrayToNumber(int arr[]){
        int result=0;
        for(int i=0;i<32;i++){
            result = result+ (arr[i] * (1<<i)); 
        }
        
        return result;
    }
    
}
