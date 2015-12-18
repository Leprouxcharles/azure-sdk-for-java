/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute.models;

import java.util.List;

/**
 * Extensions summary for virtual machines of a virtual machine scale set.
 */
public class VirtualMachineScaleSetVMExtensionsSummary {
    /**
     * Gets the extension name.
     */
    private String name;

    /**
     * Gets the extensions information.
     */
    private List<VirtualMachineStatusCodeCount> statusesSummary;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the statusesSummary value.
     *
     * @return the statusesSummary value
     */
    public List<VirtualMachineStatusCodeCount> getStatusesSummary() {
        return this.statusesSummary;
    }

}
