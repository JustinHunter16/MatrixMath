
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    /**
     * Constructor for objects of class MatrixMath
     */
    public MatrixMath(int[][] data)
    {
        // initialise instance variables
        this.data = new int[data.length][data[0].length];
        for(int row=0; row<data.length; row++)
        {
            for(int column=0; column<data[row].length; column++)
            {
                this.data[row][column] = data[row][column];
            }
        }
    }

    /**
     * Find the sum of all the elements in each row.
     * 
     *
     * @return    int[]
     */
    public int[] rowSum()
    {
        int[] sumArray = new int[data.length];
        for(int row=0; row<data.length; row++)
        {
            int sum = 0;
            for(int column=0; column<data[row].length; column++)
            {
                sum += data[row][column];
            }
            sumArray[row] = sum;
        }
        return sumArray;
    }
    
        /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] rowAve()
    {
        double average[] = new double[data.length];
        for(int i=0; i<data.length; i++)
        {
            average[i] =(1.0)*rowSum()[i]/data[i].length;
        }
        return average;
    }
    
        /**
     * Find the sum of all the numbers in column
     * 
     *
     * @return    int[] 
     */
    public int[] colSum()
    {
        int[] sumArray = new int[data[0].length];
        for(int column=0; column<data[0].length; column++)
        {
            int sum = 0;
            for(int row=0; row<data.length; row++)
            {
                sum += data[row][column];
            }
            sumArray[column] = sum;
        }
        return sumArray;
    }
    
     /**
     * Find the average of all the values in each row
     *
     * @return    int[] 
     */
    public double[] colAve()
    {
        double[] average = new double[data[0].length];
        for(int i=0; i<data[0].length; i++)
        {
            average[i] = (1.0)*colSum()[i]/data.length;
        }
        return average;
    }
}
