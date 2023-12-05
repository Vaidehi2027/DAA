public class Daa_assignment5_pt1{
    public static void main(String[] args){
        int [] profit = {60, 100, 120 };
        int [] weights = {10, 20, 30};
        int W = 50;
        int n = profit.length;
        System.out.println("the max profit is: ");
        int amount = solve_knapsack(profit,weights,W,n);
        System.out.println(amount);


    }
    // knapsack using dynamic programming
    public static int solve_knapsack(int []profit,int[]weights,int W,int n){
        //  abhi 0/1 wale table ko bharna shuru karo
        int [][] knapmatrix = new int [n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int w=0;w<=W;w++){
                if(i == 0 || w == 0){
                    knapmatrix[i][w] = 0;
                }
                else if(weights[i-1] <= w){
                    // matlab hum abhi bade weights pe pohoch gaye
                    //  humara jo 1st object hain woh list main 0 pe hoga so i -1
                    knapmatrix[i][w] = Math.max(knapmatrix[i-1][w] , knapmatrix[i-1][w - weights[i-1]] + profit[i-1]);
                }
                else{
                    knapmatrix[i][w] = knapmatrix[i-1][w];
                }
            }
        }
        return knapmatrix[n][W];

    }
}