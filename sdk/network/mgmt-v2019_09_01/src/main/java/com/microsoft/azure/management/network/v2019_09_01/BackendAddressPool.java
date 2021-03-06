/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2019_09_01.implementation.BackendAddressPoolInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2019_09_01.implementation.NetworkManager;
import java.util.List;
import com.microsoft.azure.SubResource;

/**
 * Type representing BackendAddressPool.
 */
public interface BackendAddressPool extends HasInner<BackendAddressPoolInner>, Indexable, Refreshable<BackendAddressPool>, HasManager<NetworkManager> {
    /**
     * @return the backendIPConfigurations value.
     */
    List<VirtualMachineScaleSetNetworkInterfaceIPConfiguration> backendIPConfigurations();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the loadBalancingRules value.
     */
    List<SubResource> loadBalancingRules();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the outboundRule value.
     */
    SubResource outboundRule();

    /**
     * @return the outboundRules value.
     */
    List<SubResource> outboundRules();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the type value.
     */
    String type();

}
