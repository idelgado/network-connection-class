package com.facebook.network.connectionclass;

import java.util.HashMap;
import java.util.Map;

/**
 * A default profile for the Connection Class Manager
 */
public class ConnectionClassProfile {
    protected static final Map<ConnectionQuality, Integer> CONNECTION_QUALITY_THRESHOLDS = new HashMap<>();
    static {
        CONNECTION_QUALITY_THRESHOLDS.put(ConnectionQuality.POOR, 150);
        CONNECTION_QUALITY_THRESHOLDS.put(ConnectionQuality.MODERATE, 550);
        CONNECTION_QUALITY_THRESHOLDS.put(ConnectionQuality.GOOD, 2000);
    }

    protected static final double SAMPLES_TO_QUALITY_CHANGE = 5;

    /**
     * The factor used to calculate the current bandwidth
     * depending upon the previous calculated value for bandwidth.
     *
     * The smaller this value is, the less responsive to new samples the moving average becomes.
     */
    protected static final double DECAY_CONSTANT = 0.05;

    /**
     * The lower bound for measured bandwidth in bits/ms. Readings
     * lower than this are treated as effectively zero (therefore ignored).
     */
    protected static final long BANDWIDTH_LOWER_BOUND = 10;

}
