import java.util.List;  
import java.util.ArrayList;  
public class TypeInference {  
    public static void main(String[] args) {  
      
        List<Integer> list = new ArrayList<Integer>();  
        list.add(12);  
        for (Integer element : list) {  
            System.out.println(element);  
        }  
  
        List<Integer> list2 = new ArrayList<>();    
        list2.add(12);  
        for (Integer element : list2) {  
            System.out.println(element);  
        }  
    }  
}  