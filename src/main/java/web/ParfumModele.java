package web;

import java.util.ArrayList;
import java.util.List;

import metier.Parfum;
public class ParfumModele {
	private String motCle;
	List<Parfum> parfums = new ArrayList<>();
	public String getMotCle() {
	return motCle;
	}
	public void setMotCle(String motCle) {
	this.motCle = motCle;
	}
	public List<Parfum> getParfums() {
	return parfums;
	}
	public void setParfums(List<Parfum> parfums) {
	this.parfums = parfums;
	}
}
