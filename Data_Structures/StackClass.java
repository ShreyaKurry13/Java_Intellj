package Data_Structures;

public class StackClass{
	   private int tos,MaxSize,stack[];

	   public void create_stack(int size)
	   {
	       tos =-1;
	       stack = new int[size];
	       MaxSize = size;    
	   }

	   void push(int e)
	   {
		   stack[++tos]=e;
	   }
	  
	   
	   boolean isFull()
	   {
	       if(tos==MaxSize-1){
	            return true;
	       }
	       else 
	            return false;
	   }
	  
	   int pop()
	   {
	       int temp = stack[tos];
	       tos--;
	       return(temp);
	   }

	   int peek()
	   {
		   return(stack[tos]);
	   }

	   boolean isEmpty()
	   {
	      if(tos==-1)
	           return true;
	      else
	           return false;
	   }
	   
	   void print_stack()
	   {
	       for(int i=tos;i>-1;i--){
	           System.out.println(stack[i]);
	       }
	   }

    }
