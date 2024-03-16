import static org.junit.Assert.*;

import code.Car;
import code.RentSystem;
import code.Van;
import org.junit.*;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class testClass {
    private RentSystem rentSystem;

    @Before
    public void setUp() {
        rentSystem = new RentSystem();
    }

    @Test
    public void testAddCar() {
        // Simulate user input for adding a car
        String input = "car\n2022\nToyota\nCamry\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        // Call the add method, which will now read from the simulated input stream
        rentSystem.add(scanner);

        Car[] cars = rentSystem.cars; // Assuming getCars() returns the array of cars in RentSystem
        assertNotNull(cars);
        assertTrue(cars.length > 0);
        assertNotNull(cars[0]); // Assuming the first element is the newly added car
    }


    @Test
    public void testAddVan() {
        // Simulate user input for adding a van
        String input = "van\n2022\nFord\nTransit\n12/03/2024\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Scanner scanner = new Scanner(System.in);

        // Call the add method, which will now read from the simulated input stream
        rentSystem.add(scanner);

        // Assert that a van is added successfully
        Van[] vans = rentSystem.vans; // Directly accessing the vans array field
        assertNotNull(vans);
        assertTrue(vans.length > 0);
        assertNotNull(vans[0]); // Assuming the first element is the newly added van
    }


}
