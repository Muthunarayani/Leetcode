class Duplicateint{
public static void duplicate(int[] arr){
   int start=0;
   for(int i=0;i<arr.length;i++){
   for(int j=i+1;j<arr.length;j++){
    if(arr[i]>arr[j]){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;   
                         // 1 2 2 3 3 5
    }
}
}
int size = arr.length;
   for(int next=1;next<arr.length;next++){
   if( arr[start]!= arr[next]){
    start++;
    arr[start]=arr[next];

   }
   else 
   size--;
}
System.out.println(size);
for(int p  =0;p<size;p++){
    System.out.print(arr[p]);
}

}
    public static void main(String[] args) {
        int[] arr = {1, 6,1,4, 2, 2, 5};
        duplicate(arr);
    }
}