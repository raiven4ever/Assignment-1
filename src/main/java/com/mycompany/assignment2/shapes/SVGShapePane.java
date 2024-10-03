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
import javafx.scene.shape.SVGPath;

/**
 *
 * @author Luca Furino
 */
public class SVGShapePane extends ShapePane {

    public SVGShapePane() {
    }

    @Override
    public List<Node> makeShape() {
        List<Node> list = new ArrayList<>();
        
        SVGPath sVGPath = new SVGPath();
        sVGPath.setContent("M 0,0 H 150 C 150, 0, 50, 65, 150, 150 H 0 C 0, 150, -100, 75, 0, 0 Z");
        sVGPath.setFill(Color.TRANSPARENT);
        sVGPath.setStroke(Color.BLACK);
        sVGPath.setStrokeWidth(2);
        
        list.add(sVGPath);
        
        return list;
    }

    @Override
    public String getCode() {
        return "        SVGPath sVGPath = new SVGPath();\n" +
"        sVGPath.setContent(\"M 0,0 H 150 C 150, 0, 50, 65, 150, 150 H 0 C 0, 150, -100, 75, 0, 0 Z\");\n" +
"        sVGPath.setFill(Color.TRANSPARENT);\n" +
"        sVGPath.setStroke(Color.BLACK);\n" +
"        sVGPath.setStrokeWidth(2);";
    }

}
