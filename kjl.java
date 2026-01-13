public class kjl {
    String name;
    int age;
    float wt;
    kjl(){
        name="rushi";
    }
    void dom(){
        System.out.println( age);
    }
    static void main(String... args){
        kjl i=new kjl();
        
        i.age=28;
        i.wt=20.4f;
        System.out.println(i.name+" "+i.age+""+i.wt);
        i.dom();

                                                                                                                        
    }
    
}
