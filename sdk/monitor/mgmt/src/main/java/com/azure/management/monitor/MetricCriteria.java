// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The MetricCriteria model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "criterionType")
@JsonTypeName("StaticThresholdCriterion")
@Fluent
public final class MetricCriteria extends MultiMetricCriteria {
    /*
     * the criteria operator.
     */
    @JsonProperty(value = "operator", required = true)
    private Operator operator;

    /*
     * the criteria threshold value that activates the alert.
     */
    @JsonProperty(value = "threshold", required = true)
    private double threshold;

    /**
     * Get the operator property: the criteria operator.
     *
     * @return the operator value.
     */
    public Operator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the criteria operator.
     *
     * @param operator the operator value to set.
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withOperator(Operator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: the criteria threshold value that activates the alert.
     *
     * @return the threshold value.
     */
    public double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: the criteria threshold value that activates the alert.
     *
     * @param threshold the threshold value to set.
     * @return the MetricCriteria object itself.
     */
    public MetricCriteria withThreshold(double threshold) {
        this.threshold = threshold;
        return this;
    }
}
