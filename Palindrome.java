//Palindrome number-----

class Palindrome{
	public static void main(String[] args){
	int r;
	int sum = 0;
	int n = 545;
	int temp;

	temp = n;
	while(n>0){
		r = n%10;
		sum = (sum*10)+r;
		n = n/10;
      }

	if(temp==sum){
		System.out.println("Palindrome number");
	  }
 	else
		{
	 	System.out.println("not palindrome");
	   }
      
    }
}
