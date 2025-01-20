class Mergealternate {
    static String merge(String s1, String s2) {
        String result ="";
        int length;
        if(s1.length()>s2.length()){
            length= s1.length();
        }
        else{
            length = s2.length();
        }
        for(int i=0;i<length;i++){
            if(i<s1.length()){
                result+=s1.charAt(i);
            }
            if(i<s2.length()){
                result+=s2.charAt(i);
            }
        }
        return result;

    }
    public static void main(String[] args) {
       System.out.println(merge("abc", "xyz"));
        }

    }
      