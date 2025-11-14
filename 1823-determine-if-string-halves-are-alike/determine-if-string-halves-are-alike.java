class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n/2;i++){
            char ch=s.charAt(i);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i') c++;
        }
        for(int i=n/2;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i')  c--;
        }
        return (c==0);
    }
}