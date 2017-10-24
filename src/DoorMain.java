import com.intuit.Door;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class DoorMain {

    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
        Door door = context.getBean("door",Door.class);
        door.open();
        door.close();

        Door door2 = context.getBean("door2",Door.class);
        door2.open();
        door2.close();
//        Door door = DoorFactory.getDoorWithSoundAlarm();
//        door.open();
//        door.close();
    }
}
