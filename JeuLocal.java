
public class JeuLocal
{ private int nombreDeCarte;
  private JeuDeCarte jeuDeCarte;
  private Table table;
    public JeuLocal(){
       JeuDeCarte jeuDeCarte = new JeuDeCarte(); 
       renvoiJeuDeCarte(this.jeuDeCarte);
    }
  public JeuDeCarte renvoiJeuDeCarte(JeuDeCarte jeuDeCarte){
      return this.jeuDeCarte;
    }
}
