class Canplaceflower{
    static boolean canplace(int[] arr,int n){
        for(int i=0;i<arr.length;i++){
            boolean prev = i == 0|| arr[i-1]==0;
            boolean fut = i == arr.length-1|| arr[i+1]==0;
            if(prev&&fut&&arr[i]==0){
                arr[i]=1;
                n--;
            }          
    }
    return n<=0;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1};
        int n=2;                                    // if n=1 answer is true
        System.out.println(canplace(arr,n));
    }
}