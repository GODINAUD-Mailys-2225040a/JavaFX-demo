package com.example.partie2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class exo4 extends Application {

    private Label titre;
    private int compteurvert;
    private int compteurrouge;
    private int compteurbleu;

    private Pane centre;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane borderpane = new BorderPane();

        //toplabel
        this.titre = new Label("");
        HBox hb = new HBox(titre);
        hb.setAlignment(Pos.CENTER);
        borderpane.setTop(hb);

        //centre
        this.centre = new Pane();


        borderpane.setCenter(centre);

        //boutonsbas
        Button vert = new Button("Vert");
        Button rouge = new Button("Rouge");
        Button bleu = new Button("Bleu");
        HBox hboutons = new HBox(vert, rouge, bleu);
        hboutons.setAlignment(Pos.CENTER);
        hboutons.setSpacing(10);
        hboutons.setPadding(new Insets(10));

        borderpane.setBottom(hboutons);

        // clic boutons
        vert.addEventHandler(MouseEvent.MOUSE_CLICKED,actionEvent -> couleur(actionEvent, "vert"));
        rouge.addEventHandler(MouseEvent.MOUSE_CLICKED,actionEvent -> couleur(actionEvent, "rouge"));
        bleu.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> couleur(actionEvent, "bleu"));

        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderpane );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 400 );
        primaryStage.setHeight( 200 );

        // Affichage de la fenêtre
        primaryStage.show();
    }

    //clic sur couleur
    private void couleur(Event event, String choix){
        if (choix == "vert"){
            ++compteurvert;
            titre.setText("Vert choisi " + compteurvert + " fois");
            centre.setStyle("-fx-background-color: #117e47;");
        } else if (choix == "rouge") {
            ++compteurrouge;
            titre.setText("Rouge choisi " + compteurrouge + " fois");
            centre.setStyle("-fx-background-color: #930303;");
        } else if (choix == "bleu") {
            ++compteurbleu;
            titre.setText("Bleu choisi " + compteurbleu + " fois");
            centre.setStyle("-fx-background-color: #0ec4c4;");
        }

    }
}
