public class UniqueNumber2 {
    public static void main(String[] args) {
        int arr[] =new int[2];
        arr= singleNumber(new int[] {1, 2, 3, 2, 1, 4});
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static int[] singleNumber(int[] nums)
    {
        // Code here
        int XOROne=0,first=0,second=0;
        int res[] =new int[2];
        for(int i=0;i<nums.length;i++){
            XOROne^=nums[i];
        }
        int pos=FirstSetBitPos(XOROne);
        for(int i=0;i<nums.length;i++){
            if(MatchingSetBitPos(nums[i],pos)){
                first^=nums[i];
            }
        }
       second = first ^ XOROne; 
       if(first<=second){
       res[0]=first;
       res[1]=second;       
       }
       else
       {
       res[0]=second;
       res[1]=first; 
       }
       return res;
    }
    
    private static int FirstSetBitPos(int num){
        int pos=0;
         while(num>0){
            if((num & 1) == 1)
            {
                break;
            }
            else{
                num=num >> 1;
                pos++;
            }
        }
        return pos;
    }
    
    private static boolean MatchingSetBitPos(int num, int pos){
        return ((num >> pos) & 1) == 1 ? true:false;
    }
}
