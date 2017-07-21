public class ProgramConfiguration {
    private int connectionLimit;
    private int portNumber;
    private String URL;
    private int timeout;

    private ProgramConfiguration(){

    }

    public static ProgramConfiguration getInstance(){
        if(instance == null){
            ProgramConfiguration instance = new ProgramConfiguration();
            return instance;
        }
        else {
            return instance;
        }
    }

    private static ProgramConfiguration instance = new ProgramConfiguration();

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
