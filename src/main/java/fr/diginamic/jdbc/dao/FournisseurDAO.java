package fr.diginamic.jdbc.dao;

import java.sql.SQLException;
import java.util.List;


public interface FournisseurDAO {
    List<Four> extraire() throws SQLException;
    void insert(Fournisseur fournisseur);
    int update(String ancienNom , String nouveauNom);
    boolean delete(Fournisseur fournisseur);


}