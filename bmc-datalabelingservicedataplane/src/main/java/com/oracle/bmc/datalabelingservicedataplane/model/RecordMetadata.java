/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Collection of record's metadata.  This can be, for example, the height, width or depth of image for an image record.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "recordType",
    defaultImpl = RecordMetadata.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DocumentMetadata.class,
        name = "DOCUMENT_METADATA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ImageMetadata.class,
        name = "IMAGE_METADATA"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TextMetadata.class,
        name = "TEXT_METADATA"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RecordMetadata {

    /**
     * The record type based on dataset format details.
     * IMAGE_METADATA  - Collection of metadata related to image record.
     * TEXT_METADATA - Collection of metadata related to text record.
     * DOCUMENT_METADATA - Collection of metadata related to document record.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RecordType {
        ImageMetadata("IMAGE_METADATA"),
        TextMetadata("TEXT_METADATA"),
        DocumentMetadata("DOCUMENT_METADATA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RecordType> map;

        static {
            map = new java.util.HashMap<>();
            for (RecordType v : RecordType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RecordType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecordType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RecordType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
