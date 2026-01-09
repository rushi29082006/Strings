public class rot {
    static Boolean pom(String a,String  b){
        String c=a+b;
        String a2=a+a;
        if (a2.contains(b)== true){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
    
        String d="abcd";
        String b="cdab";
        System.out.println(d.length()==b.length());
       System.out.println( d.substring(1,3 ));
       System.out.println(pom(d,b));
    }
    
}
