public class HelloWorld{

	public static void main(String []args){
	
		int nums[] = new int[5];
		for(int i=0; i < nums.length; i++)
		 {
			 nums[i] = i;
		 }
		 int num = nums[2];
		 System.out.println(num);
		 
		 for(int i=0; i< nums.length; i++)
		 {
			 if(nums[i] == 4)
			 {
				 System.out.println("Index found,"+ i);
			 }
		 }

	}
}