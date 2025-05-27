class Solution {
    public int differenceOfSums(int n, int m) {
       ArrayList<Integer> num1 = new  ArrayList<>();
       ArrayList<Integer> num2 = new ArrayList<>();
       for(int i = 1; i<=n;i++){
            if(i%m!=0){
                num1.add(i);
            }else{
                num2.add(i);
            }
       }
       int sum1 = 0;
       int sum2 = 0;
       for(int i : num1){
            sum1 += i;
       }
       for(int i : num2){
            sum2 += i;
       }

       int res = sum1 - sum2;

       return res;
    }
}