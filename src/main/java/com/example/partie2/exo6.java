package com.example.partie2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class exo6 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vb = new VBox();
        vb.setStyle("-fx-background-color: rgba(160,225,220,0.7);");

        //textfield
        TextField proposition = new TextField("Entrez une lettre ");

        //vies
        int vies = 7;
        Label nbvie = new Label("Nombre de vie restantes : " + vies);


        //imagependu
        // Chargement de l'image
        Image image = new Image( exo6.class.getResource("pendu7.png").toString() );

        // Création d'un composant avec l'image peinte à l'intérieur
        ImageView iv = new ImageView();
        iv.setImage(image);

        //création hbox
        HBox img = new HBox(iv);

        vb.getChildren().add(img);


        // Ajout du conteneur à la scene
        Scene scene = new Scene(vb );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Jeu du pendu");

        // Affichage de la fenêtre
        primaryStage.show();
    }
}
