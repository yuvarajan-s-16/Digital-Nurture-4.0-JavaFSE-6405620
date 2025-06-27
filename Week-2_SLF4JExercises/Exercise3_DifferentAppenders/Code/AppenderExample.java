import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("Logging to both console and file.");
        logger.warn("Warning logged in app.log too.");
        logger.error("Error message - check both outputs.");
    }
}
