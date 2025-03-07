/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Summary of a log analytics entity type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEntityTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEntityTypeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
        private EntityCloudType cloudType;

        public Builder cloudType(EntityCloudType cloudType) {
            this.cloudType = cloudType;
            this.__explicitlySet__.add("cloudType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EntityLifecycleStates lifecycleState;

        public Builder lifecycleState(EntityLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentEligibilityStatus")
        private ManagementAgentEligibilityStatus managementAgentEligibilityStatus;

        public Builder managementAgentEligibilityStatus(
                ManagementAgentEligibilityStatus managementAgentEligibilityStatus) {
            this.managementAgentEligibilityStatus = managementAgentEligibilityStatus;
            this.__explicitlySet__.add("managementAgentEligibilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEntityTypeSummary build() {
            LogAnalyticsEntityTypeSummary __instance__ =
                    new LogAnalyticsEntityTypeSummary(
                            name,
                            internalName,
                            category,
                            cloudType,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            managementAgentEligibilityStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEntityTypeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .internalName(o.getInternalName())
                            .category(o.getCategory())
                            .cloudType(o.getCloudType())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .managementAgentEligibilityStatus(
                                    o.getManagementAgentEligibilityStatus());

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
     * Log analytics entity type name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Internal name for the log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    String internalName;

    /**
     * Log analytics entity type category. Category will be used for grouping and filtering.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;

    /**
     * Log analytics entity type group. This can be CLOUD (OCI) or NON_CLOUD otherwise.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudType")
    EntityCloudType cloudType;

    /**
     * The current lifecycle state of the log analytics entity type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    EntityLifecycleStates lifecycleState;

    /**
     * Time the log analytics entity type was created. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Time the log analytics entity type was updated. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * This field indicates whether logs for entities of this type can be collected using a management agent.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ManagementAgentEligibilityStatus {
        Eligible("ELIGIBLE"),
        Ineligible("INELIGIBLE"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ManagementAgentEligibilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagementAgentEligibilityStatus v : ManagementAgentEligibilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagementAgentEligibilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagementAgentEligibilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagementAgentEligibilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This field indicates whether logs for entities of this type can be collected using a management agent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentEligibilityStatus")
    ManagementAgentEligibilityStatus managementAgentEligibilityStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
