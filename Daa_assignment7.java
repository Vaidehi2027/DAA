import java.util.*;
public class Daa_assignment7 {
    public static void main(String[] args){
        int [] set = {1,2,5,6,8};
        int target = 9;
        Arrays.sort(set);
        ArrayList <Integer> possibleans = new ArrayList <>();
        subsetsum(set,0,target,0,possibleans);


    }
    public static void subsetsum(int []set,int index,int target,int currentsum,ArrayList <Integer> possibleans){
        if(currentsum == target){
            System.out.println(possibleans);
            return;
        }
        int prevelement = -1;
        for(int i=index;i<set.length;i++){
            if(set[i]!= prevelement){
                if(currentsum + set[i] > target){
                    break;
                }
                possibleans.add(set[i]);
                prevelement = set[i];
                subsetsum(set,index+1,target,currentsum+set[i],possibleans);
                possibleans.remove(possibleans.size()-1);

            }
        }
    }
}
