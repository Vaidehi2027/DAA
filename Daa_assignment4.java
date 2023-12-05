public class Daa_assignment4 {
    //  making the static variables 
    final static int INF = 99999;
    final static int V = 3;
   
        
    public static void main(String[] args){
        int graph[][] = { { 0, 4, 11},
                          {6, 0, 3},
                          {3,INF,0},
                          };
        floydwarshall(graph);
    }
    public static void floydwarshall(int[][] dist){
        int i,j,k;
        for(k=0;k<V;k++){
            // for rach row
            for(i=0;i<V;i++){
                //  for each column
                for(j=0;j<V;j++){
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[j][k]);
                }
            }
        }
        print2Darray(dist);
    }
    public static void print2Darray(int [][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == INF){
                    System.out.print("INF ");
                }
                else{
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
