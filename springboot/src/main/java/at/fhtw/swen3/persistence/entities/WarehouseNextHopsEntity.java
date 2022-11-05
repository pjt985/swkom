package at.fhtw.swen3.persistence.entities;

import at.fhtw.swen3.services.dto.Hop;
import lombok.*;

import javax.persistence.*;
@Entity(name = "WarehouseNextHops")
@Table(name = "WarehouseNextHops")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"hop", "warehouse"})
@EqualsAndHashCode(exclude = {"hop", "warehouse"})
@Data
public class WarehouseNextHopsEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private Integer traveltimeMins;
    @Column
    @OneToOne
    @JoinColumn(name="fk_hop")
    private Hop hop;
    @Column
    @ManyToOne
    @JoinColumn(name = "Warehouse_id", nullable = false, updatable = false)
    private WarehouseEntity warehouse;
}
