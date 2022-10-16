package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.persistence.HopArrival;
import at.fhtw.swen3.persistence.Recipient;
import at.fhtw.swen3.persistence.TrackingInformation;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

@Getter@Setter
public class ParcelEntity {

    // Parcel
    @PositiveOrZero
    private Float weight;
    @Valid
    private RecipientEntity recipient;
    @NotNull
    private RecipientEntity sender;

    // NewParcelInfo
    @Pattern(regexp = " ^[A-Z0-9]{9}$")
    private String trackingId;

    // TrackingInformation
    @NotBlank
    private String value;
    @NotNull
    private TrackingInformation.StateEnum state;

    @Valid
    private List<HopArrivalEntity> futureHops = new ArrayList<>();
    @Valid
    private List<HopArrivalEntity> visitedHops = new ArrayList<>();

}
