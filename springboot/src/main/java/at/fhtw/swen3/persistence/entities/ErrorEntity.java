package at.fhtw.swen3.persistence.entities;

import lombok.*;

import javax.persistence.*;

@Entity(name = "Error")
@Table(name = "Error")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
@Builder
public class ErrorEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long id;
    @Column
    private String errorMessage;

}
