package at.fhtw.swen3.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Transferhouse")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TransferhouseEntityModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String regionGeoJson;
    @Column
    private String logisticsPartner;
    @Column
    private String logisticsPartnerUrl;

}
