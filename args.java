public class args {
    // A method that takes variable 
	// number of integer arguments.
	static void fun(int... a)
	{       int ans = 0;
		for (int i : a){
			ans = ans + i;}
        System.out.println(ans);
	}

	// Driver code
	public static void main(String args[])
	{
		// Calling the varargs method with 
		// different number of parameters
	
		// one parameter
		fun(100); 
		
		// four parameters
		fun(1, 2, 3, 4); 
		
		// no parameter
		fun(); 
	}
}


