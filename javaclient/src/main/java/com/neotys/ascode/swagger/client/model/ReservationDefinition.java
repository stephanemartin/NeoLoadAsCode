package com.neotys.ascode.swagger.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-13T10:37:42.246Z[GMT]")
public class ReservationDefinition {
    @SerializedName("id")
    private String id = null;

    /**
     * Status of the reservation.
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        WAITING("WAITING"),
        RUNNING("RUNNING"),
        PARTIALLY_RESERVED("PARTIALLY_RESERVED"),
        FAILED_TO_RESERVE("FAILED_TO_RESERVE"),
        RESERVED("RESERVED"),
        STOPPING("STOPPING"),
        ENDED("ENDED");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StatusEnum.fromValue(String.valueOf(value));
            }
        }
    }  @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("startDateTime")
    private BigDecimal startDateTime = null;

    @SerializedName("endDateTime")
    private BigDecimal endDateTime = null;

    @SerializedName("reservationWebVUs")
    private BigDecimal reservationWebVUs = null;

    @SerializedName("reservationSAPVUs")
    private BigDecimal reservationSAPVUs = null;

    @SerializedName("reservationCitrixVUs")
    private BigDecimal reservationCitrixVUs = null;

    @SerializedName("controllerZoneId")
    private String controllerZoneId = null;

    @SerializedName("neoloadVersion")
    private String neoloadVersion = null;

    @SerializedName("lgZonesResourcesReservation")
    private List<LgByZones> lgZonesResourcesReservation = null;

    @SerializedName("author")
    private String author = null;

    @SerializedName("owner")
    private ReservationOwner owner = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    /**
     * How the reservation has been created. By a user or automatically when a test started.
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        SCHEDULED("SCHEDULED"),
        AUTO_RESERVATION("AUTO_RESERVATION");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(String.valueOf(value));
            }
        }
    }  @SerializedName("type")
    private TypeEnum type = null;

    public ReservationDefinition id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the reservation.
     * @return id
     **/
    @Schema(example = "115c25af-f499-423f-a71e-63312601919e", description = "Unique identifier of the reservation.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReservationDefinition status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Status of the reservation.
     * @return status
     **/
    @Schema(description = "Status of the reservation.")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ReservationDefinition startDateTime(BigDecimal startDateTime) {
        this.startDateTime = startDateTime;
        return this;
    }

    /**
     * Timestamp when the reservation begins. Number of seconds since January 1, 1970.
     * @return startDateTime
     **/
    @Schema(description = "Timestamp when the reservation begins. Number of seconds since January 1, 1970.")
    public BigDecimal getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(BigDecimal startDateTime) {
        this.startDateTime = startDateTime;
    }

    public ReservationDefinition endDateTime(BigDecimal endDateTime) {
        this.endDateTime = endDateTime;
        return this;
    }

    /**
     * Timestamp when the reservation ends. Number of seconds since January 1, 1970.
     * @return endDateTime
     **/
    @Schema(description = "Timestamp when the reservation ends. Number of seconds since January 1, 1970.")
    public BigDecimal getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(BigDecimal endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ReservationDefinition reservationWebVUs(BigDecimal reservationWebVUs) {
        this.reservationWebVUs = reservationWebVUs;
        return this;
    }

    /**
     * The number of Web Virtual Users to be reserved.
     * @return reservationWebVUs
     **/
    @Schema(description = "The number of Web Virtual Users to be reserved.")
    public BigDecimal getReservationWebVUs() {
        return reservationWebVUs;
    }

    public void setReservationWebVUs(BigDecimal reservationWebVUs) {
        this.reservationWebVUs = reservationWebVUs;
    }

    public ReservationDefinition reservationSAPVUs(BigDecimal reservationSAPVUs) {
        this.reservationSAPVUs = reservationSAPVUs;
        return this;
    }

    /**
     * The number of SAP Virtual Users to be reserved.
     * @return reservationSAPVUs
     **/
    @Schema(description = "The number of SAP Virtual Users to be reserved.")
    public BigDecimal getReservationSAPVUs() {
        return reservationSAPVUs;
    }

    public void setReservationSAPVUs(BigDecimal reservationSAPVUs) {
        this.reservationSAPVUs = reservationSAPVUs;
    }

    public ReservationDefinition reservationCitrixVUs(BigDecimal reservationCitrixVUs) {
        this.reservationCitrixVUs = reservationCitrixVUs;
        return this;
    }

    /**
     * The number of Citrix Virtual Users to be reserved.
     * @return reservationCitrixVUs
     **/
    @Schema(description = "The number of Citrix Virtual Users to be reserved.")
    public BigDecimal getReservationCitrixVUs() {
        return reservationCitrixVUs;
    }

    public void setReservationCitrixVUs(BigDecimal reservationCitrixVUs) {
        this.reservationCitrixVUs = reservationCitrixVUs;
    }

    public ReservationDefinition controllerZoneId(String controllerZoneId) {
        this.controllerZoneId = controllerZoneId;
        return this;
    }

    /**
     * Name of the zone.
     * @return controllerZoneId
     **/
    @Schema(example = "hIugt", description = "Name of the zone.")
    public String getControllerZoneId() {
        return controllerZoneId;
    }

    public void setControllerZoneId(String controllerZoneId) {
        this.controllerZoneId = controllerZoneId;
    }

    public ReservationDefinition neoloadVersion(String neoloadVersion) {
        this.neoloadVersion = neoloadVersion;
        return this;
    }

    /**
     * Neoload version of the selected controller.
     * @return neoloadVersion
     **/
    @Schema(example = "7.0.2-20191110-1", description = "Neoload version of the selected controller.")
    public String getNeoloadVersion() {
        return neoloadVersion;
    }

    public void setNeoloadVersion(String neoloadVersion) {
        this.neoloadVersion = neoloadVersion;
    }

    public ReservationDefinition lgZonesResourcesReservation(List<LgByZones> lgZonesResourcesReservation) {
        this.lgZonesResourcesReservation = lgZonesResourcesReservation;
        return this;
    }

    public ReservationDefinition addLgZonesResourcesReservationItem(LgByZones lgZonesResourcesReservationItem) {
        if (this.lgZonesResourcesReservation == null) {
            this.lgZonesResourcesReservation = new ArrayList<LgByZones>();
        }
        this.lgZonesResourcesReservation.add(lgZonesResourcesReservationItem);
        return this;
    }

    /**
     * Get lgZonesResourcesReservation
     * @return lgZonesResourcesReservation
     **/
    @Schema(description = "")
    public List<LgByZones> getLgZonesResourcesReservation() {
        return lgZonesResourcesReservation;
    }

    public void setLgZonesResourcesReservation(List<LgByZones> lgZonesResourcesReservation) {
        this.lgZonesResourcesReservation = lgZonesResourcesReservation;
    }

    public ReservationDefinition author(String author) {
        this.author = author;
        return this;
    }

    /**
     * Name of the user who created the reservation.
     * @return author
     **/
    @Schema(description = "Name of the user who created the reservation.")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ReservationDefinition owner(ReservationOwner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     **/
    @Schema(description = "")
    public ReservationOwner getOwner() {
        return owner;
    }

    public void setOwner(ReservationOwner owner) {
        this.owner = owner;
    }

    public ReservationDefinition name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Title of the reservation.
     * @return name
     **/
    @Schema(description = "Title of the reservation.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReservationDefinition description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the reservation.
     * @return description
     **/
    @Schema(description = "Description of the reservation.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReservationDefinition type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * How the reservation has been created. By a user or automatically when a test started.
     * @return type
     **/
    @Schema(description = "How the reservation has been created. By a user or automatically when a test started.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReservationDefinition reservationDefinition = (ReservationDefinition) o;
        return Objects.equals(this.id, reservationDefinition.id) &&
                Objects.equals(this.status, reservationDefinition.status) &&
                Objects.equals(this.startDateTime, reservationDefinition.startDateTime) &&
                Objects.equals(this.endDateTime, reservationDefinition.endDateTime) &&
                Objects.equals(this.reservationWebVUs, reservationDefinition.reservationWebVUs) &&
                Objects.equals(this.reservationSAPVUs, reservationDefinition.reservationSAPVUs) &&
                Objects.equals(this.reservationCitrixVUs, reservationDefinition.reservationCitrixVUs) &&
                Objects.equals(this.controllerZoneId, reservationDefinition.controllerZoneId) &&
                Objects.equals(this.neoloadVersion, reservationDefinition.neoloadVersion) &&
                Objects.equals(this.lgZonesResourcesReservation, reservationDefinition.lgZonesResourcesReservation) &&
                Objects.equals(this.author, reservationDefinition.author) &&
                Objects.equals(this.owner, reservationDefinition.owner) &&
                Objects.equals(this.name, reservationDefinition.name) &&
                Objects.equals(this.description, reservationDefinition.description) &&
                Objects.equals(this.type, reservationDefinition.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, startDateTime, endDateTime, reservationWebVUs, reservationSAPVUs, reservationCitrixVUs, controllerZoneId, neoloadVersion, lgZonesResourcesReservation, author, owner, name, description, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReservationDefinition {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
        sb.append("    endDateTime: ").append(toIndentedString(endDateTime)).append("\n");
        sb.append("    reservationWebVUs: ").append(toIndentedString(reservationWebVUs)).append("\n");
        sb.append("    reservationSAPVUs: ").append(toIndentedString(reservationSAPVUs)).append("\n");
        sb.append("    reservationCitrixVUs: ").append(toIndentedString(reservationCitrixVUs)).append("\n");
        sb.append("    controllerZoneId: ").append(toIndentedString(controllerZoneId)).append("\n");
        sb.append("    neoloadVersion: ").append(toIndentedString(neoloadVersion)).append("\n");
        sb.append("    lgZonesResourcesReservation: ").append(toIndentedString(lgZonesResourcesReservation)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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