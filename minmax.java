class Minmax{
	public static void main(String a[]){
		int sum = 0;
		int avg = 0;
		int max = 0;
		int min = 0;
		int temp = 0;
		

		for(int i =0; i<a.length; i++)
		{
		   temp = Integer.parseInt(a[i]);
		
		
             if(temp<min)
		   {
					min = temp;
		   }
		if(temp>max)
		{
			max = temp;
		}

		sum = sum+temp;
	  }

	System.out.println("min is = "+ min);
	System.out.println("max is = "+ max);
	System.out.println("sum is = "+ sum);
	System.out.println("average is = "+ sum/avg);
	
  }
}