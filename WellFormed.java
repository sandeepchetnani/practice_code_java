import java.util.Stack;

public class WellFormed {
    public static void main(String[] args) {
        String str="{([{}])}";
        if(isWellFormed(str))
        {
            System.out.println("its a well formed string");
        }
        else{
            System.out.println("its not a well formed string");
        }
        
    }

    public static boolean isWellFormed(String str)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(ch); 
            }
            else if(ch=='{' || ch=='[' || ch=='(' )
            {
                stack.push(ch);
            }
            else if(ch=='}' && stack.peek()=='{' || ch==']' && stack.peek()=='[' || ch==')' && stack.peek()=='(')
            {
                stack.pop();
            }
           
        }
        if(stack.isEmpty())
        {
        return true;
        }
        else{
            return false;
        }

        
    }

}
