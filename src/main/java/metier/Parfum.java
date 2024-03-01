package metier;

import java.io.Serializable;
public class Parfum implements Serializable{
private Long idParfum;
private String nomParfum;
private double prix;
    public Parfum() {
      super();
}
public Parfum(String nomParfum, double prix) {
super();
this.nomParfum = nomParfum;
this.prix = prix;
}
public Long getIdParfum() {
	return idParfum;
}
public void setIdParfum(Long idParfum) {
	this.idParfum = idParfum;
}
public String getNomParfum() {
	return nomParfum;
}
public void setNomParfum(String nomParfum) {
	this.nomParfum = nomParfum;
}
public double getPrix() {
	return prix;
}
public void setPrix(double prix) {
	this.prix = prix;
}
}