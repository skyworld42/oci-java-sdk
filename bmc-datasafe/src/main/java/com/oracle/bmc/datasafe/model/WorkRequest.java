/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * An asynchronous work request.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class WorkRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private OperationType operationType;

        public Builder operationType(OperationType operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequest build() {
            WorkRequest __instance__ =
                    new WorkRequest(
                            operationType,
                            status,
                            id,
                            compartmentId,
                            resources,
                            percentComplete,
                            timeAccepted,
                            timeStarted,
                            timeFinished);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequest o) {
            Builder copiedBuilder =
                    operationType(o.getOperationType())
                            .status(o.getStatus())
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .resources(o.getResources())
                            .percentComplete(o.getPercentComplete())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The resources that are affected by the work request.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum OperationType {
        EnableDataSafeConfiguration("ENABLE_DATA_SAFE_CONFIGURATION"),
        CreatePrivateEndpoint("CREATE_PRIVATE_ENDPOINT"),
        UpdatePrivateEndpoint("UPDATE_PRIVATE_ENDPOINT"),
        DeletePrivateEndpoint("DELETE_PRIVATE_ENDPOINT"),
        ChangePrivateEndpointCompartment("CHANGE_PRIVATE_ENDPOINT_COMPARTMENT"),
        CreateOnpremConnector("CREATE_ONPREM_CONNECTOR"),
        UpdateOnpremConnector("UPDATE_ONPREM_CONNECTOR"),
        DeleteOnpremConnector("DELETE_ONPREM_CONNECTOR"),
        UpdateOnpremConnectorWallet("UPDATE_ONPREM_CONNECTOR_WALLET"),
        ChangeOnpremConnectorCompartment("CHANGE_ONPREM_CONNECTOR_COMPARTMENT"),
        CreateTargetDatabase("CREATE_TARGET_DATABASE"),
        UpdateTargetDatabase("UPDATE_TARGET_DATABASE"),
        ActivateTargetDatabase("ACTIVATE_TARGET_DATABASE"),
        DeactivateTargetDatabase("DEACTIVATE_TARGET_DATABASE"),
        DeleteTargetDatabase("DELETE_TARGET_DATABASE"),
        ChangeTargetDatabaseCompartment("CHANGE_TARGET_DATABASE_COMPARTMENT"),
        CreateUserAssessment("CREATE_USER_ASSESSMENT"),
        AssessUserAssessment("ASSESS_USER_ASSESSMENT"),
        CreateSnapshotUserAssessment("CREATE_SNAPSHOT_USER_ASSESSMENT"),
        CreateScheduleUserAssessment("CREATE_SCHEDULE_USER_ASSESSMENT"),
        CompareWithBaselineUserAssessment("COMPARE_WITH_BASELINE_USER_ASSESSMENT"),
        DeleteUserAssessment("DELETE_USER_ASSESSMENT"),
        UpdateUserAssessment("UPDATE_USER_ASSESSMENT"),
        ChangeUserAssessmentCompartment("CHANGE_USER_ASSESSMENT_COMPARTMENT"),
        SetUserAssessmentBaseline("SET_USER_ASSESSMENT_BASELINE"),
        UnsetUserAssessmentBaseline("UNSET_USER_ASSESSMENT_BASELINE"),
        GenerateUserAssessmentReport("GENERATE_USER_ASSESSMENT_REPORT"),
        CreateSecurityAssessment("CREATE_SECURITY_ASSESSMENT"),
        CreateSecurityAssessmentNow("CREATE_SECURITY_ASSESSMENT_NOW"),
        AssessSecurityAssessment("ASSESS_SECURITY_ASSESSMENT"),
        CreateSnapshotSecurityAssessment("CREATE_SNAPSHOT_SECURITY_ASSESSMENT"),
        CreateScheduleSecurityAssessment("CREATE_SCHEDULE_SECURITY_ASSESSMENT"),
        CompareWithBaselineSecurityAssessment("COMPARE_WITH_BASELINE_SECURITY_ASSESSMENT"),
        DeleteSecurityAssessment("DELETE_SECURITY_ASSESSMENT"),
        UpdateSecurityAssessment("UPDATE_SECURITY_ASSESSMENT"),
        ChangeSecurityAssessmentCompartment("CHANGE_SECURITY_ASSESSMENT_COMPARTMENT"),
        SetSecurityAssessmentBaseline("SET_SECURITY_ASSESSMENT_BASELINE"),
        UnsetSecurityAssessmentBaseline("UNSET_SECURITY_ASSESSMENT_BASELINE"),
        GenerateSecurityAssessmentReport("GENERATE_SECURITY_ASSESSMENT_REPORT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, OperationType> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationType v : OperationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The resources that are affected by the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    OperationType operationType;
    /**
     * The current status of the work request.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current status of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The OCID of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains the work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The resources that are affected by this work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    java.util.List<WorkRequestResource> resources;

    /**
     * Progress of the work request in percentage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Float percentComplete;

    /**
     * The date and time the work request was accepted, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * The date and time the work request transitioned from ACCEPTED to IN_PROGRESS, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the work request reached a terminal state, either FAILED or SUCCEEDED. Format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
