package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomerMeasurument {
    Integer getId();
    String getName();
    boolean isActive();
}
