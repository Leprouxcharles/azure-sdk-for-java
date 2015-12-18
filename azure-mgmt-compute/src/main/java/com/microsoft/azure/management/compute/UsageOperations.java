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

import com.microsoft.azure.management.compute.models.ListUsagesResult;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in UsageOperations.
 */
public interface UsageOperations {
    /**
     * The interface defining all the services for UsageOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface UsageService {
        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/usages")
        Call<ResponseBody> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ListUsagesResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ListUsagesResult> list(String location) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists compute usages for a subscription.
     *
     * @param location The location upon which resource usage is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String location, final ServiceCallback<ListUsagesResult> serviceCallback);

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ListUsagesResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ListUsagesResult> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists compute usages for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<ListUsagesResult> serviceCallback);

}
