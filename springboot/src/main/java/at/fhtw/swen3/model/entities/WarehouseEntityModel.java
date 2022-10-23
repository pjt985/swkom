package at.fhtw.swen3.model.entities;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Warehouse")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"nextHops"})
@EqualsAndHashCode(exclude = {"nextHops"})
public class WarehouseEntityModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private Integer level;
    @Column
    @OneToMany(mappedBy = "warehouse")
    private List<WarehouseNextHopsEntityModel> nextHops = new ArrayList<>();
}
