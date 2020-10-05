public class ConsecNums {
    public static void main(String []args){


int[] nums = new int[]{1,1,0,1,1,1 };


       int max_consecutive_ones = 0, counter = 0;
       for(int i = 0; i < nums.length; i++) {
           if(nums[i] == 1) {
               counter++;
           }
           else {
               if(max_consecutive_ones < counter) {
                   max_consecutive_ones = counter;
                }
               counter = 0;
           }
              
       }
       
      if(max_consecutive_ones < counter) {
                   max_consecutive_ones = counter;
                }
        
      System.out.println(max_consecutive_ones);  
    }
}