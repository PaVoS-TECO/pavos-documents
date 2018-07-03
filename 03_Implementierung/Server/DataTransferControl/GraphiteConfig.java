package DataTransferControl;

import java.util.*;

/**
 * The specified configuration-object that stores all needed configurations for the connection from Kafka to Graphite
 */
public class GraphiteConfig extends Config {

    /**
     * Default constructor
     */
    public GraphiteConfig() {
    }

    /**
     * Returns the host-name of Graphite
     * @return The Graphite-host-name
     */
    public static String getGraphiteHostName() {
        // TODO implement here
        return "";
    }

    /**
     * Returns the port of the Graphite-connection
     * @return The port of the Graphite-connection
     */
    public static Integer getGraphitePort() {
        // TODO implement here
        return null;
    }

}