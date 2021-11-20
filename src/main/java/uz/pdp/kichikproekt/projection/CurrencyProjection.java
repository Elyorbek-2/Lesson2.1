package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyProjection {
    Integer getId();
    String getName();
    boolean isActive();
}
