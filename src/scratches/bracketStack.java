package scratches;


class Solution {
    public Stack removeDuplicates(String S) {

        Stack<Character> stack = new Stack<Character>();

        //fetch top element
        for(int i =0; i < S.length(); i++){

            char c = S.charAt(i);


            char topElement = stack.empty() ? '#' : stack.pop();

            if(c == topElement){

                stack.pop(c);
            }
            else {

                stack.push(c);
            }

            return stack;
        }
        return null;
    }
}








