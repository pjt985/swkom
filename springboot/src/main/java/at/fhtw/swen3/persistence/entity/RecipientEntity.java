package at.fhtw.swen3.persistence.entity;

import javax.validation.constraints.Pattern;

public class RecipientEntity {

    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\/*-*\\d*\\/*[[:lower:]]*$")
    private String name;

    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\s\\d+\\/*[[:alpha:]]*\\d*\\/*\\d*$")
    private String street;

    @Pattern(regexp = "^A-\\d\\d\\d\\d$")
    private String postalCode;

    @Pattern(regexp = "^[[:upper:]][[:lower:]]*ß*[[:lower:]]*\\/*-*\\d*\\/*[[:lower:]]*$")
    private String city;

    @Pattern(regexp = "[ÖÄÜA-Z][[:lower:]]+$")
    private String country;
}
