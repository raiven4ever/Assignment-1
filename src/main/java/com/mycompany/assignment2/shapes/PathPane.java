/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2.shapes;

import com.mycompany.assignment2.utils.ShapePane;
import java.util.ArrayList;
import java.util.List;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.ClosePath;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.VLineTo;

/**
 *
 * @author Raiven Simbajon
 */
public class PathPane extends ShapePane {

    public PathPane() {
    }

    @Override
    public String getCode() {
        return "        double multiplier = 1.5;\n" +
"        \n" +
"        Path path = new Path(\n" +
"                new MoveTo(),\n" +
"                new HLineTo(100*multiplier),\n" +
"                new VLineTo(50*multiplier),\n" +
"                new ArcTo(25*multiplier, 10*multiplier, 180, 50*multiplier, 50*multiplier, true, false),\n" +
"                new ArcTo(25*multiplier, 10*multiplier, 180, 0*multiplier, 50*multiplier, true, true),\n" +
"                new ClosePath()\n" +
"        );\n" +
"        \n" +
"        path.setStroke(Color.BLACK);\n" +
"        path.setStrokeWidth(2);";
    }

    @Override
    public List<Node> makeShape() {
        List<Node> list = new ArrayList<>();
        double multiplier = 1.5;
        
        Path path = new Path(
                new MoveTo(),
                new HLineTo(100*multiplier),
                new VLineTo(50*multiplier),
                new ArcTo(25*multiplier, 10*multiplier, 180, 50*multiplier, 50*multiplier, true, false),
                new ArcTo(25*multiplier, 10*multiplier, 180, 0*multiplier, 50*multiplier, true, true),
                new ClosePath()
        );
        
        path.setStroke(Color.BLACK);
        path.setStrokeWidth(2);
        
        list.add(path);
        return list;
    }
    
}
