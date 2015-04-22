package com.thinkaurelius.titan.blueprints;

import com.thinkaurelius.titan.HBaseStorageSetup;
import com.thinkaurelius.titan.diskstorage.configuration.ModifiableConfiguration;

/**
 * @author Matthias Broecheler (me@matthiasb.com)
 */
public class HBaseGraphComputerProvider extends AbstractTitanGraphComputerProvider {

    @Override
    public ModifiableConfiguration getTitanConfiguration(String graphName, Class<?> test, String testMethodName) {
        return HBaseStorageSetup.getHBaseConfiguration(graphName);
    }

}