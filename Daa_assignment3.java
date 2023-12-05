import java.util.Arrays;

public class Daa_assignment3 {
    public static void main(String[] args) {
        int w = 20;
        int [][] weightprofit = {{3, 10}, {5,20},{5,21},{8,30},{4,16}};
        System.out.println("The max profit is: ");
        System.out.println(solveknapsack(w, weightprofit));

    }
    public static void weightvalue(int[][] weightprofit){
        Arrays.sort(weightprofit, (a,b) -> Double.compare((double) b[1]/b[0], (double) a[1]/a[0]));
    }
    public static void print2Darray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static double solveknapsack(int w, int [][] weightprofit){
        // sorting acoording to the profit by weight ratios
        weightvalue(weightprofit);
        print2Darray(weightprofit);
        double maxprofit = 0;
        int currentweight = 0;
        for(int i=0;i<weightprofit.length;i++){
            if(weightprofit[i][0] > w || weightprofit[i][0] + currentweight > w){
                // ab yaha fraction lena padega
                int weighttobeadded = w - currentweight;
                double fraction = (double) weighttobeadded / (double) (weightprofit[i][0]);
                double profittobeadded = fraction * (double) weightprofit[i][1];
                maxprofit += profittobeadded;
                break;
            }
            else{
                currentweight += weightprofit[i][0];
                maxprofit += weightprofit[i][1];
            }
        }
        return maxprofit;
    }

    
}
