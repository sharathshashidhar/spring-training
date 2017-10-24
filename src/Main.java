import com.intuit.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Hello hello = context.getBean("hello", Hello.class);
        Hello hello1 = context.getBean("hello", Hello.class);
        Hello hello2 = context.getBean("hello", Hello.class);
        System.out.println(hello);
        System.out.println(hello1);
        System.out.println(hello2);
    }


}
