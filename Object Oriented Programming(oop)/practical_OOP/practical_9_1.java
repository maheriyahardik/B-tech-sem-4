 
 
// EXPERIMENT NO : 9 
// Title :- To Understand concept JavaFX and UI controls 
 
// AIM : Write a program that displays an image in a label, a 
// title in a label, and text in the text area as follows: 
// package App;

// import javafx.application.Application;
// import javafx.scene.Scene;
// import javafx.scene.image.Image;
// import javafx.scene.image.ImageView;
// import javafx.scene.layout.StackPane;
// import javafx.scene.control.Label;
// import javafx.stage.Stage;

// public class practical_9_1 extends Application {

//     @Override
//     public void start(Stage primaryStage) {

//         StackPane root = new StackPane();

//         // Directly load image using file path
//         Image img = new Image("file:D:/Manali/PicsArt_11-15-08.19.32.jpg");
//         ImageView imgview = new ImageView(img);

//         Label L = new Label("Vrajesh Patel", imgview);

//         Scene scene = new Scene(root, 350, 350);

//         root.getChildren().add(L);

//         primaryStage.setTitle("Label Demo");
//         primaryStage.setScene(scene);
//         primaryStage.show();
//     }

//     public static void main(String[] args) {
//         launch(args);
//     }
// }