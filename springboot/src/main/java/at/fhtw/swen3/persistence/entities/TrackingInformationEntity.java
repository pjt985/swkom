package at.fhtw.swen3.persistence.entities;

import at.fhtw.swen3.persistence.enums.StateEnum;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "TrackingInformation")
@Table(name = "TrackingInformation")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"visitedHops", "futureHops"})
@EqualsAndHashCode(exclude = {"visitedHops", "futureHops"})
@Data
public class TrackingInformationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    @Enumerated(EnumType.STRING)
    private StateEnum state;
    @Column
    @OneToMany(mappedBy = "visitedHop")
    private List<HopArrivalEntity> visitedHops = new ArrayList<>();
    @Column
    @OneToMany(mappedBy = "futureHop")
    private List<HopArrivalEntity> futureHops = new ArrayList<>();
}
