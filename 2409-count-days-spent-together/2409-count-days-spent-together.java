class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        HashMap<Integer,Integer> hs=new HashMap<>();
            hs.put(1,1);
            hs.put(2,-1);
            hs.put(3,0);
            hs.put(4,0);
            hs.put(5,1);
            hs.put(6,1);
            hs.put(7,2);
            hs.put(8,3);
            hs.put(9,3);
            hs.put(10,4);
            hs.put(11,4);
            hs.put(12,5);
            hs.put(0,0);
            int ai=(Integer.parseInt(arriveAlice.substring(0,2))-1)*30+hs.get(Integer.parseInt(arriveAlice.substring(0,2))-1)+Integer.parseInt(arriveAlice.substring(3,5));
            int ao=(Integer.parseInt(leaveAlice.substring(0,2))-1)*30+hs.get(Integer.parseInt(leaveAlice.substring(0,2))-1)+Integer.parseInt(leaveAlice.substring(3,5));
            int bi=(Integer.parseInt(arriveBob.substring(0,2))-1)*30+hs.get(Integer.parseInt(arriveBob.substring(0,2))-1)+Integer.parseInt(arriveBob.substring(3,5));
            int bo=(Integer.parseInt(leaveBob.substring(0,2))-1)*30+hs.get(Integer.parseInt(leaveBob.substring(0,2))-1)+Integer.parseInt(leaveBob.substring(3,5));
            int d=0;
            System.out.println(ai+" "+ao+" "+bi+" "+bo);
            if(ai<=bo&&bi<=ao) d=Math.max(d,Math.min(ao,bo)-Math.max(ai,bi)+1);
            return d;
    }
}