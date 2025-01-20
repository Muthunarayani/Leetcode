import java.util.*;
class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int num=0;
        boolean prime=false;
        boolean hasnum=false;

        for(int i=0;i<s.length();i++) {      
            if(s.charAt(i)>='1'&&s.charAt(i)<='9') {
                hasnum= true;
          if(s.charAt(i)=='1'||s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7') {
              num += (s.charAt(i)-'0');       // -'0' is used to return the integer from character array
              prime= true;
          }  
             
            }
           
        } 
        if(!hasnum){
            System.out.println("Not applicable");
           }
        
        else if(prime) {
            System.out.println(num);
        }
        else {
            System.out.println(" No prime");
        }
 

        }
}