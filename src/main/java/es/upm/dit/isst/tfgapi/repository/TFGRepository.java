package es.upm.dit.isst.tfgapi.repository;

import es.upm.dit.isst.tfgapi.model.TFG;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TFGRepository extends JpaRepository<TFG, String> {
    // Puedes añadir métodos personalizados aquí si los necesitas
}
