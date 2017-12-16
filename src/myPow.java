import javax.sound.midi.Soundbank;

/**
 * Created by Chenggang on 17/12/14.
 *
 * 简单的递归调用在n很大时会导致栈溢出stackoverflow，所以减少递归次数，增加相应次数的循环，即可解决问题
 * 在减少空间复杂度的同时，增加时间复杂度
 */

public class myPow {
    public double Solution(double x,int n){
        if(n == 0) return 1.;
        double res = Solution(x, n / 2);   //每次迭代先计算n/2次方
        return n % 2 == 0 ? res * res : n < 0 ? res * res * (1 / x) : res * res * x;
    }
}
