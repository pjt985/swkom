package at.fhtw.swen3.persistence.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Data
@Entity(name = "Recipient")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class RecipientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column
    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\/*-*\\d*\\/*[[:lower:]]*$")
    private String name;

    @Column
    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\s\\d+\\/*[[:alpha:]]*\\d*\\/*\\d*$")
    private String street;

    @Column
    @Pattern(regexp = "^A-\\d\\d\\d\\d$")
    private String postalCode;

    @Column
    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\/*-*\\d*\\/*[[:lower:]]*$")
    private String city;

    @Column
    @Pattern(regexp = "[ÖÄÜA-Z][[:lower:]]+$")
    private String country;
}
