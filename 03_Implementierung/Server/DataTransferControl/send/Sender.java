package DataTransferControl.send;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import DataTransferControl.SerializationDeserialization.KafkaObservationData;

/**
 * Reformats the data and sends it to another component
 */
public abstract class Sender {

    /**
     * Documents the results
     */
    Logger logger = LoggerFactory.getLogger(this.getClass());;

    /**
     * Sends the resulting data to the specified component
     * @param records Multiple records of data from Kafka
     */
    public abstract void send(ConsumerRecords<String, KafkaObservationData> records);

}