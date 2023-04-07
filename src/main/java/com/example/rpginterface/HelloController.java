package com.example.rpginterface;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;


public class HelloController {

    @FXML
    private Text Titre1;
    private List<String> textes = new ArrayList<>();
    private int indexTextDebut = 0;
    private AnchorPane parentPane;
    private VBox Introduction;

    public HelloController() {
        // Ajoutez ici tous les textes que l'utilisateur va défiler
        textes.add("Bienvenue dans mon RPG !");
        textes.add("Tu vas à présent plonger dans l'univers d'Harry Potter");
        textes.add("J'espère que le jeu te plaira et que tu réussiras à accomplir tous les défis");
        textes.add("Cette fois-ci, c'est vraiment le commencement, let's go !");
    }

    @FXML
    protected void onContinuezClick() {
        if (indexTextDebut < textes.size()) {
            String texteCourant = textes.get(indexTextDebut);
            Titre1.setText(texteCourant);
            indexTextDebut++;
        } else {
            parentPane.getChildren().remove(Introduction);
        }
    }
}