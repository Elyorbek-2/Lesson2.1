package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierProjection {
    Integer getId();
    String getName();
    boolean isActive();
//    String phoneNumber();
}
