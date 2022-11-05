package at.fhtw.swen3.persistence.entities;

import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Warehouse")
@Table(name = "Warehouse")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"nextHops"})
@EqualsAndHashCode(exclude = {"nextHops"})
@Data
public class WarehouseEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private Integer level;
    @Column
    @OneToMany(mappedBy = "warehouse")
    private List<WarehouseNextHopsEntity> nextHops = new ArrayList<>();
}
