package afternoon.collection.stack;

import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String input = "이승아";

        char[] charArray = input.toCharArray();
        for(int i = 0; i<charArray.length; i++){
            //한글자씩 스택에 넣어줌
            stack.push(charArray[i]);
        }

        char[] reverseArr = new char[charArray.length];
        int i=0;
        while (!stack.isEmpty()){
            reverseArr[i++] = stack.pop();
        }

        String reversed = new String(reverseArr);
        System.out.println("input = " + input);
        System.out.println("reversed = " + reversed);
    }
}
