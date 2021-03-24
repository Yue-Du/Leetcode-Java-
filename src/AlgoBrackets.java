import java.util.Stack;

public class AlgoBrackets {
    public static boolean balancedBrackets(String str) {
        Stack<Character> stk = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '(' || str.charAt(i) == '{'){
                stk.push(str.charAt(i));
            }else if(str.charAt(i) != ']' || str.charAt(i) != '}' || str.charAt(i) != ')') continue;
            else if(stk.empty())return false;
            else{
                if(str.charAt(i) == ']' && (char)stk.peek() != '[')return false;
                else if(str.charAt(i) == ')' && (char)stk.peek() != '(')return false;
                else if(str.charAt(i) == '}' && (char)stk.peek() != '{')return false;
                else stk.pop();
            }
        }
        if(stk.empty())return true;
        else return false;
    }
    public static void main(String[] args) {
        balancedBrackets("(agwgg)([ghhheah%&@Q])");
    }
}
