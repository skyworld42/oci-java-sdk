/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * SourceSummaryReport
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
    builder = SourceSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SourceSummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
        private Integer nonOobCount;

        public Builder nonOobCount(Integer nonOobCount) {
            this.nonOobCount = nonOobCount;
            this.__explicitlySet__.add("nonOobCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoAssociationSourceCount")
        private Integer autoAssociationSourceCount;

        public Builder autoAssociationSourceCount(Integer autoAssociationSourceCount) {
            this.autoAssociationSourceCount = autoAssociationSourceCount;
            this.__explicitlySet__.add("autoAssociationSourceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
        private Integer oobCount;

        public Builder oobCount(Integer oobCount) {
            this.oobCount = oobCount;
            this.__explicitlySet__.add("oobCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceSummaryReport build() {
            SourceSummaryReport __instance__ =
                    new SourceSummaryReport(nonOobCount, autoAssociationSourceCount, oobCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceSummaryReport o) {
            Builder copiedBuilder =
                    nonOobCount(o.getNonOobCount())
                            .autoAssociationSourceCount(o.getAutoAssociationSourceCount())
                            .oobCount(o.getOobCount());

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
     * The count of custom (user defined) sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
    Integer nonOobCount;

    /**
     * The count of sources set to auto-associate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoAssociationSourceCount")
    Integer autoAssociationSourceCount;

    /**
     * The count of built in sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
    Integer oobCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
