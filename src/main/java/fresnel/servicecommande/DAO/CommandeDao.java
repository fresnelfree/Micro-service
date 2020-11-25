package fresnel.servicecommande.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fresnel.servicecommande.Models.Commande;

@Repository
public interface CommandeDao extends JpaRepository <Commande, Integer> {
  
}