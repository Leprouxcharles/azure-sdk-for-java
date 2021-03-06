/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.CertificateContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.ApiManagementManager;
import org.joda.time.DateTime;

/**
 * Type representing CertificateContract.
 */
public interface CertificateContract extends HasInner<CertificateContractInner>, Indexable, Updatable<CertificateContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the expirationDate value.
     */
    DateTime expirationDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the subject value.
     */
    String subject();

    /**
     * @return the thumbprint value.
     */
    String thumbprint();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CertificateContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithData, DefinitionStages.WithPassword, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CertificateContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CertificateContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the certificatecontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the certificatecontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the certificatecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithData withIfMatch(String ifMatch);
        }

        /**
         * The stage of the certificatecontract definition allowing to specify Data.
         */
        interface WithData {
           /**
            * Specifies data.
            * @param data Base 64 encoded certificate using the application/x-pkcs12 representation
            * @return the next definition stage
            */
            WithPassword withData(String data);
        }

        /**
         * The stage of the certificatecontract definition allowing to specify Password.
         */
        interface WithPassword {
           /**
            * Specifies password.
            * @param password Password for the Certificate
            * @return the next definition stage
            */
            WithCreate withPassword(String password);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CertificateContract> {
        }
    }
    /**
     * The template for a CertificateContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CertificateContract>, UpdateStages.WithIfMatch {
    }

    /**
     * Grouping of CertificateContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the certificatecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

    }
}
