class Missing{
    public static void missing ( int[] arr){
        int sum=0, n= arr.length+1; // if 0 is not given then add 1 otherwise arr.length will be used
       for(int num: arr){
        sum+=num;
       }
       System.out.println(n*(n+1)/2 - sum);
    }

    public static void main(String[] args){ 
        int[]  array ={3,2,1};
        missing(array);
    }
}