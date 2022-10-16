package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.persistence.HopArrival;
import at.fhtw.swen3.persistence.Recipient;
import at.fhtw.swen3.persistence.TrackingInformation;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class ParcelEntity {

    // Parcel
    @NotNull
    private Float weight;
    @NotNull
    private Recipient recipient;
    @NotNull
    private Recipient sender;

    // NewParcelInfo
    @NotBlank
    private String trackingId;

    // TrackingInformation
    @NotBlank
    private String value;
    @NotNull
    private TrackingInformation.StateEnum state;

    @NotNull
    private List<HopArrival> futureHops = new ArrayList<>();
    @NotNull
    private List<HopArrival> visitedHops = new ArrayList<>();

}
