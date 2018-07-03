package DataTransferControl;

import java.util.*;

/**
 * Reformats the data and sends it to Graphite
 */
public class GraphiteSender extends Sender {

    /**
     * Default constructor
     */
    public GraphiteSender() {
    }

    /**
     * Adds a sensor-observed property to the collection of properties that will be sent
     * @param record The record of data that will be sent
     * @param list The list of metrics that were created from our data with python
     */
    private void addObservedProperty(ConsumerRecord<String, KafkaObservationData> record, PyList list) {
        // TODO implement here
    }

    /**
     * Transforms a property into a Graphite-readable format with python
     * @param record The record of data that will be sent
     * @param list The list of metrics that were created from our data with python
     * @param name The name of the observed property
     * @param value The value the sensor registrated to the specified property
     */
    private void addFloatMetric(ConsumerRecord<String, KafkaObservationData> record, PyList list, String name, String value) {
        // TODO implement here
    }

    /**
     * Documents our result-matrics
     * @param metric The metric formed from our original data value of a certain property
     */
    private void logMetric(PyTuple metric) {
        // TODO implement here
    }

}