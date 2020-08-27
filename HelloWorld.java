import java.util.Stack;


class HelloWorld {
    public static String reverseString(String str) {
        Stack <Character> stack = new Stack<>();
        char [] ch = str.toCharArray();
        for (int i = 0; i < ch.length;i++){
            stack.push(ch[i]);
        }

        int k = 0; 

        // pop characters from the stack until it is empty
        while (!stack.isEmpty()){
            // assign each popped character back to the character array
            ch[k++] = stack.pop();
        }

        return String.copyValueOf(ch);
    }
    public static void main (String [] args){
        //stacks - implement undo feature
        /*
        - Implement the undo feature 
        - Build compilers (syntax checking)
        - Evaluate Expressions ( 1 + 2 * 3)
        - Build Navigation (forward / backward)
        
        operations 
        - push (item)  - o(1)
        - pop() - o(1)
        - peek()  - o(1)
        - isEmpty() - o(1)
        */

        // Stack <Integer>  stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.println(stack);
        // var top = stack.pop();
        // System.out.println(top);
        // top = stack.peek();
        // System.out.println(top);
        
        //reverse a string
        String str = "Hello How are you?";
        System.out.println(reverseString(str));

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);

        
       


        
        
        



        


        
    }
}