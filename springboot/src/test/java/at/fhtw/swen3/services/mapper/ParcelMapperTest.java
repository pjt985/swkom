package at.fhtw.swen3.services.mapper;

import at.fhtw.swen3.OpenApiGeneratorApplication;
import at.fhtw.swen3.persistence.*;
import at.fhtw.swen3.persistence.entity.ParcelEntity;
import at.fhtw.swen3.persistence.entity.RecipientEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = OpenApiGeneratorApplication.class)
class ParcelMapperTest {

    @Test
    void testDTO2Entity() {
        Recipient recipient = new Recipient();
        recipient.setStreet("Hauptstraße 12/12/12");
        recipient.setCountry("Austria");
        recipient.setCity("Wien");
        recipient.setPostalCode("A-1100");
        recipient.setName("Wien");

        Recipient sender = new Recipient();
        sender.setStreet("Landstraße 27a");
        sender.setCountry("Austria");
        sender.setCity("Wien");
        sender.setPostalCode("A-1100");
        sender.setName("Wien");

        HopArrival visitedHopArrival = new HopArrival();
        visitedHopArrival.setCode("AAAA1");
        visitedHopArrival.setDescription("Warehouse 27-12)");

        HopArrival futureHopArrival = new HopArrival();
        futureHopArrival.setCode("BBBB2");
        futureHopArrival.setDescription("Warehouse 22-24)");

        Parcel parcel = new Parcel();
        parcel.setRecipient(recipient);
        parcel.setSender(sender);
        parcel.setWeight(12.0F);

        NewParcelInfo newParcelInfo = new NewParcelInfo();
        newParcelInfo.setTrackingId("123456789");

        LinkedList<HopArrival> visitedHopArrivals = new LinkedList<>();
        visitedHopArrivals.add(visitedHopArrival);
        LinkedList<HopArrival> futureHopArrivals = new LinkedList<>();
        futureHopArrivals.add(futureHopArrival);

        TrackingInformation trackingInformation = new TrackingInformation();
        trackingInformation.setState(TrackingInformation.StateEnum.PICKUP);
        trackingInformation.setFutureHops(futureHopArrivals);
        trackingInformation.setVisitedHops(visitedHopArrivals);

        ParcelEntity pe = ParcelMapper.INSTANCE.dtoToEntity(parcel, newParcelInfo, trackingInformation);
        assertEquals(parcel.getWeight(), pe.getWeight());
    }

    @Test
    void testValidationTrue() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        RecipientEntity recipient = new RecipientEntity();
        recipient.setStreet("Hauptstraße 12/12/12");
        recipient.setCountry("Austria");
        recipient.setCity("Wien");
        recipient.setPostalCode("A-1100");
        recipient.setName("Wien");

        Set<ConstraintViolation<RecipientEntity>> violations = validator.validate(recipient);
        assertTrue(violations.isEmpty());
    }

    @Test
    void testValidationFalse() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        RecipientEntity recipient = new RecipientEntity();
        recipient.setStreet("Hauptstraße 12/12/12");
        recipient.setCountry("Austria");
        recipient.setCity("Wien");
        recipient.setPostalCode("B-1100");
        recipient.setName("Wien");

        Set<ConstraintViolation<RecipientEntity>> violations = validator.validate(recipient);
        assertFalse(violations.isEmpty());
    }
}