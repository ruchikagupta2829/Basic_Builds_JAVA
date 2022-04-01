class Star{
	public static void main(String[] args){
	int n = 5;
	int i = 1;
	int j = 0;
	int k = 0;

	while(i<n){
		while(j<5-i){
			System.out.print("*");
			j++;
              }
		while(k<=i){
			System.out.print("*");
			k++;
		 }
	        i++;  
        }


	
       System.out.println();
     		
  }
}