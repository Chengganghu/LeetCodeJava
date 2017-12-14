import java.util.LinkedList;
import java.util.List;

/**
 * Created by Chenggang on 17/12/14.
 */
public class ZigZag {
    public String convert(String s , int numRows){
        List<StringBuffer> list = new LinkedList<StringBuffer>();
        if(numRows==1)
            return s;
        else{
            for(int i=0;i<2*(numRows-1);i++){
                list.add(new StringBuffer());
            }
            for(int j=0 ;j<s.length();j++){
                int temp = j%(2*(numRows-1));
                for(int k=0;k<2*(numRows-1);k++){
                    if(temp==k) {
                        if(k<=numRows-1) list.get(temp).append(s.charAt(j));
                        else list.get(2*(numRows-1)-temp).append(s.charAt(j));
                    }
                }
            }
            StringBuffer last = new StringBuffer();
            for(int i = 0;i<2*(numRows-1);i++){
                last.append(list.get(i));
            }
            return last.toString();
        }

    }

}
