/*
 * NeoLoad API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.neotys.ascode.api.v2.client.model;

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
  AVG_REQUEST_RESP_TIME("avg-request-resp-time"),
  AVG_PAGE_RESP_TIME("avg-page-resp-time"),
  AVG_TRANSACTION_RESP_TIME("avg-transaction-resp-time"),
  PERC_TRANSACTION_RESP_TIME("perc-transaction-resp-time"),
  AVG_REQUEST_PER_SEC("avg-request-per-sec"),
  AVG_THROUGHPUT_PER_SEC("avg-throughput-per-sec"),
  ERRORS_COUNT("errors-count"),
  COUNT("count"),
  THROUGHPUT("throughput"),
  AVG_RESP_TIME("avg-resp-time"),
  ERRORS_PER_SEC("errors-per-sec"),
  ERROR_RATE("error-rate");

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
