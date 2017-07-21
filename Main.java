/**
 * Created by chand on 7/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        //  Error:(6, 39) java: ProgramConfiguration() has private access in ProgramConfiguration
        //  ProgramConfiguration object = new ProgramConfiguration();
        ProgramConfiguration object = ProgramConfiguration.getInstance();
        object.setConnectionLimit(5);
        object.setPortNumber(1143);
        System.out.println(object.getConnectionLimit());
        System.out.println(object.getPortNumber());

        //only can access methods through the instance
    }
}
