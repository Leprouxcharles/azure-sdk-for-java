// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AzureFirewallNetworkRuleCollection model. */
@JsonFlatten
@Fluent
public class AzureFirewallNetworkRuleCollection extends SubResource {
    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Priority of the network rule collection resource.
     */
    @JsonProperty(value = "properties.priority")
    private Integer priority;

    /*
     * The action type of a rule collection.
     */
    @JsonProperty(value = "properties.action")
    private AzureFirewallRCAction action;

    /*
     * Collection of rules used by a network rule collection.
     */
    @JsonProperty(value = "properties.rules")
    private List<AzureFirewallNetworkRule> rules;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the priority property: Priority of the network rule collection resource.
     *
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the network rule collection resource.
     *
     * @param priority the priority value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a rule collection.
     *
     * @return the action value.
     */
    public AzureFirewallRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a rule collection.
     *
     * @param action the action value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withAction(AzureFirewallRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a network rule collection.
     *
     * @return the rules value.
     */
    public List<AzureFirewallNetworkRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a network rule collection.
     *
     * @param rules the rules value to set.
     * @return the AzureFirewallNetworkRuleCollection object itself.
     */
    public AzureFirewallNetworkRuleCollection withRules(List<AzureFirewallNetworkRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }
}
