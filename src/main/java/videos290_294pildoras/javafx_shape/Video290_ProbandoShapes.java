package videos290_294pildoras.javafx_shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


/**
 * JavaFX Video290_ProbandoShapes
 */
public class Video290_ProbandoShapes extends Application {

    @Override
    public void start(Stage stage) {
         //Lineas (x,y,x,y)
         //Line miLinia = new Line(300, 300, 400 , 100);
         Line miLinia = new Line(0, 240, 640 , 240);
         miLinia.setStroke(Color.CHARTREUSE);
        
        Pane miPane = new Pane();
        miPane.getChildren().add(miLinia);
        
        Group miGrupoLineas = new Group();
        
        for (int i = 0; i <= 700; i+=100) {
            Line linea1 = new Line (i,0,i,650);
            linea1.setStroke(Color.ORANGE);
            
            Line linea2 = new Line (0,i,650,i);
            linea2.setStroke(Color.BLUE);
            
            miGrupoLineas.getChildren().addAll(linea1,linea2);
        }
        
        miPane.getChildren().add(miGrupoLineas);
      
        Scene scene = new Scene(miPane, 640, 480);
        scene.setFill(Color.BLACK); // Color de fondo

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}