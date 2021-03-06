package com.neotys.ascode.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

@Schema(description = "Representation of a percentile.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T10:37:42.246Z[GMT]")
public class PercentilesPoints {
    @SerializedName("percent")
    private Float percent = null;

    @SerializedName("duration")
    private Float duration = null;

    public PercentilesPoints percent(Float percent) {
        this.percent = percent;
        return this;
    }

    /**
     * The k-th percentile where  0.0 &lt; k &lt;&#x3D; 100.0.
     * @return percent
     **/
    @Schema(description = "The k-th percentile where  0.0 < k <= 100.0.")
    public Float getPercent() {
        return percent;
    }

    public void setPercent(Float percent) {
        this.percent = percent;
    }

    public PercentilesPoints duration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Value (duration in milliseconds) of this k-th percentiles.
     * @return duration
     **/
    @Schema(description = "Value (duration in milliseconds) of this k-th percentiles.")
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PercentilesPoints percentilesPoints = (PercentilesPoints) o;
        return Objects.equals(this.percent, percentilesPoints.percent) &&
                Objects.equals(this.duration, percentilesPoints.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percent, duration);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PercentilesPoints {\n");

        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}