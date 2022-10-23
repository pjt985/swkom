package at.fhtw.swen3.model.entities;

import at.fhtw.swen3.model.StateEnumForEntity;
import at.fhtw.swen3.services.dto.HopArrival;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "TrackingInformation")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"visitedHops", "futureHops"})
@EqualsAndHashCode(exclude = {"visitedHops", "futureHops"})
public class TrackingInformationEntityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    @Enumerated(EnumType.STRING)
    private StateEnumForEntity state;
    @Column
    @OneToMany(mappedBy = "visitedHop")
    private List<HopArrivalEntityModel> visitedHops = new ArrayList<>();
    @Column
    @OneToMany(mappedBy = "futureHop")
    private List<HopArrivalEntityModel> futureHops = new ArrayList<>();
}
