
class Prime {

	public static void main(String[] args) {
		 int i=0;
		 int num = 100;
		 String primeNumbers = "";

		 // loop through the numbers one by one
		        for (i = 1; i<=100; i++) 
		{
		            int cnt =0;
		            // check to see if the number is prime
		            for(num =i; num>=1; num--)
		                {
		                if (i % num == 0) 
		                   {
		                    cnt=cnt+1;
		                    
		                    }
		             }
		          // print the number if prime
		            if (cnt==2) 
		            {
		            	primeNumbers = primeNumbers + i + " ";
		          }
		        }
		        System.out.println("Prime numbers from 1 to 100 are :");
		        System.out.println(primeNumbers);
		    }


	}


