package software.eii.ulpgc.psl.kata1;

import java.time.LocalDate;

public class Vehicle {
    private final LocalDate soldDate;
    private final String brand;
    private final String id;

    public Vehicle(LocalDate soldDate, String brand, String id) {
        this.soldDate = soldDate;
        this.brand = brand;
        this.id = id;
    }
}
