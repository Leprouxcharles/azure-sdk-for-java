/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Site details provided during the time of site creation.
 */
public class FabricCreationInput {
    /**
     * Fabric creation input.
     */
    @JsonProperty(value = "properties")
    private FabricCreationInputProperties properties;

    /**
     * Get fabric creation input.
     *
     * @return the properties value
     */
    public FabricCreationInputProperties properties() {
        return this.properties;
    }

    /**
     * Set fabric creation input.
     *
     * @param properties the properties value to set
     * @return the FabricCreationInput object itself.
     */
    public FabricCreationInput withProperties(FabricCreationInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
