package renastech.utilities;

public class browserUtils {
    //import
    public static void wait(int second){
        try {
            Thread.sleep(1000*second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
