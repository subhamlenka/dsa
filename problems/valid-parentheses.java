class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> mapping=new HashMap<Character,Character>();
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(mapping.containsKey(c))
            {
                if(stack.empty() || stack.pop() != mapping.get(c)) return false;

            }
            else
                stack.push(c);
        }

        return stack.empty();
    }
}