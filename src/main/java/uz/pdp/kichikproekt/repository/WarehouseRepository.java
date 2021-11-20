package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Warehouse;
import uz.pdp.kichikproekt.projection.WarehouseProjection;

@RepositoryRestResource(path = "warehose",excerptProjection = WarehouseProjection.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
}
