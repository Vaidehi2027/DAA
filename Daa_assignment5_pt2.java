public class Daa_assignment5_pt2 {
    public static int max_value = 0;
    public static void main(String[] args){
        int [] weights = {10,20,30};
        int [] profit = {60,100,120};
        int W = 50;
        knapsack_backtrack(W,0,0,0,weights,profit);
        System.out.println(max_value);

    }
    //  knapsack using backtracking
    public static void knapsack_backtrack(int W,int index, int currentvalue, int currentweight,int[]weights,int[]profit){
        if(index == weights.length){
            if(currentvalue > max_value){
                max_value = currentvalue;
            }
            return;
        }
        if(currentweight + weights[index] <= W){
            //  aageka call lagao
            knapsack_backtrack(W,index+1,currentvalue + profit[index],currentweight + weights[index],weights,profit);
        }
        knapsack_backtrack(W,index+1,currentvalue,currentweight,weights,profit);
        
    }
    
}
