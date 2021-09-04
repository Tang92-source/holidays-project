import java.util.ArrayList;
import java.util.*; 
import java.util.Arrays;
import java.util.List;

public class JeuDeCarte
{ private String couleur;
  private String nomDeLaCarte;
  private int valeur;
  private int nombreDeCarte;
  private int compteurCarte;
  private String asDeCoeur;
  private String asDeCarraux;
  private String asDePique;
  private String asDeTrèfle;
  private String roiDeCoeur;
  private String roiDeCarraux;
  private String roiDePique;
  private String roiDeTrèfle;
  private String dameDeCoeur;
  private String dameDeCarraux;
  private String dameDePique;
  private String dameDeTrèfle;
  private String valletDeCoeur;
  private String valletDeCarraux;
  private String valletDePique;
  private String valletDeTrèfle;
  private String dixDeCoeur;
  private String dixDeCarraux;
  private String dixDePique;
  private String dixDeTrèfle;
  private String neufDeCoeur;
  private String neufDeCarraux;
  private String neufDePique;
  private String neufDeTrèfle;
  private String huitDeCoeur;
  private String huitDeCarraux;
  private String huitDePique;
  private String huitDeTrèfle;
  private String septDeCoeur;
  private String septDeCarraux;
  private String septDePique;
  private String septDeTrèfle;
  private ArrayList listeDeCarte;
    public JeuDeCarte()
    { this.nombreDeCarte=32;
    }
    public void listeDeCarte(){
    ArrayList listeDeCarte = new ArrayList();
    listeDeCarte.add(asDeCoeur);
    listeDeCarte.add(asDeCarraux);
    listeDeCarte.add(asDePique);
    listeDeCarte.add(asDeTrèfle);
    listeDeCarte.add(roiDeCoeur);
    listeDeCarte.add(roiDeCarraux);
    listeDeCarte.add(roiDePique);
    listeDeCarte.add(roiDeTrèfle);
    listeDeCarte.add(dameDeCoeur);
    listeDeCarte.add(dameDeCarraux);
    listeDeCarte.add(dameDePique);
    listeDeCarte.add(dameDeTrèfle);
    listeDeCarte.add(valletDeCoeur);
    listeDeCarte.add(valletDeCarraux);
    listeDeCarte.add(valletDePique);
    listeDeCarte.add(valletDeTrèfle);
    listeDeCarte.add(dixDeCoeur);
    listeDeCarte.add(dixDeCarraux);
    listeDeCarte.add(dixDePique);
    listeDeCarte.add(dixDeTrèfle);
    listeDeCarte.add(neufDeCoeur);
    listeDeCarte.add(neufDeCarraux);
    listeDeCarte.add(neufDePique);
    listeDeCarte.add(neufDeTrèfle);
    listeDeCarte.add(huitDeCoeur);
    listeDeCarte.add(huitDeCarraux);
    listeDeCarte.add(huitDePique);
    listeDeCarte.add(huitDeTrèfle);
    listeDeCarte.add(septDeCoeur);
    listeDeCarte.add(septDeCarraux);
    listeDeCarte.add(septDePique);
    listeDeCarte.add(septDeTrèfle);
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
    public ArrayList renvoiListeDeCarte(){
        return this.listeDeCarte;
    }
    public String couleurDeLaCarte(String carte){
        if(carte==asDeCoeur || carte==roiDeCoeur|| carte==dameDeCoeur|| carte==valletDeCoeur|| carte==dixDeCoeur|| carte==neufDeCoeur|| carte==huitDeCoeur|| carte==septDeCoeur ){
        couleur="coeur";}
        else if(carte==asDeCarraux || carte==roiDeCarraux|| carte==dameDeCarraux|| carte==valletDeCarraux|| carte==dixDeCarraux|| carte==neufDeCarraux|| carte==huitDeCarraux|| carte==septDeCarraux ){
        couleur="carraux";}
        else if(carte==asDePique || carte==roiDePique|| carte==dameDePique|| carte==valletDePique|| carte==dixDePique|| carte==neufDePique|| carte==huitDePique|| carte==septDePique ){
        couleur="pique";}
        else if(carte==asDeTrèfle || carte==roiDeTrèfle|| carte==dameDeTrèfle|| carte==valletDeTrèfle|| carte==dixDeTrèfle|| carte==neufDeTrèfle|| carte==huitDeTrèfle|| carte==septDeTrèfle ){
        couleur="trèfle";}
        return couleur;}
        public int valeurDeLaCarte(String carte){
        if(carte==asDeCoeur || carte==asDeCarraux|| carte==asDePique|| carte==asDeTrèfle){
        valeur=11;}
        else if(carte==roiDeCoeur || carte==roiDeCarraux|| carte==roiDePique|| carte==roiDeTrèfle){
        valeur=4;}
        else if(carte==dameDeCoeur || carte==dameDeCarraux|| carte==dameDePique|| carte==dameDeTrèfle){
        valeur=3;}
        else if(carte==valletDeCoeur || carte==valletDeCarraux|| carte==valletDePique|| carte==valletDeTrèfle){
        valeur=2;}
         else if(carte==dixDeCoeur || carte==dixDeCarraux|| carte==dixDePique|| carte==dixDeTrèfle){
        valeur=10;}
        else if(carte==neufDeCoeur || carte==neufDeCarraux|| carte==neufDePique|| carte==neufDeTrèfle){
        valeur=0;}
        else if(carte==huitDeCoeur || carte==huitDeCarraux|| carte==huitDePique|| carte==huitDeTrèfle){
        valeur=0;}
        else if(carte==septDeCoeur || carte==septDeCarraux|| carte==septDePique|| carte==septDeTrèfle){
        valeur=0;}
        return valeur;}
        public String nomDeLaCarte(String carte){
            if(carte==asDeCoeur){
                nomDeLaCarte="As De Coeur";              
            }
            else if(carte==asDeCarraux){
                nomDeLaCarte="As De Carraux";              
            }
            else if(carte==asDePique){
                nomDeLaCarte="As De Pique";              
            }
            else if(carte==asDeTrèfle){
                nomDeLaCarte="As De Trèfle";              
            }
            else if(carte==roiDeCoeur){
                nomDeLaCarte="Roi De Coeur";              
            }
            else if(carte==roiDeCarraux){
                nomDeLaCarte="Roi De Carraux";              
            }
            else if(carte==roiDePique){
                nomDeLaCarte="Roi De Pique";              
            }
            else if(carte==roiDeTrèfle){
                nomDeLaCarte="Roi De Trèfle";              
            }
            else if(carte==dameDeCoeur){
                nomDeLaCarte="Dame De Coeur";              
            }
            else if(carte==dameDeCarraux){
                nomDeLaCarte="Dame De Carraux";              
            }
            else if(carte==dameDePique){
                nomDeLaCarte="Dame De Pique";              
            }
            else if(carte==dameDeTrèfle){
                nomDeLaCarte="Dame De Trèfle";              
            }
            else if(carte==valletDeCoeur){
                nomDeLaCarte="Vallet De Coeur";              
            }
            else if(carte==valletDeCarraux){
                nomDeLaCarte="Vallet De Carraux";              
            }
            else if(carte==valletDePique){
                nomDeLaCarte="Vallet De Pique";              
            }
            else if(carte==valletDeTrèfle){
                nomDeLaCarte="Vallet De Trèfle";              
            }
            else if(carte==dixDeCoeur){
                nomDeLaCarte="Dix De Coeur";              
            }
            else if(carte==dixDeCarraux){
                nomDeLaCarte="Dix De Carraux";              
            }
            else if(carte==dixDePique){
                nomDeLaCarte="Dix De Pique";              
            }
            else if(carte==dixDeTrèfle){
                nomDeLaCarte="Dix De Trèfle";              
            }
            else if(carte==neufDeCoeur){
                nomDeLaCarte="Neuf De Coeur";              
            }
            else if(carte==neufDeCarraux){
                nomDeLaCarte="Neuf De Carraux";              
            }
            else if(carte==neufDePique){
                nomDeLaCarte="Neuf De Pique";              
            }
            else if(carte==neufDeTrèfle){
                nomDeLaCarte="Neuf De Trèfle";              
            }
            else if(carte==huitDeCoeur){
                nomDeLaCarte="Huit De Coeur";              
            }
            else if(carte==huitDeCarraux){
                nomDeLaCarte="Huit De Carraux";              
            }
            else if(carte==huitDePique){
                nomDeLaCarte="Huit De Pique";              
            }
            else if(carte==huitDeTrèfle){
                nomDeLaCarte="Huit De Trèfle";              
            }
            else if(carte==septDeCoeur){
                nomDeLaCarte="Sept De Coeur";              
            }
            else if(carte==septDeCarraux){
                nomDeLaCarte="Sept De Carraux";              
            }
            else if(carte==septDePique){
                nomDeLaCarte="Sept De Pique";              
            }
            else if(carte==septDeTrèfle){
                nomDeLaCarte="Sept De Trèfle";              
            }            
            return nomDeLaCarte;
        }
    
}
