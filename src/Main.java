import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyClass myClass= new MyClass("altyn","Shakirov", (byte) 16);
        MyClass myClass1= new MyClass("java","english","tolcing clab");
        System.out.println();

        System.out .println("moi dannye\n=====================\n"+myClass+"\n"+myClass1);


    }
}