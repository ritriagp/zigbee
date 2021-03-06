/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.zigbee.zdo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.smarthome.zigbee.ZigBeeEndpointAddress;
import org.eclipse.smarthome.zigbee.zcl.ZclCommand;
import org.eclipse.smarthome.zigbee.zcl.clusters.onoff.OffCommand;
import org.eclipse.smarthome.zigbee.zdo.command.BindRequest;
import org.eclipse.smarthome.zigbee.zdo.command.BindResponse;
import org.junit.Test;

/**
 *
 * @author Chris Jackson
 *
 */
public class ZdoResponseMatcherTest {

    @Test
    public void testMatch() {
        ZdoTransactionMatcher matcher = new ZdoTransactionMatcher();

        ZdoRequest zdoCommand = new BindRequest();
        BindResponse zdoResponse = new BindResponse();

        zdoCommand.setDestinationAddress(new ZigBeeEndpointAddress(1234));
        zdoResponse.setSourceAddress(new ZigBeeEndpointAddress(1234));
        assertTrue(matcher.isTransactionMatch(zdoCommand, zdoResponse));

        zdoResponse.setSourceAddress(new ZigBeeEndpointAddress(5678));
        assertFalse(matcher.isTransactionMatch(zdoCommand, zdoResponse));

        ZclCommand zclResponse = new OffCommand();
        assertFalse(matcher.isTransactionMatch(zdoCommand, zclResponse));
    }
}
