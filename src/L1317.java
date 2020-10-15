public class L1317 {
    public int[] getNoZeroIntegers(int n) {

        for(int a = 1; a <= (n+1)/2; a++){
            if(isNoZero(a) && isNoZero(n-a)){
                return new int[]{a,n-a};
            }
        }
        return new int[]{0,0};
    }

    public boolean isNoZero(int num){
        while(num > 0){
            if(num % 10 == 0){

                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
