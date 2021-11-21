package guru.springframework.msscbeerservice.repositories;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by fabreu on 21/11/2021
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
