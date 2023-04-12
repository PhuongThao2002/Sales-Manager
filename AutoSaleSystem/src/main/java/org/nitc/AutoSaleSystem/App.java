package org.nitc.AutoSaleSystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
    	stage.setTitle("AUTO SALES SYSTEM");
//    	InputStream iconStream = getClass().getResourceAsStream("../anh/iconn.png");
//    	Image image = new Image(iconStream);
//        stage.getIcons().add(image);
        
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
    	stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}