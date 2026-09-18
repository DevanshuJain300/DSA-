class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i:bills){
        
            if(i==5){
                five++;
            }
            else if(i==10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }
            else{
                if(ten>0){        //choice1 -> 10 + 5
                    ten--;
                    if(five==0){
                        return false;
                    }
                    five--;
                }
                else{
                    if(five<3){
                        return false;
                    }
                    five=five-3;
                }
            }
        }
        return true;
    }
}