import java.util.Arrays;
/**
 * Write a description of class MatrixMathDriver here.
 *
 * @author (Mr. Kim)
 * @version (October 28. 2019)
 */
public class MatrixMathDriver
{
    public static void main(String[] args)
    {
        int[][] A=  { {1,2,3},{2,1,0},{1,0,2}};
        int[][] B = { {1,2,3,4,5}, {2,4,6,8,10}, {1,3,5,7,9}};
        int[][] C = { {-1,-2,-3},{-2,-3,-4},{4,3,5},{2,0,-1},{5,1,3} };
        
        MatrixMath mathA = new MatrixMath(A);
		
		/* TODO
		 * Use Arrays.toString on the results below
		 */
        System.out.println(Arrays.toString(mathA.rowSum()));
        System.out.println(Arrays.toString(mathA.rowAve()));
        System.out.println(Arrays.toString(mathA.colSum()));
        System.out.println(Arrays.toString(mathA.colAve()));
        
        MatrixMath mathB = new MatrixMath(B);
        mathB.rowSum();
        mathB.rowAve();
        mathB.colSum();
        mathB.colAve();
    }
}
