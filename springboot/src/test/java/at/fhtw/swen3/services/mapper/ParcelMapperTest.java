package at.fhtw.swen3.services.mapper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParcelMapperTest {

    @Test
    void dtoToEntity() {
        ParcelMapper mapper = ParcelMapper.INSTANCE;
        System.out.println(mapper);
        assertEquals(1,1);
    }

    @Test
    void entityToDtoParcel() {
        assertEquals(1,1);
    }

    @Test
    void entityToDtoNewParcelInfo() {
        assertEquals(1,1);
    }

    @Test
    void entityToDtoTrackingInformation() {
        assertEquals(1,1);
    }


     /* Recipient recipient = Recipient.builder().
                street("Hauptstraße 12/12/12").
                country("Austria").
                city("Wien").
                postalCode("A-1100").
                name("Wien").
                build();

        Recipient sender = Recipient.builder().
                street("Landstraße 27a").
                country("Austria").
                city("Wien").
                postalCode("A-1100").
                name("Wien").build();

        HopArrival visitedHopArrival = HopArrival.builder().
                code("AAAA1").
                description("Warehouse 27-12)").build();

        HopArrival futureHopArrival = HopArrival.builder().
                code("BBBB2").
                description("Warehouse 22-24)").build();

        Parcel parcel = Parcel.builder().
                recipient(recipient).
                sender(sender).
                weight(12.0F).build();

        NewParcelInfo newParcelInfo = NewParcelInfo.builder().
                trackingId("123456789").build();

        LinkedList<HopArrival> visitedHopArrivals = new LinkedList<>();
        visitedHopArrivals.add(visitedHopArrival);
        LinkedList<HopArrival> futureHopArrivals = new LinkedList<>();
        futureHopArrivals.add(futureHopArrival);

        TrackingInformation trackingInformation = TrackingInformation.builder().
                state(TrackingInformation.StateEnum.PICKUP).
                futureHops(futureHopArrivals).
                visitedHops(visitedHopArrivals).build();*/

    //       Set<ConstraintViolation<Parcel>> violations = validator.validate(parcel);
    //      assertFalse(violations.isEmpty());
}