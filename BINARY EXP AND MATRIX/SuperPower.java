public class SuperPower {
    public static void main(String[] args) {
        int arr[] =new int[]{1,0,0};
        int num=2;
        int mod=1337;
        int power = 1;
        for(int i=0;i<arr.length;i++){
            power= (calulatePower(power,10,mod) * calulatePower(num, arr[i] , mod)) % mod;
        }

        System.out.println(power);
    }

    private static int calulatePower(int a, int b, int mod){
        int result=1;
        while(b !=0){
            if((b & 1) == 1){
                result=(result * a) % mod;
            }
            a*=a;
            a=a % mod;
            b= b>>1;
        }
        return result;
    }
    
}
