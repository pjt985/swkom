package at.fhtw.swen3.model.entities;


import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.data.geo.Point;

import javax.persistence.*;

@Entity(name = "Hop")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"locationCoordinates"})
@EqualsAndHashCode(exclude = {"locationCoordinates"})
public class HopEntityModel {
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


    public double x(){
        return this.locationCoordinates.getX();
    }
    public double y(){
        return this.locationCoordinates.getY();
    }
    /*
    @Column
    @OneToOne
    @JoinColumn(name="fk_locationCoordinates")
    private GeoCoordinateEntityModel locationCoordinates;*/
}
