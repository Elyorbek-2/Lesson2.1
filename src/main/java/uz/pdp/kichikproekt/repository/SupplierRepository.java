package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Supplier;
import uz.pdp.kichikproekt.projection.SupplierProjection;

@RepositoryRestResource(path = "supplier",excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier,Integer> {
    boolean existsByName(String name);
}
