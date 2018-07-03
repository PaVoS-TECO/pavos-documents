package DataTransferControl;

import java.util.*;

/**
 * The specified configuration-object that stores all needed configurations for the connection from Kafka to another specified component
 */
public class Config {

    /**
     * Default constructor
     */
    public Config() {
    }

    /**
     * Gets the Kafka-host-name
     * @return The host-name of Kafka
     */
    public static String getKafkaHostName() {
        // TODO implement here
        return "";
    }

    /**
     * Returns whether a start from the beginning is required
     * @return Tells us whether a start from the beginning is required
     */
    public static boolean getStartFromBeginning() {
        // TODO implement here
        return false;
    }

    /**
     * Returns an environment-variable
     * @param name The name of the environment-variable
     * @param defaultValue The default-value of the environment-variable
     */
    private static void getEnvironmentVariable(String name, String defaultValue) {
        // TODO implement here
    }

}