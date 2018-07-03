package DataTransferControl;

import java.util.*;

/**
 * Receives the data from Kafka and sends it to Graphite
 */
public class KafkaToGraphiteConsumer extends Consumer {

    /**
     * Default constructor
     */
    public KafkaToGraphiteConsumer() {
    }



    /**
     * Starts the process of consumation and readying the sender object
     */
    public void run() {
        // TODO implement here
    }

    /**
     * Starts the process
     */
    public void stop() {
        // TODO implement here
    }

    /**
     * Gathers the nessecary properties, that are required for data-reception and data-processing
     * @return The nessecary properties, that are required for data-reception and data-processing
     */
    private Properties getConsumerProperties() {
        // TODO implement here
        return null;
    }

}