package at.fhtw.swen3.persistence.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Truck")
@Table(name = "Truck")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class TruckEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String regionGeoJson;
    @Column
    private String numberPlate;
}
