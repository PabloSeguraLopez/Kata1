package software.eii.ulpgc.psl.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehicle honda = new Vehicle(LocalDate.of(2020, 1, 1), "Honda", "3416HV");
        System.out.println(honda);

    }
}
