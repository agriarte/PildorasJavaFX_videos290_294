package videos290_294pildoras.javafx_shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * JavaFX ProbandoShapes_Video290
 */
public class Video294_ProbandoShapes_Efectos extends Application {
    
    @Override
    public void start(Stage stage) {
        
        Pane miPane = new Pane();
        
        Group miGrupoShapes = new Group();

        //******** DROP SHADOW
        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(5.0);
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.color(0.4, 0.5, 0.5));
        
        Text text = new Text();
        //método que aplica el efecto "setEffect"
        text.setEffect(dropShadow);
        text.setCache(true);
        text.setX(10.0);
        text.setY(70.0);
        text.setFill(Color.web("0x3b596d"));
        text.setText("JavaFX drop shadow...");
        text.setFont(Font.font(null, FontWeight.BOLD, 40));
        
        DropShadow dropShadow2 = new DropShadow();
        dropShadow2.setOffsetX(6.0);
        dropShadow2.setOffsetY(4.0);
        
        Circle circle = new Circle();
        //método que aplica el efecto "setEffect"
        circle.setEffect(dropShadow2);
        circle.setCenterX(50.0);
        circle.setCenterY(125.0);
        circle.setRadius(30.0);
        circle.setFill(Color.STEELBLUE);
        circle.setCache(true);

        //******** REFLECTION
        Reflection reflection = new Reflection();
        reflection.setFraction(0.7);
        
        Text text2 = new Text();
        text2.setX(10.0);
        text2.setY(230.0);
        text2.setCache(true);
        text2.setText("Reflections on JavaFX...");
        text2.setFill(Color.web("0x3b596d"));
        text2.setFont(Font.font(null, FontWeight.BOLD, 40));
        text2.setEffect(reflection);

        //******** INNERSHADOW
        InnerShadow innerShadow = new InnerShadow();
        innerShadow.setOffsetX(4);
        innerShadow.setOffsetY(4);
        innerShadow.setColor(Color.web("0x3b596d"));
        
        Text text3 = new Text();
        text3.setEffect(innerShadow);
        text3.setX(20);
        text3.setY(350);
        text3.setText("InnerShadow");
        text3.setFill(Color.ALICEBLUE);
        text3.setFont(Font.font(null, FontWeight.BOLD, 50));

        //******** PERSPECTIVE TRANSFORM
        PerspectiveTransform perspectiveTrasform = new PerspectiveTransform();
        perspectiveTrasform.setUlx(10.0);
        perspectiveTrasform.setUly(10.0);
        perspectiveTrasform.setUrx(310.0);
        perspectiveTrasform.setUry(40.0);
        perspectiveTrasform.setLrx(310.0);
        perspectiveTrasform.setLry(60.0);
        perspectiveTrasform.setLlx(10.0);
        perspectiveTrasform.setLly(90.0);
        
        Group g = new Group();
        g.setEffect(perspectiveTrasform);
        g.setCache(true);
        
        Rectangle rect = new Rectangle();
        rect.setX(10.0);
        rect.setY(10.0);
        rect.setWidth(280.0);
        rect.setHeight(80.0);
        rect.setFill(Color.web("0x3b596d"));
        
        Text text4 = new Text();
        text4.setX(20.0);
        text4.setY(65.0);
        text4.setText("Perspective");
        text4.setFill(Color.ALICEBLUE);
        text4.setFont(Font.font(null, FontWeight.BOLD, 36));
        
        g.getChildren().addAll(rect, text4);

        // Mover el grupo a las coordenadas (10, 350)
        g.setLayoutX(10);
        g.setLayoutY(350);

        //******** INNERSHADOW de Pildoras
        Rectangle rect2 = new Rectangle(370, 350, 100, 100);
        rect2.setFill(Color.GRAY);
        rect2.setStroke(Color.BLACK);
        rect2.setStrokeWidth(2);
        //aplica un ligero sombreado sobre figuras
        InnerShadow sombraInterior = new InnerShadow();
        rect2.setEffect(sombraInterior);
        
        //******** DROPSHADOW de Pildoras
        Rectangle rect3 = new Rectangle(520, 350, 100, 100);
        rect3.setFill(Color.GRAY);
        rect3.setStroke(Color.BLACK);
        rect3.setStrokeWidth(2);
        //aplica un ligero sombreado sobre figuras
        DropShadow sombraInterior2 = new DropShadow();
        sombraInterior2.setOffsetX(10);
        sombraInterior2.setOffsetY(10);
        rect3.setEffect(sombraInterior2);
        
        //
        miGrupoShapes.getChildren().addAll(circle, text, text2, text3, g, rect2, rect3);
        miPane.getChildren().add(miGrupoShapes);
        
        Scene scene = new Scene(miPane, 640, 480);
        
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch();
    }
    
}
