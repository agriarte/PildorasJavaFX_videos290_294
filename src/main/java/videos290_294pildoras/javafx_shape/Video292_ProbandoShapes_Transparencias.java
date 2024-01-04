package videos290_294pildoras.javafx_shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX ProbandoShapes_Video290
 * 
 * transparencias y degradados
 */
public class Video292_ProbandoShapes_Transparencias extends Application {

    @Override
    public void start(Stage stage) {

        Pane miPane = new Pane();

        Group miGrupoShapes = new Group();
        
        Rectangle r1 = new Rectangle(0,75, 350, 40);
        r1.setStroke(Color.BLACK);
        r1.setFill(Color.rgb(255, 0, 0, 1));
        r1.setStrokeWidth(3);
        
        Rectangle r2 = new Rectangle(50,5, 100, 200);
        r2.setStroke(Color.BLACK);
        //para crear colores con trasparencia el método estático rgb tiene un parámetro para canal alfa
        r2.setFill(Color.rgb(0, 255, 0, .5));
        r2.setStrokeWidth(3);
        
        Rectangle r3 = new Rectangle(200,5, 100, 200);
        r3.setStroke(Color.BLACK);
        r3.setFill(Color.rgb(0, 0, 255, .5));
        r3.setStrokeWidth(3);
        
        //Para hacer una figura con fondo degradado se crea un objeto degradado y se asigna como parámetro con el método setFill(miDegradado)
        //Los degradados son complejos por el gran número de parámetros. Donde empieza, donde acaba, color inicial, color final,...
        //Hay degradados lineales y radiales. Requiere muchos ensayos y consultar la API para probar todo lo que hay.
        
        
        //LinearGradient​(double startX, double startY, double endX, double endY, boolean proportional, CycleMethod cycleMethod, Stop... stops)
        //degrado diagonal de esquina a esquina opuesta
        LinearGradient grad0= new LinearGradient(0, 0, 1, 1, true, CycleMethod.REFLECT, new Stop(0, Color.ANTIQUEWHITE),new Stop(1, Color.DARKORCHID));
        //degradado de arriba a abajo
        LinearGradient grad1= new LinearGradient(0, 0, 0, 1, true, CycleMethod.REFLECT, new Stop(0, Color.CORAL),new Stop(1, Color.MEDIUMBLUE));
        
        //RadialGradient​(double focusAngle, double focusDistance, double centerX, double centerY, double radius, boolean proportional, CycleMethod cycleMethod, Stop... stops)
        RadialGradient grad2= new RadialGradient(0, 0, .5, .5, 1, true, CycleMethod.REPEAT, new Stop(0, Color.LIME),new Stop(1, Color.BLUE));
        
        
        Rectangle r4 = new Rectangle(400,5, 500, 580);
        r4.setStroke(Color.BLACK);
        r4.setFill(grad0);
        r4.setStrokeWidth(3);
        
        Rectangle r5 = new Rectangle(950,5, 300, 580);
        r5.setStroke(Color.BLACK);
        r5.setFill(grad1);
        r5.setStrokeWidth(3);
        
        Rectangle r6 = new Rectangle(1300,5, 300, 580);
        r6.setStroke(Color.BLACK);
        r6.setFill(grad2);
        r6.setStrokeWidth(3);
        
           
        miGrupoShapes.getChildren().addAll(r1, r2, r3, r4, r5, r6);
        
        miPane.getChildren().add(miGrupoShapes);

        Scene scene = new Scene(miPane, 1700, 600);

        stage.setScene(scene);
        stage.setTitle("Transparencias y degradados");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
