import java.util.ArrayList;
import java.util.*; 
import java.util.Arrays;
import java.util.List;
public class Robot
{ private int nombreDeCarte;
    private Table table;
  private ArrayList listeDeCarte;
  private int compteurCarte;
  private String carte1;
  private String carte2;
  private String carte3;
  private String carte4;
  private String carte5;
  
    public Robot()
    {nombreDeCarte=5;
     this.listeDeCarte=table.renvoiListeDeCarte(listeDeCarte);
     this.compteurCarte=12;
     carte1=piocherUneCarte();
     carte2=piocherUneCarte();
     carte3=piocherUneCarte();
     carte4=piocherUneCarte();
     carte5=piocherUneCarte();
    
      }
      public String piocherUneCarte(){
    String carte =new String();
    Random random = new Random();
    int nb;
    nb = random.nextInt(32-this.compteurCarte);
    try {
    carte =(String)this.listeDeCarte.get(nb);    
    return carte;
    }   
    catch (ClassCastException e) {}
    this.listeDeCarte.remove(nb);
    this.compteurCarte=this.compteurCarte+1;
    return carte; }
}
