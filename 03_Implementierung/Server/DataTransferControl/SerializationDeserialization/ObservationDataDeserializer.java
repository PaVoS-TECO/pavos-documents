package DataTransferControl.SerializationDeserialization;

import java.util.*;

/**
 * Deserializes KafkaObservationData objects
 */
public class ObservationDataDeserializer implements org.apache.kafka.common.serialization.Deserializer {

    /**
     * Default constructor
     */
    public ObservationDataDeserializer() {
    }

    /**
     * Documents the deserialization of our objects
     */
    private static Logger logger;

    /**
     * Configures the deserializer
     * @param configs The Configuration
     * @param isKey A variable, telling us whether we want to configure the key or the value
     */
    public void configure(Map<String, ?> configs, boolean isKey) {
        // TODO implement here
    }

    /**
     * Deserializes an object
     * @param topics Kafka-Topics that should be subscribed
     * @param data These are our serialized bytes
     * @return A serializable object that contains the observed data from kafka
     */
    public KafkaObservationData deserialize(Collection<String> topics, Set<byte> data) {
        // TODO implement here
        return null;
    }

    /**
     * Closes this object
     */
    public void close() {
        // TODO implement here
    }

}