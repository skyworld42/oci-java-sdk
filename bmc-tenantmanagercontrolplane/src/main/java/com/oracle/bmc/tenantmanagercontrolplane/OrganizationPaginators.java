/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane;

import com.oracle.bmc.tenantmanagercontrolplane.requests.*;
import com.oracle.bmc.tenantmanagercontrolplane.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of Organization where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@lombok.RequiredArgsConstructor
public class OrganizationPaginators {
    private final Organization client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listOrganizationTenancies operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOrganizationTenanciesResponse> listOrganizationTenanciesResponseIterator(
            final ListOrganizationTenanciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOrganizationTenanciesRequest.Builder, ListOrganizationTenanciesRequest,
                ListOrganizationTenanciesResponse>(
                new com.google.common.base.Supplier<ListOrganizationTenanciesRequest.Builder>() {
                    @Override
                    public ListOrganizationTenanciesRequest.Builder get() {
                        return ListOrganizationTenanciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOrganizationTenanciesResponse, String>() {
                    @Override
                    public String apply(ListOrganizationTenanciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOrganizationTenanciesRequest.Builder>,
                        ListOrganizationTenanciesRequest>() {
                    @Override
                    public ListOrganizationTenanciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOrganizationTenanciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationTenanciesRequest, ListOrganizationTenanciesResponse>() {
                    @Override
                    public ListOrganizationTenanciesResponse apply(
                            ListOrganizationTenanciesRequest request) {
                        return client.listOrganizationTenancies(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancySummary} objects
     * contained in responses from the listOrganizationTenancies operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancySummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancySummary>
            listOrganizationTenanciesRecordIterator(
                    final ListOrganizationTenanciesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOrganizationTenanciesRequest.Builder, ListOrganizationTenanciesRequest,
                ListOrganizationTenanciesResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationTenancySummary>(
                new com.google.common.base.Supplier<ListOrganizationTenanciesRequest.Builder>() {
                    @Override
                    public ListOrganizationTenanciesRequest.Builder get() {
                        return ListOrganizationTenanciesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOrganizationTenanciesResponse, String>() {
                    @Override
                    public String apply(ListOrganizationTenanciesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOrganizationTenanciesRequest.Builder>,
                        ListOrganizationTenanciesRequest>() {
                    @Override
                    public ListOrganizationTenanciesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOrganizationTenanciesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationTenanciesRequest, ListOrganizationTenanciesResponse>() {
                    @Override
                    public ListOrganizationTenanciesResponse apply(
                            ListOrganizationTenanciesRequest request) {
                        return client.listOrganizationTenancies(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationTenanciesResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .OrganizationTenancySummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .OrganizationTenancySummary>
                            apply(ListOrganizationTenanciesResponse response) {
                        return response.getOrganizationTenancyCollection().getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listOrganizations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListOrganizationsResponse> listOrganizationsResponseIterator(
            final ListOrganizationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListOrganizationsRequest.Builder, ListOrganizationsRequest,
                ListOrganizationsResponse>(
                new com.google.common.base.Supplier<ListOrganizationsRequest.Builder>() {
                    @Override
                    public ListOrganizationsRequest.Builder get() {
                        return ListOrganizationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOrganizationsResponse, String>() {
                    @Override
                    public String apply(ListOrganizationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOrganizationsRequest.Builder>,
                        ListOrganizationsRequest>() {
                    @Override
                    public ListOrganizationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOrganizationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationsRequest, ListOrganizationsResponse>() {
                    @Override
                    public ListOrganizationsResponse apply(ListOrganizationsRequest request) {
                        return client.listOrganizations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationSummary} objects
     * contained in responses from the listOrganizations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationSummary>
            listOrganizationsRecordIterator(final ListOrganizationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListOrganizationsRequest.Builder, ListOrganizationsRequest,
                ListOrganizationsResponse,
                com.oracle.bmc.tenantmanagercontrolplane.model.OrganizationSummary>(
                new com.google.common.base.Supplier<ListOrganizationsRequest.Builder>() {
                    @Override
                    public ListOrganizationsRequest.Builder get() {
                        return ListOrganizationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListOrganizationsResponse, String>() {
                    @Override
                    public String apply(ListOrganizationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListOrganizationsRequest.Builder>,
                        ListOrganizationsRequest>() {
                    @Override
                    public ListOrganizationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListOrganizationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationsRequest, ListOrganizationsResponse>() {
                    @Override
                    public ListOrganizationsResponse apply(ListOrganizationsRequest request) {
                        return client.listOrganizations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListOrganizationsResponse,
                        java.util.List<
                                com.oracle.bmc.tenantmanagercontrolplane.model
                                        .OrganizationSummary>>() {
                    @Override
                    public java.util.List<
                                    com.oracle.bmc.tenantmanagercontrolplane.model
                                            .OrganizationSummary>
                            apply(ListOrganizationsResponse response) {
                        return response.getOrganizationCollection().getItems();
                    }
                });
    }
}
