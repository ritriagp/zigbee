/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.zigbee.zcl.clusters;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.smarthome.zigbee.ZigBeeEndpoint;
import org.eclipse.smarthome.zigbee.ZigBeeNetworkManager;
import org.eclipse.smarthome.zigbee.zcl.ZclAttribute;
import org.eclipse.smarthome.zigbee.zcl.ZclCluster;

/**
 * <b>Binary Output (BACnet Regular)</b> cluster implementation (<i>Cluster ID 0x060A</i>).
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ZclBinaryOutputBaCnetRegularCluster extends ZclCluster {
    /**
     * The ZigBee Cluster Library Cluster ID
     */
    public static final int CLUSTER_ID = 0x060A;

    /**
     * The ZigBee Cluster Library Cluster Name
     */
    public static final String CLUSTER_NAME = "Binary Output (BACnet Regular)";

    // Attribute initialisation
    protected Map<Integer, ZclAttribute> initializeAttributes() {
        Map<Integer, ZclAttribute> attributeMap = new ConcurrentHashMap<Integer, ZclAttribute>(0);

        return attributeMap;
    }

    /**
     * Default constructor to create a Binary Output (BACnet Regular) cluster.
     *
     * @param zigbeeManager {@link ZigBeeNetworkManager}
     * @param zigbeeEndpoint the {@link ZigBeeEndpoint}
     */
    public ZclBinaryOutputBaCnetRegularCluster(final ZigBeeNetworkManager zigbeeManager, final ZigBeeEndpoint zigbeeEndpoint) {
        super(zigbeeManager, zigbeeEndpoint, CLUSTER_ID, CLUSTER_NAME);
    }
}
