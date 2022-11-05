package at.fhtw.swen3.persistence.entities;


import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity(name = "Hop")
@Table(name = "Hop")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString(exclude = {"locationCoordinates"})
@EqualsAndHashCode(exclude = {"locationCoordinates"})
@Data
public class HopEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String hopType;
    @Column
    private String code;
    @Column
    private String description;
    @Column
    private Integer processingDelayMins;
    @Column
    private String locationName;

    @Column
    @Type(type="org.springframework.data.geo.Point")
    private Point locationCoordinates;

    /*
    @Column
    @OneToOne
    @JoinColumn(name="fk_locationCoordinates")
    private GeoCoordinateEntity locationCoordinates;*/
}
