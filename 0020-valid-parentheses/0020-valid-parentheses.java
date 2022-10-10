class Solution 
{
    public boolean isValid(String expression) 
    {
         if(expression.isEmpty()) return false;
         if (expression.length() % 2 != 0 ) return false;
        Stack<Character> st = new Stack<>();
        int i = 0;
        while ( i < expression.length())
        {
            if (expression.charAt(i) == '[' ||expression.charAt(i) == '{'||expression.charAt(i) == '('){
                st.push(expression.charAt(i));
            } else if (expression.charAt(i) == ']' ||expression.charAt(i) == '}'||expression.charAt(i) == ')') {
                if (!st.isEmpty()){
                    if (expression.charAt(i) == ']' && st.peek() == '['){
                        st.pop();
                    }
                    else if(expression.charAt(i) == ')' && st.peek() == '('){
                        st.pop();
                    }
                    else if(expression.charAt(i) == '}' && st.peek() == '{'){
                        st.pop();
                    }
                    else return false;
                }
                else return false;
            }
            i++;
        }
        
         return st.isEmpty() ? true :false;
    }
}