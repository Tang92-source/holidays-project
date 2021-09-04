import java.util.ArrayList;
import java.util.*; 
import java.util.Arrays;
import java.util.List;
public class Table
{ private int nombreDeCarte;
  private JeuLocal jeuLocal;
  private ArrayList listeDeCarte;
  private JeuDeCarte jeuDeCarte;
  private String carte1;
  private String carte2;
  private String carte3;
  private String carte4;
  private String carte5;
  private String carte6;
  private String carte7;
  private String carte8;
  private String carte9;
  private String carte10;
  private String carte11;
  private String carte12;
      public Table()
    {this.nombreDeCarte=12;
     this.jeuDeCarte=jeuLocal.renvoiJeuDeCarte(jeuDeCarte);
     carte1=jeuDeCarte.piocherUneCarte();
     carte2=jeuDeCarte.piocherUneCarte();
     carte3=jeuDeCarte.piocherUneCarte();
     carte4=jeuDeCarte.piocherUneCarte();
     carte5=jeuDeCarte.piocherUneCarte();
      carte6=jeuDeCarte.piocherUneCarte();
     carte7=jeuDeCarte.piocherUneCarte();
     carte8=jeuDeCarte.piocherUneCarte();
     carte9=jeuDeCarte.piocherUneCarte();
     carte10=jeuDeCarte.piocherUneCarte();
     carte11=jeuDeCarte.piocherUneCarte();
     carte12=jeuDeCarte.piocherUneCarte();
     this.listeDeCarte=jeuDeCarte.renvoiListeDeCarte();
     renvoiListeDeCarte(this.listeDeCarte);
    }
    public ArrayList renvoiListeDeCarte(ArrayList listeDeCarte){
    return listeDeCarte; }
}
