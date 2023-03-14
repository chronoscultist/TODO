package Frontend;

import Backend.User;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Login extends Application {






        public static void main(String[] args) {
                launch(args);
        }
        @Override
        public void start(Stage primaryStage) {
                primaryStage.setTitle("Login");

                // Create the username and password labels and fields.
                Label usernameLabel = new Label("Username:");
                TextField usernameField = new TextField();
                Label passwordLabel = new Label("Password:");
                PasswordField passwordField = new PasswordField();

                // Create the login button.
                Button loginButton = new Button("Login");

                // Create the grid pane and add the username and password fields.
                GridPane gridPane = new GridPane();
                gridPane.setPadding(new Insets(10, 10, 10, 10));
                gridPane.setVgap(8);
                gridPane.setHgap(10);
                gridPane.setAlignment(Pos.CENTER);
                gridPane.add(usernameLabel, 0, 1);
                gridPane.add(usernameField, 1, 1);
                gridPane.add(passwordLabel, 0, 2);
                gridPane.add(passwordField, 1, 2);
                gridPane.add(loginButton, 1, 3);

                // Create the scene and add the grid pane to the scene.
                Scene scene = new Scene(gridPane, 300, 200);

                // Set the scene to the stage and show the stage.
                primaryStage.setScene(scene);
                primaryStage.show();

                // Create the login button action event. //I want to enter to work as well instead of clicking the button


                loginButton.setOnAction(click -> {




                        // Check if the username and password are correct.
                        if (usernameField.getText().equals("admin") && passwordField.getText().equals("admin")) {

                                String username = usernameField.getText();
                                String password = usernameField.getText();

                                User.setPassword(password);
                                User.setUserName(username);


                                // Close the login stage.
                                primaryStage.close();


                                // Create the ToDoFront stage.
                                ToDoFront toDoFront = new ToDoFront();
                                toDoFront.createToDoFrontPage();
                        }
                        else {
                                // Create error message if wrong username or password. centered above the text fields
                                Label errorMessage = new Label("Wrong username or password!");
                                gridPane.add(errorMessage, 1, 0);

                        }
                });
        }
}