// Factorial program-------

class Fact{
	public static void main(String[] args){
	int i;
	int fact =1;
	int n = 4;

	for(i=1; i<=n; i++){
		fact = fact*i;
	}
	

	System.out.println("Factorial of number:"+fact);
    }
}