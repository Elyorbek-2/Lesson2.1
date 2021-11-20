package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Currency;
import uz.pdp.kichikproekt.projection.CurrencyProjection;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean existsByName(String name);
}
