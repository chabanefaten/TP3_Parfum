package test;

import java.util.List;

import metier.MetierImpl;
import metier.Parfum;

public class TestMetier {

	public static void main(String[] args) {
			MetierImpl metier= new MetierImpl();
			List<Parfum> pars = metier.getParfumsParMotCle("Black");
			for (Parfum p : pars)
			System.out.println(p.getNomParfum());
			}

	}
