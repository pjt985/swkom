package at.fhtw.swen3.persistence.entities;

import lombok.*;

import javax.persistence.*;

@Table(name = "NewParcelInfo")
@Entity(name = "NewParcelInfo")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public class NewParcelInfoEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String trackingId;
}
