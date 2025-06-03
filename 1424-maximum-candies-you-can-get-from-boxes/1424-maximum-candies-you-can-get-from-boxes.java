class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        boolean foundOpenBox = true;
        int totalCandies = 0;
        List<Integer> boxes = new ArrayList<>();
        for(int b: initialBoxes) boxes.add(b);
        while(!boxes.isEmpty() && foundOpenBox){
            foundOpenBox = false;
            List<Integer> nextBoxes = new ArrayList<>();
            for(int boxId:boxes){
                if(status[boxId]==1){
                    foundOpenBox = true;
                    for(int k:containedBoxes[boxId]) nextBoxes.add(k);
                    for(int keyId : keys[boxId]) status[keyId] = 1;
                    totalCandies += candies[boxId];
                }else{
                    nextBoxes.add(boxId);
                }
            }
            boxes = nextBoxes;
        }
        return totalCandies;
    }
}