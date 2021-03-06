// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.VnetValidationTestFailure;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The VnetValidationFailureDetails model. */
@JsonFlatten
@Fluent
public class VnetValidationFailureDetailsInner extends ProxyOnlyResource {
    /*
     * A flag describing whether or not validation failed.
     */
    @JsonProperty(value = "properties.failed")
    private Boolean failed;

    /*
     * A list of tests that failed in the validation.
     */
    @JsonProperty(value = "properties.failedTests")
    private List<VnetValidationTestFailure> failedTests;

    /**
     * Get the failed property: A flag describing whether or not validation failed.
     *
     * @return the failed value.
     */
    public Boolean failed() {
        return this.failed;
    }

    /**
     * Set the failed property: A flag describing whether or not validation failed.
     *
     * @param failed the failed value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailed(Boolean failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Get the failedTests property: A list of tests that failed in the validation.
     *
     * @return the failedTests value.
     */
    public List<VnetValidationTestFailure> failedTests() {
        return this.failedTests;
    }

    /**
     * Set the failedTests property: A list of tests that failed in the validation.
     *
     * @param failedTests the failedTests value to set.
     * @return the VnetValidationFailureDetailsInner object itself.
     */
    public VnetValidationFailureDetailsInner withFailedTests(List<VnetValidationTestFailure> failedTests) {
        this.failedTests = failedTests;
        return this;
    }
}
