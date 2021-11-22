package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.services.inventory.BeerInventoryService;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by fabreu on 22/11/2021
 */
public abstract class BeerMapperDecorator implements BeerMapper {

    private BeerInventoryService beerInventoryService;

    @Autowired
    @Qualifier("delegate")
    private BeerMapper delegate;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        BeerDto dto = delegate.beerToBeerDto(beer);
        dto.setQuantityOnHand(beerInventoryService.getOnHandInventory(beer.getId()));
        return dto;
    }

    @Override
    public Beer beerDtoToBeer(BeerDto beerDto) {
        return delegate.beerDtoToBeer(beerDto);
    }
}