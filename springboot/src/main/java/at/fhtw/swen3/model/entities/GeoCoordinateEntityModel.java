package at.fhtw.swen3.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "GeoCoordinate")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GeoCoordinateEntityModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private Double lat;
    @Column
    private Double lon;
}
