package guru.springframework.msscbeerservice.services.inventory;

import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
public interface BeerInventoryService {

    Integer getOnHandInventory(UUID beerId);

}
