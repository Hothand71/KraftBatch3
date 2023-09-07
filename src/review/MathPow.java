package review;

public class MathPow {
    public static double pow(int count1,int count2){
        int result=1;
        for (int i = 0; i < count2; i++) {
            result=result*count1;
        }
        return result;
    }
}
