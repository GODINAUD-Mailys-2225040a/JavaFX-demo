package com.example.partie1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class exo1 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Création du conteneur principal
        BorderPane borderpane = new BorderPane();

        // Création du conteneur correspondant à la ligne de contrôle haut dessus du tableau
        ToolBar topControls = new ToolBar();

        Menu menu1 = new Menu("File");
        Menu menu2 = new Menu("Edit");
        Menu menu3 = new Menu("Help");

        MenuItem menu1new = new MenuItem("New");
        MenuItem menu1open = new MenuItem("Open");
        MenuItem menu1save = new MenuItem("Save");
        MenuItem menu1close = new MenuItem("Close");

        MenuItem menu2cut = new MenuItem("Cut");
        MenuItem menu2copy = new MenuItem("Copy");
        MenuItem menu2paste = new MenuItem("Paste");

        menu1.getItems().add(menu1new);
        menu1.getItems().add(menu1open);
        menu1.getItems().add(menu1save);
        menu1.getItems().add(menu1close);

        menu2.getItems().add(menu2cut);
        menu2.getItems().add(menu2copy);
        menu2.getItems().add(menu2paste);



        MenuBar menubar = new MenuBar(menu1, menu2, menu3);

        borderpane.setTop(menubar);

        //Créations boutons à gauche
        Label label1 = new Label("  Boutons :");
        Button btn1 = new Button("Bouton 1");
        Button btn2 = new Button("Bouton 2");
        Button btn3 = new Button("Bouton 3");

        VBox vbox1 = new VBox(label1, btn1, btn2, btn3);
        vbox1.setAlignment(Pos.CENTER_LEFT);
        borderpane.setMargin(vbox1, new Insets(10, 10, 10,10));

        //création du séparateur
        Separator separator = new Separator(Orientation.VERTICAL);
        HBox hbox1 = new HBox(vbox1, separator);
        borderpane.setLeft(hbox1);

        //Création du milieu
        Label name = new Label("Name:");
        Label email = new Label("Email:");
        Label password = new Label("Password:");
        Button sub = new Button("Submit");
        Button can = new Button("Cancel");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        HBox hb1 = new HBox(name, tf1);
        HBox hb2 = new HBox(email, tf2);
        HBox hb3 = new HBox(password, tf3);
        HBox hb4 = new HBox(sub, can);
        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);
        hb4.setAlignment(Pos.CENTER);
        VBox vbox2 = new VBox(hb1, hb2, hb3, hb4);
        vbox2.setAlignment(Pos.CENTER);
        borderpane.setCenter(vbox2);

        //Création bas de page
        Label label2 = new Label("Ceci est un label de bas de page");
        Separator sep2 = new Separator(Orientation.HORIZONTAL);

        VBox vbox3 = new VBox(sep2, label2);
        vbox3.setAlignment(Pos.CENTER);
        borderpane.setBottom(vbox3);



        // Ajout du conteneur à la scene
        Scene scene = new Scene(borderpane );

        // Ajout de la scene à la fenêtre et changement de ses paramètres (dimensions et titre)
        primaryStage.setScene( scene );
        primaryStage.setWidth( 800 );
        primaryStage.setHeight( 600 );
        primaryStage.setTitle("Premier exemple manipulant les conteneurs");

        // Création du bandeau en bas de la fenêtre
        HBox bottomControls = new HBox();
        bottomControls.setAlignment(Pos.BOTTOM_CENTER );
        Button btnClose = new Button("Ceci est un label de bas de page");
        bottomControls.getChildren().add( btnClose );

        // Affichage de la fenêtre
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

