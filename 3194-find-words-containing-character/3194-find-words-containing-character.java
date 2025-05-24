class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       int n = words.length;
       ArrayList<Integer> res = new ArrayList<>();
       for(int i = 0; i<n; i++){
          int len = words[i].length();
          int  j = 0; 
          while(j<len){
            if(words[i].charAt(j)!=x){
                j++;
            }
            else{
                res.add(i);
                break;
            }
       }
    }
       return res;
    }
}