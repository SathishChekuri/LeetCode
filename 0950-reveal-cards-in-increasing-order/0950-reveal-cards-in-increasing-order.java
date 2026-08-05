class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<deck.length;i++){
            q.add(i);
        }
        int ans[]=new int[deck.length];
        Arrays.sort(deck);
        for(int x:deck){
            int ind=q.remove();
            ans[ind]=x;
            if(!q.isEmpty()){
                q.offer(q.poll());
            }
        }
        return ans;
    }
}