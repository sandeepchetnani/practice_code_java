import java.util.Stack;

public class Balancing {
    public static void main(String[] args) {
        String s="{{}}";
        char[] arr=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='{' || arr[i]=='[' ||arr[i]=='(' )
            {
                stack.push(arr[i]);
                
            }
            else if(arr[i]=='}' ||arr[i]==']' ||arr[i]==')')
            {
                
                char top=stack.pop();
                if(arr[i]==')' && top!='(' ||
                  arr[i]=='}' && top!='{'   ||
                 arr[i]==']' && top!='['
                   
                )
                {
                  break;
                }

               
            }
            

    }
    System.out.println(stack);
    if(stack.isEmpty() )
            {
            System.out.println("balanced");
        }
        else{
            System.out.println("not balanced");
        }
}
}
