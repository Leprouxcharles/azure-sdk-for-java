/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.VirtualMachineImage;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResource;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.List;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineImagesOperations.
 */
public interface VirtualMachineImagesOperations {
    /**
     * The interface defining all the services for VirtualMachineImagesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineImagesService {
        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions/{version}")
        Call<ResponseBody> get(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("version") String version, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus/{skus}/versions")
        Call<ResponseBody> list(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("skus") String skus, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("$orderby") String orderby, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers")
        Call<ResponseBody> listOffers(@Path("location") String location, @Path("publisherName") String publisherName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers")
        Call<ResponseBody> listPublishers(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/publishers/{publisherName}/artifacttypes/vmimage/offers/{offer}/skus")
        Call<ResponseBody> listSkus(@Path("location") String location, @Path("publisherName") String publisherName, @Path("offer") String offer, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineImage object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineImage> get(String location, String publisherName, String offer, String skus, String version) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a virtual machine image.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param version the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String location, String publisherName, String offer, String skus, String version, final ServiceCallback<VirtualMachineImage> serviceCallback);

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> list(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine images.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param skus the String value
     * @param filter The filter to apply on the operation.
     * @param top the Integer value
     * @param orderby the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String location, String publisherName, String offer, String skus, VirtualMachineImageResource filter, Integer top, String orderby, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listOffers(String location, String publisherName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image offers.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listOffersAsync(String location, String publisherName, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listPublishers(String location) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image publishers.
     *
     * @param location the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listPublishersAsync(String location, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;VirtualMachineImageResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<List<VirtualMachineImageResource>> listSkus(String location, String publisherName, String offer) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a list of virtual machine image skus.
     *
     * @param location the String value
     * @param publisherName the String value
     * @param offer the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listSkusAsync(String location, String publisherName, String offer, final ServiceCallback<List<VirtualMachineImageResource>> serviceCallback);

}
