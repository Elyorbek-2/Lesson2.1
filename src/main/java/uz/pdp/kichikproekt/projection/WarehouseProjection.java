package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Warehouse;

@Projection(types = Warehouse.class)
public interface WarehouseProjection {
    Integer getId();
    String getName();
    boolean isActive();
}
