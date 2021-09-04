import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
public class Accueil extends Application
{private Scene scene;
  private Pane layout;
  private String nom;
  private Label label;
  private Button jouerLocal;
  private Button jouerMulti;
  private JeuLocal jeu;
    public Accueil(){
         this.jouerLocal = new Button("Jouer contre un robot");
         this.jouerMulti = new Button("Jouer contre qqun d'autre");
         this.jouerLocal.setTranslateX(100);
        this.jouerLocal.setTranslateY(100);
        this.jouerMulti.setTranslateX(200);
        this.jouerMulti.setTranslateY(200);
     }
    public void start(Stage fenetre) {       
     this.label = new Label("Bienvenue dans un jeu de belotte fait maison! ");
          this.layout = new Pane(this.label,this.jouerLocal,this.jouerMulti);
        this.scene = new Scene(this.layout);
        jouerLocal.setOnAction(e->{
            JeuLocal jeu = new JeuLocal();
        });
    fenetre.setScene(this.scene);
    fenetre.show();
}
}
