package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Client;

@Projection(types = Client.class)
public interface ClientProjection {
    Integer getId();
    String getName();
    String getPhoneNumber();
}
