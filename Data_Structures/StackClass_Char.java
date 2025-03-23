package Data_Structures;


public class StackClass_Char{
    private int tos,MaxSize;
    char stack[];

    public void create_stack(int size)
    {
        tos =-1;
        stack = new char[size];
        MaxSize = size;    
    }

    void push(char e)
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
   
    char pop()
    {
        char temp = stack[tos];
        tos--;
        return(temp);
    }

    char peek()
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
