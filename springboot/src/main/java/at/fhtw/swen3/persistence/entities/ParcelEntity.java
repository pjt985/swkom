package at.fhtw.swen3.persistence.entities;

import at.fhtw.swen3.services.dto.TrackingInformation;
import lombok.*;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Parcel")
@Table(name = "Parcel")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"recipient", "sender"})
@EqualsAndHashCode(exclude = {"recipient", "sender"})
@Data
public class ParcelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    // Parcel
    @Column
    @PositiveOrZero
    private Float weight;

    @Column
    @OneToOne
    @JoinColumn(name="fk_recipient")
    private RecipientEntity recipient;

    @OneToOne
    @Column
    @JoinColumn(name="fk_sender")
    private RecipientEntity sender;

    // NewParcelInfo
    @Column
    @Pattern(regexp = " ^[A-Z0-9]{9}$")
    private String trackingId;

    // TrackingInformation
    @Column
    @NotBlank
    private String value;
    @Column
    @NotNull
    private TrackingInformation.StateEnum state;

    @Column
    @Valid
    @OneToMany
    private List<HopArrivalEntity> futureHops = new ArrayList<>();

    @Column
    @Valid
    @OneToMany
    private List<HopArrivalEntity> visitedHops = new ArrayList<>();

}
