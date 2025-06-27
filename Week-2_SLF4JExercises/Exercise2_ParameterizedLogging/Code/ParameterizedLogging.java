import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogging {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogging.class);

    public static void main(String[] args) {
        String username = "Yuva-6405620";
        int age = 22;

        logger.info("User {} is {} years old.", username, age);
        logger.debug("Debug message for user: {}", username);
    }
}
