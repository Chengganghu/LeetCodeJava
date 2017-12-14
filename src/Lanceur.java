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
        System.out.println(convert);
        System.out.println(resapproach3);
        System.out.println(resapproach2);
        System.out.println(res);
    }
}
