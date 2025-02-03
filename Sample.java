import java.util.List; 
import java.util.LinkedList; 
class Sample{
    public static void main(String[] args){
        List<Integer> list= new LinkedList<>();
        for(int i=0; i<10; i++){
            list.add(i*i); 
        }

        for(int element: list){
            if(element<50){
                System.out.print(element+" "); 
            }
        }

    }
}