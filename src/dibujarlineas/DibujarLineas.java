/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package dibujarlineas;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author RICHARD VEGA
 */
public class DibujarLineas extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        
        Scene scene = new Scene(root, 300, 250, Color.LIGHTGRAY);
        Line l1 = new Line(80,20,120,20);
        l1.setStroke(Color.RED);
        Line l2 = new Line(120,20,100,40);
        l2.setStroke(Color.RED);
        Line l3 = new Line(80,20,60,40);
        l3.setStroke(Color.RED);
        Line l4 = new Line(60,40,100,40);
        l4.setStroke(Color.RED);
        Line l5 = new Line(80,20,80,60);
        l5.setStroke(Color.RED);
        Line l6 = new Line(80,20,80,60);
        l6.setStroke(Color.RED);
        Line l7 = new Line(60,40,60,80);
        l7.setStroke(Color.RED);
        Line l8 = new Line(120,20,120,60);
        l8.setStroke(Color.RED);
        Line l9 = new Line(100,40,100,80);
        l9.setStroke(Color.RED);
        Line l10 = new Line(80,60,120,60);
        l10.setStroke(Color.RED);
        Line l11 = new Line(60,80,100,80);
        l11.setStroke(Color.RED);
        Line l12 = new Line(60,80,80,60);
        l12.setStroke(Color.RED);
        Line l13 = new Line(120,60,100,80);
        l13.setStroke(Color.RED);

        root.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13);

        primaryStage.setTitle("Lineas");
        primaryStage.setScene(scene);
        primaryStage.show();
	// esto es una prueba

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
