package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.persistence.HopArrival;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.OffsetDateTime;

public class HopArrivalEntity {
    @Pattern(regexp = "^[A-Z]{4}\\d{1,4}$")
    private String code;

    @Pattern(regexp = "^[ÖÄÜA-Z][[:lower:]]+\\s\\d*-*\\d*$")
    private String description;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateTime;

}
