package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Client;
import uz.pdp.kichikproekt.projection.ClientProjection;

@RepositoryRestResource(path = "client",excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
    boolean existsByPhoneNumber(String phoneNumber);
}
