/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Possible related resource entity type
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@lombok.extern.slf4j.Slf4j
public enum RelatedResourceEntityType {
    Autonomousdatabase("AUTONOMOUSDATABASE"),
    Database("DATABASE"),
    Pluggabledatabase("PLUGGABLEDATABASE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private final String value;
    private static java.util.Map<String, RelatedResourceEntityType> map;

    static {
        map = new java.util.HashMap<>();
        for (RelatedResourceEntityType v : RelatedResourceEntityType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    RelatedResourceEntityType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static RelatedResourceEntityType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'RelatedResourceEntityType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}