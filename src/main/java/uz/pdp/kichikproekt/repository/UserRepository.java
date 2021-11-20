package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Users;
import uz.pdp.kichikproekt.projection.UserProjection;

@RepositoryRestResource(path = "user",excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<Users,Integer> {
}
