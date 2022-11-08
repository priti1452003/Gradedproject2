package com.gradedproject.que1;

	import java.util.*;
	 
class SortStack
	{
	    // This function return the sorted stack
	    public static Stack<Integer> sortstack(Stack<Integer>
	                                             input)
	    {
	        Stack<Integer> tmpStack = new Stack<Integer>();
	        while(!input.isEmpty())
	        {
	            // pop out the first element
	            int tmp = input.pop();
	         
	            // while temporary stack is not empty and
	            // top of stack is greater than temp
	            while(!tmpStack.isEmpty() && tmpStack.peek()
	                                                 > tmp)
	            {
	                // pop from temporary stack and
	                // push it to the input stack
	            input.push(tmpStack.pop());
	            }
	             
	            // push temp in temporary of stack
	            tmpStack.push(tmp);
	        }
	        return tmpStack;
	    }
	     
	    // Driver Code
	    public static void main(String args[])
	    {
	    	
	        Stack<Integer> input = new Stack<Integer>();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Input No. of floors ");
	        int floor = sc.nextInt();
	        
	        for(int i=0; i < floor; i++)
	        
	        {
	        	System.out.println("Input floor sizes " +i);
	        	int tmp = sc.nextInt();
	        	 input.add(tmp);	
	        	
	        	
	        }
	       
	        // This is the temporary stack
	        Stack<Integer> tmpStack=sortstack(input);
	        System.out.println("Sorted numbers are:");
	     
	        while (!tmpStack.empty())
	        {
	            System.out.print(tmpStack.pop()+" ");
	        }
	    }
	}


