/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.healthchecks.internal.http;

import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.healthchecks.model.*;
import com.oracle.bmc.healthchecks.requests.*;
import com.oracle.bmc.healthchecks.responses.*;
import org.apache.commons.lang3.Validate;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180501")
@lombok.extern.slf4j.Slf4j
public class UpdatePingMonitorConverter {
    private static final com.oracle.bmc.http.internal.ResponseConversionFunctionFactory
            RESPONSE_CONVERSION_FACTORY =
                    new com.oracle.bmc.http.internal.ResponseConversionFunctionFactory();

    public static com.oracle.bmc.healthchecks.requests.UpdatePingMonitorRequest interceptRequest(
            com.oracle.bmc.healthchecks.requests.UpdatePingMonitorRequest request) {

        return request;
    }

    public static com.oracle.bmc.http.internal.WrappedInvocationBuilder fromRequest(
            com.oracle.bmc.http.internal.RestClient client,
            com.oracle.bmc.healthchecks.requests.UpdatePingMonitorRequest request) {
        Validate.notNull(request, "request instance is required");
        Validate.notBlank(request.getMonitorId(), "monitorId must not be blank");
        Validate.notNull(
                request.getUpdatePingMonitorDetails(), "updatePingMonitorDetails is required");

        com.oracle.bmc.http.internal.WrappedWebTarget target =
                client.getBaseTarget()
                        .path("/20180501")
                        .path("pingMonitors")
                        .path(
                                com.oracle.bmc.util.internal.HttpUtils.encodePathSegment(
                                        request.getMonitorId()));

        com.oracle.bmc.http.internal.WrappedInvocationBuilder ib = target.request();

        ib.accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);

        if (request.getOpcRequestId() != null) {
            ib.header("opc-request-id", request.getOpcRequestId());
        }

        if (request.getIfMatch() != null) {
            ib.header("if-match", request.getIfMatch());
        }

        return ib;
    }

    public static com.google.common.base.Function<
                    javax.ws.rs.core.Response,
                    com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse>
            fromResponse() {
        final com.google.common.base.Function<
                        javax.ws.rs.core.Response,
                        com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse>
                transformer =
                        new com.google.common.base.Function<
                                javax.ws.rs.core.Response,
                                com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse>() {
                            @Override
                            public com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse
                                    apply(javax.ws.rs.core.Response rawResponse) {
                                LOG.trace(
                                        "Transform function invoked for com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse");
                                com.google.common.base.Function<
                                                javax.ws.rs.core.Response,
                                                com.oracle.bmc.http.internal.WithHeaders<
                                                        PingMonitor>>
                                        responseFn =
                                                RESPONSE_CONVERSION_FACTORY.create(
                                                        PingMonitor.class);

                                com.oracle.bmc.http.internal.WithHeaders<PingMonitor> response =
                                        responseFn.apply(rawResponse);
                                javax.ws.rs.core.MultivaluedMap<String, String> headers =
                                        response.getHeaders();

                                com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse
                                                .Builder
                                        builder =
                                                com.oracle.bmc.healthchecks.responses
                                                        .UpdatePingMonitorResponse.builder();

                                builder.pingMonitor(response.getItem());

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

                                com.google.common.base.Optional<java.util.List<String>> etagHeader =
                                        com.oracle.bmc.http.internal.HeaderUtils.get(
                                                headers, "etag");
                                if (etagHeader.isPresent()) {
                                    builder.etag(
                                            com.oracle.bmc.http.internal.HeaderUtils.toValue(
                                                    "etag", etagHeader.get().get(0), String.class));
                                }

                                com.oracle.bmc.healthchecks.responses.UpdatePingMonitorResponse
                                        responseWrapper = builder.build();

                                ResponseHelper.closeResponseSilentlyIfNotBuffered(rawResponse);
                                return responseWrapper;
                            }
                        };
        return transformer;
    }
}
