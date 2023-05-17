package com.example.partie2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class exo6 extends Application {

    private Image image;
    private TextField proposition;
    private int vies;
    private String mot;
    private String reponse;



    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vb = new VBox();
        vb.setStyle("-fx-background-color: rgba(160,225,220,0.7);");

        //textfield
        this.proposition = new TextField("Entrez une lettre ");
        HBox lettre = new HBox(proposition);
        lettre.setAlignment(Pos.CENTER);

        //vies
        this.vies = 7;
        Label nbvie = new Label("Nombre de vie restantes : " + vies);
        HBox vie = new HBox(nbvie);
        vie.setAlignment(Pos.CENTER);


        //imagependu
        // Chargement de l'image
        this.image = new Image( exo6.class.getResource("pendu7.png").toString() );

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);

        //création hbox
        HBox img = new HBox(iv);
        img.setAlignment(Pos.CENTER);
        img.setPadding(new Insets(10));

        vb.getChildren().add(img);
        vb.getChildren().add(vie);

        Dico myDico = new Dico();

        //mot caché
        this.mot = myDico.getMot();
        this.reponse = "";

        for (int i=0; i<mot.length(); i++){
            reponse = reponse + "*";
        }
        Label repcachee = new Label(reponse);

        HBox motcaché = new HBox(repcachee);
        motcaché.setAlignment(Pos.CENTER);
        img.setPadding(new Insets(10));

        vb.getChildren().add(motcaché);
        vb.getChildren().add(lettre);

        // Ajout du conteneur à la scene
        Scene scene = new Scene(vb);

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 500 );
        primaryStage.setHeight( 700 );
        primaryStage.setTitle("Jeu du pendu");

        // Affichage de la fenêtre
        primaryStage.show();
    }
    private void entree(Image image, String mot, String reponse, int vies, TextField proposition){
        Dico dico = new Dico();
        ArrayList dico.getPositions(proposition.getCharacters().charAt(0), mot);

    }
}
