/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RestoreObjectsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RestoreObjectsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hours")
        private Integer hours;

        public Builder hours(Integer hours) {
            this.hours = hours;
            this.__explicitlySet__.add("hours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionId")
        private String versionId;

        public Builder versionId(String versionId) {
            this.versionId = versionId;
            this.__explicitlySet__.add("versionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestoreObjectsDetails build() {
            RestoreObjectsDetails __instance__ =
                    new RestoreObjectsDetails(objectName, hours, versionId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestoreObjectsDetails o) {
            Builder copiedBuilder =
                    objectName(o.getObjectName()).hours(o.getHours()).versionId(o.getVersionId());

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
     * An object that is in an archive storage tier and needs to be restored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The number of hours for which this object will be restored.
     * By default objects will be restored for 24 hours. You can instead configure the duration using the hours parameter.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hours")
    Integer hours;

    /**
     * The versionId of the object to restore. Current object version is used by default.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionId")
    String versionId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
