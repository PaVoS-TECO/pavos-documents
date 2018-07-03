package DataTransferControl;

import java.util.*;

/**
 * Reformats the data and sends it to another component
 */
public class Sender {

    /**
     * Default constructor
     */
    public Sender() {
    }

    /**
     * Documents the results
     */
    private Logger logger;

    /**
     * Sends the resulting data to the specified component
     * @param records Multiple records of data from Kafka
     */
    public void send(ConsumerRecords<String, KafkaObservationData> records) {
        // TODO implement here
    }

}