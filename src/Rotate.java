/**
 * Created by Chenggang on 17/12/14.
 *
 */
public class Rotate {
    public void Solution(int [][] matrix){
        int length = matrix[0].length;

        for(int i=0;i<=length/2;i++){
            for(int j =i;j<=length-2-i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[length-1-j][i];
                matrix[length-1-j][i]=matrix[length-1-i][length-1-j];
                matrix[length-1-i][length-j-1]=matrix[j][length-1-i];
                matrix[j][length-1-i]=temp;
            }
        }

    }
}
