package guru.springframework.msscbeerservice.services.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created by fabreu on 22/11/2021
 */
@Disabled // utility for manual testing
@SpringBootTest
public class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnHandInventory() {
        // Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);
        // System.out.println(qoh);
    }
}
