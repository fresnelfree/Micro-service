package fresnel.servicecommande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.stereotype.Service;

import fresnel.servicecommande.Models.Commande;


@Service
public class Start implements CommandLineRunner {
  
    @Autowired
    private RepositoryRestConfiguration config;

    @Override
    public void run(String... args) throws Exception {   
        config.exposeIdsFor(Commande.class);
        System.out.println("Sercice commande démaré avec succes !");
/*         for (Arbitre ab : rep.findAll()) {
            System.out.println(ab.toString());
        } */
    }
}
