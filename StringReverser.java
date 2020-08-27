import java.util.Stack;

class StringReverser {
    public String reverse(String input){
        Stack <Character> stack = new Stack<>();
        if (input == null) 
        throw new IllegalArgumentException();

        for (char ch: input.toCharArray()){
            stack.push(ch);
        }

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()){
           reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}