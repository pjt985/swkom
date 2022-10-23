package at.fhtw.swen3.model.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Error")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ErrorEntityModel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String errorMessage;

}
