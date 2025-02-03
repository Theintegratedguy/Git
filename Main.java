import java.util.HashSet;
import java.util.Set; 

public class Main {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(); 
        set.add(1); 
        set.add(2); 
        set.add(3); 
        set.add(4); 

        if(set.contains(3)){
            System.out.println("yes, 3 is present"); 
        }
        else{
            System.out.println("no, the number-3 is not present"); 
        }
    }
}
