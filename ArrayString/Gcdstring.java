class Gcdstring{
    public static String calculate(String s1, String s2){
        if(s1+s2 != s2+s1)
         return "";
        int ans= gcd(s1.length(), s2.length());
        return s1.substring(0, ans);
    }

    public static int gcd(int a, int b){
     
        return b==0 ? a : gcd(b,a%b);
    }
    public static void main(String[] args) {
        String s1 = "ABABAB";  
        String s2 = "AB";  
       System.out.println(calculate(s1,s2));
}
}