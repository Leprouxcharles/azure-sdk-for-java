// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in InboundNatRules. */
public final class InboundNatRulesInner {
    /** The proxy service used to perform REST calls. */
    private final InboundNatRulesService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of InboundNatRulesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    InboundNatRulesInner(NetworkManagementClientImpl client) {
        this.service =
            RestProxy.create(InboundNatRulesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientInboundNatRules to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface InboundNatRulesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InboundNatRuleListResultInner>> list(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules/{inboundNatRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("inboundNatRuleName") String inboundNatRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules/{inboundNatRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InboundNatRuleInner>> get(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("inboundNatRuleName") String inboundNatRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("$expand") String expand,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules/{inboundNatRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("inboundNatRuleName") String inboundNatRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") InboundNatRuleInner inboundNatRuleParameters,
            Context context);

        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Delete(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules/{inboundNatRuleName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("inboundNatRuleName") String inboundNatRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/loadBalancers/{loadBalancerName}/inboundNatRules/{inboundNatRuleName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InboundNatRuleInner>> beginCreateOrUpdate(
            @HostParam("$host") String host,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("loadBalancerName") String loadBalancerName,
            @PathParam("inboundNatRuleName") String inboundNatRuleName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") InboundNatRuleInner inboundNatRuleParameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<InboundNatRuleListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound nat rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<InboundNatRuleInner>> listSinglePageAsync(
        String resourceGroupName, String loadBalancerName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .<PagedResponse<InboundNatRuleInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound nat rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<InboundNatRuleInner> listAsync(String resourceGroupName, String loadBalancerName) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceGroupName, loadBalancerName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all the inbound nat rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the inbound nat rules in a load balancer.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<InboundNatRuleInner> list(String resourceGroupName, String loadBalancerName) {
        return new PagedIterable<>(listAsync(resourceGroupName, loadBalancerName));
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .delete(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            inboundNatRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            deleteWithResponseAsync(resourceGroupName, loadBalancerName, inboundNatRuleName);
        return this
            .client
            .<Void, Void>getLroResultAsync(mono, this.client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        deleteAsync(resourceGroupName, loadBalancerName, inboundNatRuleName).block();
    }

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<InboundNatRuleInner>> getWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            inboundNatRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            expand,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InboundNatRuleInner> getAsync(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand) {
        return getWithResponseAsync(resourceGroupName, loadBalancerName, inboundNatRuleName, expand)
            .flatMap(
                (SimpleResponse<InboundNatRuleInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InboundNatRuleInner> getAsync(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        final String expand = null;
        final Context context = null;
        return getWithResponseAsync(resourceGroupName, loadBalancerName, inboundNatRuleName, expand)
            .flatMap(
                (SimpleResponse<InboundNatRuleInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundNatRuleInner get(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName, String expand) {
        return getAsync(resourceGroupName, loadBalancerName, inboundNatRuleName, expand).block();
    }

    /**
     * Gets the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified load balancer inbound nat rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundNatRuleInner get(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        final String expand = null;
        final Context context = null;
        return getAsync(resourceGroupName, loadBalancerName, inboundNatRuleName, expand).block();
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            inboundNatRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            inboundNatRuleParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InboundNatRuleInner> createOrUpdateAsync(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> mono =
            createOrUpdateWithResponseAsync(
                resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters);
        return this
            .client
            .<InboundNatRuleInner, InboundNatRuleInner>getLroResultAsync(
                mono, this.client.getHttpPipeline(), InboundNatRuleInner.class, InboundNatRuleInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundNatRuleInner createOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        return createOrUpdateAsync(resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters)
            .block();
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(
        String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginDelete(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            inboundNatRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        return beginDeleteWithResponseAsync(resourceGroupName, loadBalancerName, inboundNatRuleName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String loadBalancerName, String inboundNatRuleName) {
        beginDeleteAsync(resourceGroupName, loadBalancerName, inboundNatRuleName).block();
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<InboundNatRuleInner>> beginCreateOrUpdateWithResponseAsync(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        final String apiVersion = "2019-06-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .beginCreateOrUpdate(
                            this.client.getHost(),
                            resourceGroupName,
                            loadBalancerName,
                            inboundNatRuleName,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            inboundNatRuleParameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<InboundNatRuleInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        return beginCreateOrUpdateWithResponseAsync(
                resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters)
            .flatMap(
                (SimpleResponse<InboundNatRuleInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates a load balancer inbound nat rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param inboundNatRuleName The name of the inbound nat rule.
     * @param inboundNatRuleParameters Inbound NAT rule of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return inbound NAT rule of the load balancer.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InboundNatRuleInner beginCreateOrUpdate(
        String resourceGroupName,
        String loadBalancerName,
        String inboundNatRuleName,
        InboundNatRuleInner inboundNatRuleParameters) {
        return beginCreateOrUpdateAsync(
                resourceGroupName, loadBalancerName, inboundNatRuleName, inboundNatRuleParameters)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListInboundNatRule API service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<InboundNatRuleInner>> listNextSinglePageAsync(String nextLink) {
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<InboundNatRuleInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }
}
