package work;
import java.util.concurrent.Callable;
public class Ex {
    public static void main(String[] arg)
    {

myinterface i= () -> System.out.println(" this is first lamda ex class");


i.sayhello();
myinterface i2= () -> System.out.println("THIS IS SECOND");
i2.sayhello();
    }
}

