package figuras;

import javax.swing.JOptionPane;

public class burtnica {

	public static void main(String[] args) {
		Centrs centraP1 = new Centrs(1, 101);
		JOptionPane.showMessageDialog(null, 
				"Pirmā punkta koordinātas: "
				+centraP1.izvaditKoordinatas(),
				"Informācija",
				JOptionPane.PLAIN_MESSAGE);
		
		centraP1.parvietot(5, -51);
		
		JOptionPane.showMessageDialog(null, 
				"Pirmā punkta koordinātas: "
				+centraP1.izvaditKoordinatas(),
				"Informācija",
				JOptionPane.PLAIN_MESSAGE);
		
		
		
		Cetrsturis c1 = new Cetrsturis();
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
				+c1.augstums+
				"\nplatums: "
				+c1.platums +
				"\ncentra punkts: "
				+c1.punkts.izvaditKoordinatas());
		
		//Pamēģina izvedot cetrsturis objektu ar otro konstruktoru...
		Cetrsturis c2 = new Cetrsturis(centraP1);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
				+c2.augstums+
				"\nplatums: "
				+c2.platums +
				"\ncentra punkts: "
				+c2.punkts.izvaditKoordinatas());
		
		//Pamēģina izvedot cetrsturis objektu ar trešo konstruktoru...
		Cetrsturis c3 = new Cetrsturis(10, 8);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
				+c3.augstums+
				"\nplatums: "
				+c3.platums +
				"\ncentra punkts: "
				+c3.punkts.izvaditKoordinatas());
		
		//Pamēģina izvedot cetrsturis objektu ar trešo konstruktoru...
		Cetrsturis c4 = new Cetrsturis(centraP1, 7, 6);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
				+c4.augstums+
				"\nplatums: "
				+c4.platums +
				"\ncentra punkts: "
				+c4.punkts.izvaditKoordinatas());
		
		
	}

}
