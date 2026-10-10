
public class BalancedBrackets {

    public static boolean isBalanced(String expr) {
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    return false;
                }

                char opening = stack.pop();

                if (ch == ')' && opening != '(') {
                    return false;
                }

                if (ch == ']' && opening != '[') {
                    return false;
                }

                if (ch == '}' && opening != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
