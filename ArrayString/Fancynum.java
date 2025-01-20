import java.util.*;
class Fancynum{
public static int call( int num){
    int sum=num;
    while(sum>=10){
        int tempsum=0;
        while(sum>0){
      int rem =sum%10;
      tempsum+= rem;
      sum/=10;
        }
      sum=tempsum;  
    }
   
   return sum;
}

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        int fn = s.nextInt();
        for(int i=a;i<=b;i++){
        if(call(i)==fn)
        System.out.println(i);
    }
}
}