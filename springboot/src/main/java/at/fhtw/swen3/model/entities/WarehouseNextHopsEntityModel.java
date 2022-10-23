package at.fhtw.swen3.model.entities;

import at.fhtw.swen3.services.dto.Hop;
import lombok.*;

import javax.persistence.*;
@Entity(name = "WarehouseNextHops")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"hop", "warehouse"})
@EqualsAndHashCode(exclude = {"hop", "warehouse"})
public class WarehouseNextHopsEntityModel {
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
    private WarehouseEntityModel warehouse;
}
