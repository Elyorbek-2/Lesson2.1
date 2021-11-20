package uz.pdp.kichikproekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.kichikproekt.entity.Measurement;
import uz.pdp.kichikproekt.projection.CustomerMeasurument;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomerMeasurument.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
    boolean existsByName(String name);
}
