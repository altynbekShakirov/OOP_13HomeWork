import java.util.Arrays;

public class MyClass {
    private  String name ;
    private  String fuulname;
    private byte age;
    private String []course;
    public  MyClass (String name, String fuulname, byte age){
        this.name= name;
        this.fuulname=fuulname;
        this.age=age;


    }public MyClass(){

    }
    public  MyClass(String ...course){
        this.course=course;

    }

    @Override
    public String toString() {
        return
                "name=: " + name + '\'' +
                " fuulname: " + fuulname + '\'' +
                " age: " + age +
                " course:" + Arrays.toString(course) ;
    }
}
