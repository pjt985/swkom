package at.fhtw.swen3.persistence.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Transferhouse")
@Table(name = "Transferhouse")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class TransferhouseEntity {
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
