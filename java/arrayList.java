import java.util.List;


public class ArrayList {
    public static void main(String []args){
     List<String> list = new java.util.ArrayList<>();
     
     list.add("a");
     list.add("b");
     list.add("c");
     
     list.remove("b");
     
     for(String s : list){
         
         System.out.println(s);
     }
        
    }
    
}