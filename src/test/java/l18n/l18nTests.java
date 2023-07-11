package l18n;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;


import static org.junit.jupiter.api.Assertions.*;

public class l18nTests {

    @Test
    void localTest() {
        // arrange
        String expected = "Welcome";
        LocalizationService localizationService = new LocalizationServiceImpl();

        // act
        String preference = localizationService.locale(Country.USA);

        // assert
        assertEquals(expected, preference);
    }
}

