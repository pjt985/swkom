package at.fhtw.swen3.configuration;

import at.fhtw.swen3.services.dto.*;
import at.fhtw.swen3.services.entityservices.*;
import at.fhtw.swen3.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ErrorService errorService(){
        return new ErrorServiceImpl();
    }

    @Bean
    public HopArrivalService hopArrivalService(){
        return new HopArrivalServiceImpl();
    }

    @Bean
    public HopService hopService(){
        return new HopServiceImpl();
    }

    @Bean
    public NewParcelInfoService newParcelInfoService(){
        return new NewParcelInfoServiceImpl();
    }

    @Bean
    public ParcelService parcelService() {
        return new ParcelServiceImpl();
    }

    @Bean
    public RecipientService recipientService(){
        return new RecipientServiceImpl();
    }

    @Bean
    public TrackingInformationService trackingInformationService(){
        return new TrackingInformationServiceImpl();
    }

    @Bean
    public TransferwarehouseService transferwarehouseService(){
        return new TransferwarehouseServiceImpl();
    }

    @Bean
    public TruckService truckService(){
        return new TruckServiceImpl();
    }

    @Bean
    public WarehouseNextHopsService warehouseNextHopsService(){
        return new WarehouseNextHopsServiceImpl();
    }

    @Bean
    public WarehouseService warehouseService(){
        return new WarehouseServiceImpl();
    }
}
