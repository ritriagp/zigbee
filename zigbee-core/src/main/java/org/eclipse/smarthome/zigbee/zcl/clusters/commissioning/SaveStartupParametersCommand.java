/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.zigbee.zcl.clusters.commissioning;

import org.eclipse.smarthome.zigbee.zcl.ZclCommand;
import org.eclipse.smarthome.zigbee.zcl.ZclFieldDeserializer;
import org.eclipse.smarthome.zigbee.zcl.ZclFieldSerializer;
import org.eclipse.smarthome.zigbee.zcl.protocol.ZclCommandDirection;
import org.eclipse.smarthome.zigbee.zcl.protocol.ZclDataType;

/**
 * Save Startup Parameters Command value object class.
 * <p>
 * Cluster: <b>Commissioning</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Commissioning cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class SaveStartupParametersCommand extends ZclCommand {
    /**
     * Option command message field.
     */
    private Integer option;

    /**
     * Index command message field.
     */
    private Integer index;

    /**
     * Default constructor.
     */
    public SaveStartupParametersCommand() {
        genericCommand = false;
        clusterId = 21;
        commandId = 1;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets Option.
     *
     * @return the Option
     */
    public Integer getOption() {
        return option;
    }

    /**
     * Sets Option.
     *
     * @param option the Option
     */
    public void setOption(final Integer option) {
        this.option = option;
    }

    /**
     * Gets Index.
     *
     * @return the Index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * Sets Index.
     *
     * @param index the Index
     */
    public void setIndex(final Integer index) {
        this.index = index;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(option, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(index, ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        option = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        index = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(82);
        builder.append("SaveStartupParametersCommand [");
        builder.append(super.toString());
        builder.append(", option=");
        builder.append(option);
        builder.append(", index=");
        builder.append(index);
        builder.append(']');
        return builder.toString();
    }

}
