package at.fhtw.swen3.persistence.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.ToString;


@ToString
public enum StateEnum {
    PICKUP("Pickup"),
    INTRANSPORT("InTransport"),
    INTRUCKDELIVERY("InTruckDelivery"),
    TRANSFERRED("Transferred"),
    DELIVERED("Delivered");

    private String value;

    StateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static StateEnum fromValue(String value) {
        for (StateEnum state : StateEnum.values()) {
            if (state.value.equals(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("unexpected value --> " + value );
    }
}