class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String t: tokens){
            if (t.equals("+")){
                stack.add(stack.pop()+stack.pop());
            } else if (t.equals("-")){
                int a = stack.pop();
                int b= stack.pop();
                stack.add(b-a);
            }else if (t.equals("*")){
                stack.add(stack.pop()*stack.pop());
            } else if (t.equals("/")){
                int a = stack.pop();
                int b= stack.pop();
                stack.add(b/a);
            } else {
                stack.add(Integer.parseInt(t));
            }
        }
        return stack.peek();
    }
}