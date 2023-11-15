package frontiere;

import controleur.ControlAfficherMarche;

public class BoundaryAfficherMarche {
	private ControlAfficherMarche controlAfficherMarche;

	public BoundaryAfficherMarche(ControlAfficherMarche controlAfficherMarche) {
		this.controlAfficherMarche = controlAfficherMarche;
	}

	public void afficherMarche(String nomAcheteur) {
		String[] donnerInfosMarche = controlAfficherMarche.donnerInfosMarche();
		StringBuilder chaine = new StringBuilder();
		if (donnerInfosMarche.length == 0) {
			System.out.println("Le marché est vide, revenez plus tard.\n");
		} else {
			System.out.println(nomAcheteur + ", vous trouverez au marché:\n");
			int i = 0;
			while (i!= donnerInfosMarche.length) {
				chaine.append("- " + donnerInfosMarche[i] + " qui vend " + donnerInfosMarche[i+1] + " " + donnerInfosMarche[i+2] + "\n");
				i += 3;
			}
			System.out.println(chaine.toString());
		}
	}
}
