package com.mycompany.assignment2;

import com.mycompany.assignment2.shapes.ShearPane;
import com.mycompany.assignment2.shapes.PathPane;
import com.mycompany.assignment2.shapes.SVGShapePane;
import com.mycompany.assignment2.utils.BuildablePane;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 * 
 * @author Raiven Simbajon, Luca Furino, Tiba Hammoudi
 */
public class App extends Application {
    
    private static Scene scene;
    
    public static BuildablePane menuPane = new MenuPane();
    public static BuildablePane svgPane = new SVGShapePane();
    public static BuildablePane shearPane = new ShearPane();
    public static BuildablePane pathShapePane = new PathPane();
            
            
    @Override
    public void start(Stage primaryStage) {
        
        BuildablePane.constructAll(menuPane, svgPane, pathShapePane, shearPane);
        
        scene = new Scene((Parent) menuPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Shapes");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
    
    public static void setRoot(Parent parent){
        scene.setRoot(parent);
    }
    public static void main(String[] args) {
        launch();
    }

}