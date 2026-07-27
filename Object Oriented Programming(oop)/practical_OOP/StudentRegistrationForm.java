import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentRegistrationForm extends Application {

    @Override
    public void start(Stage stage) {

        // Labels
        Label title = new Label("Student Registration Form");
        Label nameLabel = new Label("Name:");
        Label emailLabel = new Label("Email:");
        Label genderLabel = new Label("Gender:");
        Label courseLabel = new Label("Course:");
        Label addressLabel = new Label("Address:");

        // Text Fields
        TextField nameField = new TextField();
        TextField emailField = new TextField();

        // Gender Radio Buttons
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup genderGroup = new ToggleGroup();
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);

        // Course ComboBox
        ComboBox<String> courseBox = new ComboBox<>();
        courseBox.getItems().addAll("BCA", "BBA", "B.Tech", "MCA");
        courseBox.setPromptText("Select Course");

        // Address TextArea
        TextArea addressArea = new TextArea();

        // Submit Button
        Button submitBtn = new Button("Register");

        // Output Label
        Label output = new Label();

        // Button Action
        submitBtn.setOnAction(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String gender = "";

            if (male.isSelected()) gender = "Male";
            else if (female.isSelected()) gender = "Female";

            String course = courseBox.getValue();
            String address = addressArea.getText();

            output.setText("Registered Successfully!\n"
                    + "Name: " + name + "\n"
                    + "Email: " + email + "\n"
                    + "Gender: " + gender + "\n"
                    + "Course: " + course + "\n"
                    + "Address: " + address);
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Adding elements
        grid.add(title, 0, 0, 2, 1);
        grid.add(nameLabel, 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(emailLabel, 0, 2);
        grid.add(emailField, 1, 2);

        grid.add(genderLabel, 0, 3);
        grid.add(male, 1, 3);
        grid.add(female, 2, 3);

        grid.add(courseLabel, 0, 4);
        grid.add(courseBox, 1, 4);

        grid.add(addressLabel, 0, 5);
        grid.add(addressArea, 1, 5);

        grid.add(submitBtn, 1, 6);
        grid.add(output, 1, 7);

        // Scene
        Scene scene = new Scene(grid, 400, 450);

        stage.setTitle("Student Registration");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}