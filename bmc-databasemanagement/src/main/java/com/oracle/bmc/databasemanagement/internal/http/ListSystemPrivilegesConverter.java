/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.databasemanagement.model.*;
import com.oracle.bmc.databasemanagement.requests.*;
import com.oracle.bmc.databasemanagement.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.extern.slf4j.Slf4j
public class ListSystemPrivilegesConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.databasemanagement.requests.ListSystemPrivilegesRequest
            interceptRequest(
                    com.oracle.bmc.databasemanagement.requests.ListSystemPrivilegesRequest
                            request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.databasemanagement.requests.ListSystemPrivilegesRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getManagedDatabaseId(), "managedDatabaseId must not be blank");
        Validate.notBlank(request.getUserName(), "userName must not be blank");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20201101")
                        .path("managedDatabases")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getManagedDatabaseId()))
                        .path("users")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getUserName()))
                        .path("systemPrivileges");

        if (request.getName() != null) {
            target =
                    target.queryParam(
                            "name",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getName()));
        }

        if (request.getSortBy() != null) {
            target =
                    target.queryParam(
                            "sortBy",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortBy().getValue()));
        }

        if (request.getSortOrder() != null) {
            target =
                    target.queryParam(
                            "sortOrder",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getSortOrder().getValue()));
        }

        if (request.getLimit() != null) {
            target =
                    target.queryParam(
                            "limit",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getLimit()));
        }

        if (request.getPage() != null) {
            target =
                    target.queryParam(
                            "page",
                            com.oracle.bmc.util.internal.HttpUtils.attemptEncodeQueryParam(
                                    request.getPage()));
        }

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (client.getClientConfigurator() != null) {
            client.getClientConfigurator().customizeRequest(request, ib);
        }
        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.databasemanagement.responses.ListSystemPrivilegesResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.databasemanagement.responses.ListSystemPrivilegesResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.databasemanagement.responses
                                        .ListSystemPrivilegesResponse>() {
                            @Override
                            public com.oracle.bmc.databasemanagement.responses
                                            .ListSystemPrivilegesResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.databasemanagement.responses.ListSystemPrivilegesResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        com.oracle.bmc.databasemanagement.model
                                                                .SystemPrivilegeCollection>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        com.oracle.bmc.databasemanagement.model
                                                                        .SystemPrivilegeCollection
                                                                .class);

                                com.oracle.bmc.http.internal.WithHeaders<
                                                com.oracle.bmc.databasemanagement.model
                                                        .SystemPrivilegeCollection>
                                        response = responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.databasemanagement.responses
                                                .ListSystemPrivilegesResponse.Builder
                                        builder =
                                                com.oracle.bmc.databasemanagement.responses
                                                        .ListSystemPrivilegesResponse.builder()
                                                        .__httpStatusCode__(
                                                                rawResponse.getStatus());

                                builder.systemPrivilegeCollection(response.getItem());

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcNextPageHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-next-page");
                                if (opcNextPageHeader.isPresent()) {
                                    builder.opcNextPage(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-next-page",
                                                    opcNextPageHeader.get().get(0),
                                                    String.class));
                                }

                                com.google.common.base.Optional<java.util.List<String>>
                                        opcRequestIdHeader =
                                                com.oracle.bmc.http.internal.HeaderUtils.get(
                                                        headers, "opc-request-id");
                                if (opcRequestIdHeader.isPresent()) {
                                    builder.opcRequestId(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "opc-request-id",
                                                    opcRequestIdHeader.get().get(0),
                                                    String.class));
                                }

                                com.oracle.bmc.databasemanagement.responses
                                                .ListSystemPrivilegesResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
