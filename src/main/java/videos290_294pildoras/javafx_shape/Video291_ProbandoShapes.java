package videos290_294pildoras.javafx_shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX ProbandoShapes_Video290
 */
public class Video291_ProbandoShapes extends Application {

    @Override
    public void start(Stage stage) {

        Pane miPane = new Pane();

        Group miGrupoShapes = new Group();
        
        //crear cuadrícula tipo libreta
        for (int i = 0; i <= 700; i+=10) {
            Line linea1 = new Line (i,0,i,650);
            linea1.setStroke(Color.LIGHTGREY);
            
            Line linea2 = new Line (0,i,650,i);
            linea2.setStroke(Color.LIGHTGREY);
            
            miGrupoShapes.getChildren().addAll(linea1,linea2);
        }

        // Figuras de tipo rectángulo
        Rectangle rectangulo01 = new Rectangle();
        rectangulo01.setX(50);
        rectangulo01.setY(50);
        rectangulo01.setWidth(160);
        rectangulo01.setHeight(100);
        rectangulo01.setArcWidth(20);// ancho esquinas en arco
        rectangulo01.setArcHeight(20);// alto esquinas en arco
        rectangulo01.setStroke(Color.CADETBLUE);

        Rectangle rectangulo02 = new Rectangle(250, 50, 160, 100);
        rectangulo02.setFill(Color.CADETBLUE); // color de relleno
        rectangulo02.setStrokeWidth(3);// ancho del trazo
        rectangulo02.setStroke(Color.GREENYELLOW); // color del trazo

        Rectangle rectangulo03 = new Rectangle(450, 50, 160, 100);
        rectangulo03.setFill(Color.LIGHTSEAGREEN); // color de relleno
        rectangulo03.setStrokeWidth(8);// ancho del trazo
        rectangulo03.setArcWidth(20);// ancho esquinas en arco
        rectangulo03.setArcHeight(120);// alto esquinas en arco
        rectangulo03.setStroke(Color.ROYALBLUE); // color del trazo

        // Figuras de tipo círculo
        Circle circulo01 = new Circle();
        circulo01.setCenterX(100.0f);
        circulo01.setCenterY(250.0f);
        circulo01.setRadius(50.0f);
        circulo01.setStroke(Color.MEDIUMSPRINGGREEN);

        // Figuras de tipo arco
        Arc arco01 = new Arc();
        arco01.setCenterX(200.0f);
        arco01.setCenterY(250.0f);
        arco01.setRadiusX(25.0f);
        arco01.setRadiusY(25.0f);
        arco01.setStartAngle(45.0f);
        arco01.setLength(270.0f);
        arco01.setType(ArcType.ROUND);
        arco01.setStroke(Color.YELLOW);

        Arc arco02 = new Arc();
        arco02.setCenterX(300.0f);
        arco02.setCenterY(250.0f);
        arco02.setRadiusX(25.0f);
        arco02.setRadiusY(25.0f);
        arco02.setStartAngle(45.0f);
        arco02.setLength(270.0f);
        arco02.setType(ArcType.CHORD);
        arco02.setStroke(Color.GREEN);

        Arc arco03 = new Arc();
        arco03.setCenterX(400.0f);
        arco03.setCenterY(250.0f);
        arco03.setRadiusX(25.0f);
        arco03.setRadiusY(25.0f);
        arco03.setStartAngle(45.0f);
        arco03.setLength(270.0f);
        arco03.setType(ArcType.OPEN);
        arco03.setStroke(Color.RED);

        // Figuras de tipo elipse
        Ellipse elipse01 = new Ellipse();
        elipse01.setCenterX(500.0f);
        elipse01.setCenterY(250.0f);
        elipse01.setRadiusX(50.0f);
        elipse01.setRadiusY(25.0f);
        elipse01.setStroke(Color.ORANGE);

        miGrupoShapes.getChildren().addAll(rectangulo01, rectangulo02, rectangulo03, circulo01, arco01, arco02, arco03, elipse01);

        miPane.getChildren().add(miGrupoShapes);

        Scene scene = new Scene(miPane, 640, 480);
        scene.setFill(Color.BLACK); // Color de fondo

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
