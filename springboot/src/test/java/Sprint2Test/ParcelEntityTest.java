package Sprint2Test;


import at.fhtw.swen3.persistence.*;
import at.fhtw.swen3.services.mapper.*;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.Validation;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest
public class ParcelEntityTest {

    private final Validator validator = (Validator) Validation.buildDefaultValidatorFactory().getValidator();

    private Recipient recipient;

    private Recipient sender;

    private HopArrival visitedHopArrival;
    private HopArrival futureHopArrival;

    private Parcel parcel;

    private NewParcelInfo newParcelInfo;

    private LinkedList<HopArrival> visitedHopArrivals;
    private LinkedList<HopArrival> futureHopArrivals;
    private TrackingInformation trackingInformation;
    private ParcelMapper mapper;
    @BeforeTest
    void setUp(){
        recipient = Recipient.builder().
                street("Hauptstraße 12/12/12").
                country("Austria").
                city("Wien").
                postalCode("A-1100").
                name("Wien").
                build();

        sender = Recipient.builder().
                street("Landstraße 27a").
                country("Austria").
                city("Wien").
                postalCode("A-1100").
                name("Wien").build();

        visitedHopArrival = HopArrival.builder().
                code("AAAA1").
                description("Warehouse 27-12)").build();

        futureHopArrival = HopArrival.builder().
                code("BBBB2").
                description("Warehouse 22-24)").build();

        parcel = Parcel.builder().
                recipient(recipient).
                sender(sender).
                weight(12.0F).build();

        newParcelInfo = NewParcelInfo.builder().
                trackingId("123456789").build();

        visitedHopArrivals = new LinkedList<>();
        visitedHopArrivals.add(visitedHopArrival);
        futureHopArrivals = new LinkedList<>();
        futureHopArrivals.add(futureHopArrival);

        trackingInformation = TrackingInformation.builder().
                state(TrackingInformation.StateEnum.PICKUP).
                futureHops(futureHopArrivals).
                visitedHops(visitedHopArrivals).build();

        mapper = Mappers.getMapper(ParcelMapper.class);
    }

    @Test
    void mapperTest() {
        ParcelEntity pe = mapper.from(parcel, newParcelInfo, trackingInformation);
        assertEquals(pe.getWeight(), parcel.getWeight());
        assertEquals(pe.getVisitedHops().size(), trackingInformation.getVisitedHops().size());
    }

    @Test
    void validationTest(){
        Set<ConstraintViolation<Parcel>> violations = validator.validate(parcel);
        assertFalse(violations.isEmpty());
    }
}