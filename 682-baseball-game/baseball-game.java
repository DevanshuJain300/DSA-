class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();

        for(String s: operations){
           switch(s){
            case "+":
            int last=st.pop();
            int secondLast=st.peek();

            st.push(last);
            st.push(last + secondLast);
            break;

            case "D":
            st.push(2 * st.peek());
            break;

            case "C":
            st.pop();
            break;

            default:
            st.push(Integer.parseInt(s));
            break;
           }     
        }
        int sum=0;
        for(int i: st){
            sum=sum+i;
        }
        return sum;
    }
}