package uz.pdp.kichikproekt.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.kichikproekt.entity.Users;
import uz.pdp.kichikproekt.entity.Warehouse;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import java.util.Set;

@Projection(types = Users.class)
public interface UserProjection {
    Integer getId();

    String getFirstName();

    String getLastName();

    String getPhoneNumber();


    Integer getCode();

    String getPassword();

    boolean isActive();
}
