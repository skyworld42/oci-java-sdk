/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Optional settings for Data Pump Export and Import jobs
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDataPumpSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateDataPumpSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
        private DataPumpJobMode jobMode;

        public Builder jobMode(DataPumpJobMode jobMode) {
            this.jobMode = jobMode;
            this.__explicitlySet__.add("jobMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataPumpParameters")
        private UpdateDataPumpParameters dataPumpParameters;

        public Builder dataPumpParameters(UpdateDataPumpParameters dataPumpParameters) {
            this.dataPumpParameters = dataPumpParameters;
            this.__explicitlySet__.add("dataPumpParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadataRemaps")
        private java.util.List<MetadataRemap> metadataRemaps;

        public Builder metadataRemaps(java.util.List<MetadataRemap> metadataRemaps) {
            this.metadataRemaps = metadataRemaps;
            this.__explicitlySet__.add("metadataRemaps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exportDirectoryObject")
        private UpdateDirectoryObject exportDirectoryObject;

        public Builder exportDirectoryObject(UpdateDirectoryObject exportDirectoryObject) {
            this.exportDirectoryObject = exportDirectoryObject;
            this.__explicitlySet__.add("exportDirectoryObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importDirectoryObject")
        private UpdateDirectoryObject importDirectoryObject;

        public Builder importDirectoryObject(UpdateDirectoryObject importDirectoryObject) {
            this.importDirectoryObject = importDirectoryObject;
            this.__explicitlySet__.add("importDirectoryObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataPumpSettings build() {
            UpdateDataPumpSettings __instance__ =
                    new UpdateDataPumpSettings(
                            jobMode,
                            dataPumpParameters,
                            metadataRemaps,
                            exportDirectoryObject,
                            importDirectoryObject);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataPumpSettings o) {
            Builder copiedBuilder =
                    jobMode(o.getJobMode())
                            .dataPumpParameters(o.getDataPumpParameters())
                            .metadataRemaps(o.getMetadataRemaps())
                            .exportDirectoryObject(o.getExportDirectoryObject())
                            .importDirectoryObject(o.getImportDirectoryObject());

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
     * Data Pump job mode.
     * Refer to [Data Pump Export Modes ](https://docs.oracle.com/en/database/oracle/oracle-database/19/sutil/oracle-data-pump-export-utility.html#GUID-8E497131-6B9B-4CC8-AA50-35F480CAC2C4)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobMode")
    DataPumpJobMode jobMode;

    @com.fasterxml.jackson.annotation.JsonProperty("dataPumpParameters")
    UpdateDataPumpParameters dataPumpParameters;

    /**
     * Defines remappings to be applied to objects as they are processed.
     * Refer to [METADATA_REMAP Procedure ](https://docs.oracle.com/en/database/oracle/oracle-database/19/arpls/DBMS_DATAPUMP.html#GUID-0FC32790-91E6-4781-87A3-229DE024CB3D)
     * If specified, the list will be replaced entirely. Empty list will remove stored Metadata Remap details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadataRemaps")
    java.util.List<MetadataRemap> metadataRemaps;

    @com.fasterxml.jackson.annotation.JsonProperty("exportDirectoryObject")
    UpdateDirectoryObject exportDirectoryObject;

    @com.fasterxml.jackson.annotation.JsonProperty("importDirectoryObject")
    UpdateDirectoryObject importDirectoryObject;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
