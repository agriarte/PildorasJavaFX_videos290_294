package videos290_294pildoras.javafx_shape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 * JavaFX ProbandoShapes_Video290
 *
 * transparencias y degradados
 */
public class Video293_ProbandoShapes_Text extends Application {

    @Override
    public void start(Stage stage) {

        Pane miPane = new Pane();

        Group miGrupoShapes = new Group();

        //instancia de texto x,y,"texto"
        Text miTxt1 = new Text(100, 50, "First row\nSecond row");
        miTxt1.setFont(new Font(20));

        //instancia de texto constructor vacío
        Text miTxt2 = new Text();
        miTxt2.setX(100);
        miTxt2.setY(150);
        miTxt2.setFont(new Font(20));
        miTxt2.setWrappingWidth(300);
        miTxt2.setFill(Color.BLUE);
        miTxt2.setTextAlignment(TextAlignment.JUSTIFY);
        miTxt2.setText("The quick brown fox jumps over the lazy dog");

        //texto con Colores
        Text miTxt3 = new Text(100, 350, "Hola mundo");
        miTxt3.setFont(new Font("Times New Roman", 200));
        miTxt3.setStroke(Color.BLUE);
        miTxt3.setStrokeWidth(3);
        miTxt3.setFill(Color.LIME);

        //texto con degradado
        //degradado de arriba a abajo
        LinearGradient grad1 = new LinearGradient(0, 0, 0, 1, true, CycleMethod.REFLECT, new Stop(0, Color.CORAL), new Stop(1, Color.MEDIUMBLUE));
        //texto
        Text miTxt4 = new Text(100, 550, "Hola mundo");
        miTxt4.setFont(new Font("Times New Roman", 200));
        miTxt4.setStroke(Color.BLUE);
        miTxt4.setStrokeWidth(3);
        miTxt4.setFill(grad1);
        miGrupoShapes.getChildren().addAll(miTxt1, miTxt2, miTxt3, miTxt4);

        miPane.getChildren().add(miGrupoShapes);

        Scene scene = new Scene(miPane, 1200, 600);

        stage.setScene(scene);
        stage.setTitle("Textos");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
