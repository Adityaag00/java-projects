/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projjavafxvideoplayer;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javax.swing.JFileChooser;

/**
 *
 * @author Aditya
 */
public class ProjJAVAFxVideoPlayer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        String path= choose.getSelectedFile().getAbsolutePath();
        //String str = new File("D:\\Videos\\Intros\\transition.mp4").getAbsolutePath();
        Media med= new Media((new File(path)).toURI().toString());
        MediaPlayer mp = new MediaPlayer(med);
        mp.play();
        MediaView mv=new MediaView(mp);
        
        StackPane root = new StackPane();
        root.getChildren().add(mv);
        
        Scene scene = new Scene(root, 800, 750);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
