package DataTransferControl.SerializationDeserialization;

import java.util.*;

/**
 * A serializable object that contains the observed data from kafka
 */
public class KafkaObservationData implements java.io.Serializable {

    /**
     * Default constructor
     */
    public KafkaObservationData() {
    }

    /**
     * The unique identifier of this object
     */
    private static long serialVersionUID;

    /**
     * The date of the observation
     */
    public String observationDate;

    /**
     * The name of the observations location
     */
    public String locationName;

    /**
     * The height of the observations location
     */
    public String locationElevation;

    /**
     * The id of the observations location
     */
    public String locationID;

    /**
     * The observed property
     */
    public String observedProperty;

}