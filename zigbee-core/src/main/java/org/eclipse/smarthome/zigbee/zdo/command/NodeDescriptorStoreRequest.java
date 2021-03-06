/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.zigbee.zdo.command;

import org.eclipse.smarthome.zigbee.zdo.ZdoRequest;

/**
 * Node Descriptor Store Request value object class.
 * <p>
 * The Node_Desc_store_req is provided to enable ZigBee end devices on the
 * network to request storage of their Node Descriptor on a Primary Discovery
 * Cache device which has previously received a SUCCESS status from a
 * Discovery_store_req to the same Primary Discovery Cache device. Included in
 * this request is the Node Descriptor the Local Device wishes to cache.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NodeDescriptorStoreRequest extends ZdoRequest {
    /**
     * Default constructor.
     */
    public NodeDescriptorStoreRequest() {
        clusterId = 0x0017;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(29);
        builder.append("NodeDescriptorStoreRequest [");
        builder.append(super.toString());
        builder.append(']');
        return builder.toString();
    }

}
