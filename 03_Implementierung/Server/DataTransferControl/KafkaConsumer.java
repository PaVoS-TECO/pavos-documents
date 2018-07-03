package DataTransferControl;

import java.util.*;

/**
 * The Kafka Consumer is described in Apache-Kafka and will only be included in this diagram for a better understanding of the required functionality.
 */
public class KafkaConsumer {

    /**
     * Default constructor
     */
    public KafkaConsumer() {
    }


    /**
     * The Consumer subscribes Kafka-Topics.
     * @param topics Kafka-Topics that should be subscribed
     */
    public void subscribe(Collection<String> topics) {
        // TODO implement here
    }

    /**
     * Jumps to the beginning of an existing record
     * @param partitions Kafka-Partitions
     */
    public void seekToBeginning(Collection<TopicPartition> partitions) {
        // TODO implement here
    }

    /**
     * Gathers the data
     * @param timeout A timeframe, limiting the longest possible duration of the poll request
     */
    public void poll(long timeout) {
        // TODO implement here
    }

    /**
     * Wakes up the KafkaConsumer, which then stops any current requests. Useful to limit polls in general.
     */
    public void wakeup() {
        // TODO implement here
    }

    /**
     * Closes the KafkaConsumer
     */
    public void close() {
        // TODO implement here
    }

}