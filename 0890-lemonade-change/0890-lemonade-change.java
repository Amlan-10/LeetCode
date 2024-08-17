class Solution {
    public boolean lemonadeChange(int[] bills) {
        int tens = 0, fives = 0;
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                fives++;
            } 
            else if (bills[i] == 10) {
                tens++;
                fives--;
            } 
           else{
               if(tens>0){
                tens--;
                fives--;
               }
               else{
                fives=fives-3;
               }
           }
            if (fives < 0)
            return false;
        }
        return true;
    }
}