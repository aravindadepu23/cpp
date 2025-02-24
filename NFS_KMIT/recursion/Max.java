class Max {
    public static void main(String[] args){
    int b[] = {1,2,3,5,1,3};
       System.out.println(recursion(b,Integer.MIN_VALUE,0));
    }
    static int recursion(int b[],int max,int n){
            if(n == b.length){
                return max;
            }
            if(max<b[n]){max = b[n];}
            return recursion(b,max,n+1);
        
    }
}
