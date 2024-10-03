/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

import com.mycompany.assignment2.utils.BuildablePane;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author raive
 */
public class MenuPane extends Pane implements BuildablePane {
    
    private static final double BUTTON_WIDTH = 500;
    private static final double BUTTON_HEIGHT = 40;
    
    @Override
    public void build() {
        setPrefSize(600, 400);
        
        HBox buttonBox = new HBox(40);
        buttonBox.setPrefSize(400, 400);
        buttonBox.setAlignment(Pos.CENTER);
        
        Button svgButton = new Button("View SVG Shape");
        Button pathShapeButton = new Button("View Path Shape");
        Button shearTransformButton = new Button("View Shear Transform");
        
        svgButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        svgButton.setOnAction((t) -> {
            App.setRoot((Parent) App.svgPane);
        });
                
        pathShapeButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        pathShapeButton.setOnAction((t) -> {
            App.setRoot((Parent) App.pathShapePane);
        });
        
        shearTransformButton.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        shearTransformButton.setOnAction((t) -> {
            App.setRoot((Parent) App.shearPane);
        });
        
        buttonBox.getChildren().addAll(svgButton, pathShapeButton, shearTransformButton);

        buttonBox.setLayoutX((getPrefWidth() - buttonBox.getPrefWidth()) / 2);
        buttonBox.setLayoutY((getPrefHeight() - buttonBox.getPrefHeight()) / 2);

        getChildren().add(buttonBox);
    }
    
}
