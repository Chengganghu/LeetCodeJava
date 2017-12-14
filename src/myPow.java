import javax.sound.midi.Soundbank;

/**
 * Created by Chenggang on 17/12/14.
 */
public class myPow {
    public double Solution(double x,int n){
        if(n == 0) return 1.;
        double res = Solution(x, n / 2);
        return n % 2 == 0 ? res * res : n < 0 ? res * res * (1 / x) : res * res * x;
    }
}
