public class Logger {
    //Private static instance of Logger
    private static Logger instance = new Logger();

    //Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created");
    }

    //Public method
    public static Logger getInstance() {
        return instance;
    }
    
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
