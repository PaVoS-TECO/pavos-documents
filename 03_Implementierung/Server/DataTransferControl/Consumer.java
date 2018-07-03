package DataTransferControl;

import java.util.*;

/**
 * Consumes data from Kafka
 */
public class Consumer {

    /**
     * Default constructor
     */
    public Consumer() {
    }

    /**
     * Documents the activity of the Consumer
     */
    private Logger logger;

    /**
     * Kafka-Topics that should be subscribed
     */
    private Collection<String> topics;

    /**
     * Monitors the correct shutdown of the Consumer
     */
    private CountDownLatch shutdownLatch;

    /**
     * The KafkaConsumer that consumes the data from Kafka
     */
    private KafkaConsumer consumer;

    /**
     * An Object to send data with
     */
    private Sender sender;

    /**
     * Starts the transferring-process
     */
    public void run() {
        // TODO implement here
    }

    /**
     * Stops the transferring-process
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