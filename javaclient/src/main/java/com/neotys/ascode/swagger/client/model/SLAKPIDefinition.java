/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.swagger.client.model;

import java.util.Objects;
import io.swagger.v3.oas.annotations.media.Schema;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * KPI
 */
@JsonAdapter(SLAKPIDefinition.Adapter.class)
public enum SLAKPIDefinition {
  AVERAGE_REQUEST_RESPONSE_TIME("AVERAGE_REQUEST_RESPONSE_TIME"),
  AVERAGE_PAGE_RESPONSE_TIME("AVERAGE_PAGE_RESPONSE_TIME"),
  AVERAGE_CONTAINER_RESPONSE_TIME("AVERAGE_CONTAINER_RESPONSE_TIME"),
  PERCENTILE_CONTAINER_RESPONSE_TIME("PERCENTILE_CONTAINER_RESPONSE_TIME"),
  AVERAGE_HITS_PER_SECOND("AVERAGE_HITS_PER_SECOND"),
  AVERAGE_THROUGHPUT_PER_SECOND("AVERAGE_THROUGHPUT_PER_SECOND"),
  TOTAL_ERRORS("TOTAL_ERRORS"),
  TOTAL_HITS("TOTAL_HITS"),
  TOTAL_THROUGHPUT("TOTAL_THROUGHPUT"),
  AVERAGE_RESPONSE_TIME("AVERAGE_RESPONSE_TIME"),
  ERRORS_PER_SECOND("ERRORS_PER_SECOND"),
  ERROR_PERCENTILE("ERROR_PERCENTILE");

  private String value;

  SLAKPIDefinition(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SLAKPIDefinition fromValue(String text) {
    for (SLAKPIDefinition b : SLAKPIDefinition.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<SLAKPIDefinition> {
    @Override
    public void write(final JsonWriter jsonWriter, final SLAKPIDefinition enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SLAKPIDefinition read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SLAKPIDefinition.fromValue(String.valueOf(value));
    }
  }
}
