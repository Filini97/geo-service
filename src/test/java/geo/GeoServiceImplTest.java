package geo;

import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class GeoServiceImplTest {

    private final String RUSSIA_IP = "172.25.46.58";
    private final String USA_IP = "96.25.46.58";

    @Test
    void moscowIpTest() {
        // arrange
        Location expected = new Location("Moscow", Country.RUSSIA, "Spiridonovka", 17);
        GeoService geoService = new GeoServiceImpl();

        // act
        Location preference = geoService.byIp(RUSSIA_IP);

        // assert
        assertEquals(expected.getCountry(), preference.getCountry());
    }

    @Test
    void newYorkIpTest() {
        // arrange
        Location expected = new Location("Arkham", Country.USA, null, 6);
        GeoService geoService = new GeoServiceImpl();

        // act
        Location preference = geoService.byIp(USA_IP);

        // assert
        assertEquals(expected.getCountry(), preference.getCountry());
    }
}