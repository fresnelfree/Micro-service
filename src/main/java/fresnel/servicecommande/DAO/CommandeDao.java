package fresnel.servicecommande.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import fresnel.servicecommande.Models.Commande;

@Repository
@RepositoryRestResource
public interface CommandeDao extends JpaRepository <Commande, Integer> {
  
}