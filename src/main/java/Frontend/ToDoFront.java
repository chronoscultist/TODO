package Frontend;


import Backend.User;

import Backend.ToDo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import static Backend.User.getUserName;

public class ToDoFront {



    public ToDoFront(){

    }

    public void createToDoFrontPage(){
        // Create the main stage.
        Stage mainStage = new Stage();
        mainStage.setTitle("ToDo");

        // Create the main grid pane.
        GridPane mainGridPane = new GridPane();
        mainGridPane.setPadding(new Insets(10, 10, 10, 10));
        mainGridPane.setVgap(8);
        mainGridPane.setHgap(10);
        mainGridPane.setAlignment(Pos.CENTER);

        // Create the necessary components for the main scene.
        Label welcomeLabel = new Label("Welcome, " + getUserName() + "!");
        Button addButton = new Button("Add ToDo");

        // Add the components to the main grid pane.
        mainGridPane.add(welcomeLabel, 0, 0);
        mainGridPane.add(addButton, 0, 1);

        // Create the main scene and add the main grid pane to it.
        Scene mainScene = new Scene(mainGridPane, 300, 200);

        // Set the main scene to the main stage and show the main stage.
        mainStage.setScene(mainScene);
        mainStage.show();
        addButton.setOnAction(e -> {
            // Create the add stage.
            Stage addStage = new Stage();
            addStage.setTitle("Add Task");

            // Create the add grid pane.
            GridPane addGridPane = new GridPane();
            addGridPane.setPadding(new Insets(10, 10, 10, 10));
            addGridPane.setVgap(8);
            addGridPane.setHgap(10);
            addGridPane.setAlignment(Pos.CENTER);

            // Create the necessary components for the add scene.
            Label titleLabel = new Label("Title:");
            //I want to add setOnAction here to add the title to the database
            TextField titleField = new TextField();

            TextField descriptionField = new TextField();

            TextField dateStartField = new TextField();

            TextField dateEndField = new TextField();

            TextField statusField = new TextField();

            TextField userCreatorField = new TextField();

            TextField createdAtField = new TextField();
            Button createTaskButton = new Button("Create Task");

            addGridPane.add(titleField , 1, 0);
            addGridPane.add(descriptionField, 1, 1);
            addGridPane.add(dateStartField, 1, 2);
            addGridPane.add(dateEndField, 1, 3);
            addGridPane.add(statusField, 1, 4);
            addGridPane.add(userCreatorField, 1, 5);
            addGridPane.add(createdAtField, 1, 6);
            addGridPane.add(createTaskButton, 1, 7);


            Label descriptionLabel = new Label("Description:");
            Label dateStartLabel = new Label("Date Start:");
            Label dateEndLabel = new Label("Date End:");
            Label statusLabel = new Label("Status:");
            Label userCreatorLabel = new Label("User Creator:");
            Label createdAtLabel = new Label("Created At:");

            // Add the components to the add grid pane.
            addGridPane.add(titleLabel, 0, 0);
            addGridPane.add(descriptionLabel, 0, 1);
            addGridPane.add(dateStartLabel, 0, 2);
            addGridPane.add(dateEndLabel, 0, 3);
            addGridPane.add(statusLabel, 0, 4);
            addGridPane.add(userCreatorLabel, 0, 5);
            addGridPane.add(createdAtLabel, 0, 6);

            // Create the add scene and add the add grid pane to it.
            Scene addScene = new Scene(addGridPane, 300, 400);

            // Set the add scene to the add stage and show the add stage.
            addStage.setScene(addScene);
            addStage.show();



            createTaskButton.setOnAction(e1 -> {
                // Create the creation task stage.
                Stage createTaskStage = new Stage();
                createTaskStage.setTitle("Create Task");

                System.out.println("Title: " + titleField.getText());
                System.out.println("Description: " + descriptionField.getText());
                System.out.println("Date Start: " + dateStartField.getText());
                System.out.println("Date End: " + dateEndField.getText());
                //System.out.println("Status: " + statusField.getText());
                System.out.println("User Creator: " + userCreatorField.getText());
                addStage.close();
                // create code to add the attributes to SQL database
                // create the code to access the database and export tasks to the main page

                ToDo toDo = new ToDo();
                toDo.setTitle(titleField.getText());
                toDo.setDescription(descriptionField.getText());
                //toDo.setDateStart(dateStartField.getText()); FIXA SÅ ATT man måste mata yyyy, mm, dd
                //toDo.setDateEnd(dateEndField.getText()); FIXA SÅ ATT MAN MÅSTE MATA yyyy, mm, dd SOM ÄR FÖRBI STARTDATUM
                //toDo.setStatus(statusField.getText()); FIXA CHECKBOX FÖR ATT VÄLJA STATUS (DONE, NOT DONE)
                toDo.setUserCreator(userCreatorField.getText());
                toDo.setCreatedAt();
            });
        });
    }
}




// Path: src\main\java\Frontend\Login.java
