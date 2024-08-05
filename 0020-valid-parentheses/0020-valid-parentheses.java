class Solution {
    static boolean isopening(char c){
        boolean ans=false;
        if(c=='(' || c=='[' ||c=='{'){
            ans=true;
        }
        return ans;
    }
    static char check(char c){
        if (c == '(') return ')';
        if (c == '{') return '}';
        if (c == '[') return ']';
        return '\0';
    }
    public boolean isValid(String s) {
        Stack <Character> str=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isopening(c)){
                str.push(c);
            }else if(!str.isEmpty()){
                char x=str.peek();
                if(check(x)==c){
                    str.pop();
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return str.isEmpty();
    }
}