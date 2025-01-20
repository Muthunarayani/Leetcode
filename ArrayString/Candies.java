class Candies{
static void candies(int[] arr, int extra) {
    int n = arr.length;
    int max=0;
    for(int i=0;i<n;i++){
        if(max<arr[i])
        max= arr[i];
    }// if we want array means create a list and return
    for(int j=0;j<n;j++){
        if(extra+arr[j]>=max){
            System.out.println("true");
        }
        else
        System.out.println("false");
    }
}
    public static void main(String[] args) {     
        int[] arr = {2,3,5,1,4};
        int extra = 3;
        candies(arr, extra);
}
}