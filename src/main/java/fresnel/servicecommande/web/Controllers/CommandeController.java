package fresnel.servicecommande.web.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import fresnel.servicecommande.DAO.CommandeDao;
import fresnel.servicecommande.Models.Commande;
import fresnel.servicecommande.web.Exceptions.CommandeNotFoundException;
import fresnel.servicecommande.web.Exceptions.ImpossibleAjouterCommandeException;

@RestController
public class CommandeController {

    @Autowired
    CommandeDao commandesDao;

    @GetMapping (value = "/")
    public String Hello() {
        return "Hello world";
    }

    @PostMapping (value = "/commandes")
    public ResponseEntity <Commande> ajouterCommande(@RequestBody Commande commande){

        Commande nouvelleCommande = commandesDao.save(commande);

        if(nouvelleCommande == null) throw new ImpossibleAjouterCommandeException("Impossible d'ajouter cette commande");

        return new ResponseEntity<Commande>(commande, HttpStatus.CREATED);
    }

    @GetMapping(value = "/cmd")
    public List<Commande> recupererToutesCommande() {

        return commandesDao.findAll();
    }

}
