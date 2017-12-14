/**
 * Created by Chenggang on 17/12/13.
 */
public class Lanceur {
    public static void main(String[] args){
        SubString s = new SubString();
        int res = s.lengthOfLongestSubString("abcabcbb");
        int resapproach2 = s.lengthOfLongestSubstringApproach2("abcacbbb");
        int resapproach3 = s.lengthOfLongestSubstringApproach3("abcabcbb");
        ZigZag zz = new ZigZag();
        String convert = zz.convert("PAYPALISHIRING",3);
        Rotate r = new Rotate();
        int[][] array = {{1,2,3,4},{5,7,6,8},{9,10,11,12},{13,14,15,16}};
        r.Solution(array);
        System.out.println(convert);
        System.out.println(resapproach3);
        System.out.println(resapproach2);
        System.out.println(res);
    }
}
