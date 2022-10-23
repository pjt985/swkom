package at.fhtw.swen3.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Truck")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TruckEntityModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String regionGeoJson;
    @Column
    private String numberPlate;
}
