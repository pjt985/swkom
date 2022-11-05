package at.fhtw.swen3.persistence.entities;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;

@Entity(name = "HopArrival")
@Table(name = "HopArrival")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"visitedHop", "futureHop"})
@EqualsAndHashCode(exclude = {"visitedHop", "futureHop"})
@Data
public class HopArrivalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @Pattern(regexp = "^[A-Z]{4}\\d{1,4}$")
    private String code;

    @Column
    @Pattern(regexp = "^[ÖÄÜA-Z][[:lower:]]+\\s\\d*-*\\d*$")
    private String description;

    @Column
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTime;

    @Column
    @ManyToOne
    @JoinColumn(name = "TrackingInformation_id", nullable = false, updatable = false)
    private TrackingInformationEntity visitedHop;

    @Column
    @ManyToOne
    @JoinColumn(name = "TrackingInformation_id", nullable = false, updatable = false)
    private TrackingInformationEntity futureHop;

}
