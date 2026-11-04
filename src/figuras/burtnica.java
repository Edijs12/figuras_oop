package figuras;

import javax.swing.JOptionPane;

public class Burtnica {

	public static void main(String[] args) {
		Centrs centraP1 = new Centrs(0, 101);
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(), "Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		centraP1.parvietot(5, -51);
		
		JOptionPane.showMessageDialog(null, "Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(), "Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		Cetrsturis c1 = new Cetrsturis();
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c1.augstums + "\nplatums: " + c1.platums + "\ncentra punkts: " + c1.punkts.izvaditKoordinatas());
		
		Cetrsturis c2 = new Cetrsturis(centraP1);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c2.augstums + "\nplatums: " + c2.platums + "\ncentra punkts: " + c2.punkts.izvaditKoordinatas());
		
		Cetrsturis c3 = new Cetrsturis(10, 8);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c3.augstums + "\nplatums: " + c3.platums + "\ncentra punkts: " + c3.punkts.izvaditKoordinatas());
		
		Cetrsturis c4 = new Cetrsturis(centraP1, 5, 10);
		JOptionPane.showMessageDialog(null, "Četrstūra augstums: "
		+ c4.augstums + "\nplatums: " + c4.platums + "\ncentra punkts: " + c4.punkts.izvaditKoordinatas());
	}
}
		
		/*String izvelne;
		String[] darbibuSaraksts = {"1. Četrstūris",
							"2. Četrstūris",
							"3. Četrstūris",
							"4. Četrstūris"};
				
		
		
				do {
		            izvelne = (String) JOptionPane.showInputDialog(
		                    null,
		                    "Izvēlies darbību",
		                    "Darbību izvēle",
		                    JOptionPane.QUESTION_MESSAGE,
		                    null,
		                    darbibuSaraksts,
		                    darbibuSaraksts[0]);

		            if (izvelne == null) {
		                izvelne = "Aizvērt";
		            }

		            switch (izvelne) {
		            
		            case "1. Četrstūris": {
		            	Cetrsturis c1 = new Cetrsturis();
		        		JOptionPane.showMessageDialog(null, 
		        		"Četrstūra augstums: "
		        		+ c1.augstums 
		        		+ "\nplatums: " 
		        		+ c1.platums
		        		+ "\ncentra punkts: " 
		        		+ c1.punkts.izvaditKoordinatas());
		            	break;
		            }
		            case "2. Četrstūris": {
		            	Centrs centraP1 = new Centrs(0, 101);
		            	Cetrsturis c2 = new Cetrsturis(centraP1);
		        		JOptionPane.showMessageDialog(null,
		        		"Četrstūra augstums: "
		        		+ c2.augstums
		        		+ "\nplatums: "
		        		+ c2.platums
		        		+ "\ncentra punkts: "
		        		+ c2.punkts.izvaditKoordinatas());
		        		break;		        	 		
		            }
		            case "3. Četrstūris": {
		            	Cetrsturis c3 = new Cetrsturis(10, 8);
		        		JOptionPane.showMessageDialog(null,
		        		"Četrstūra augstums: "
		        		+ c3.augstums
		        		+ "\nplatums: "
		        		+ c3.platums
		        		+ "\ncentra punkts: " 
		        		+ c3.punkts.izvaditKoordinatas());
		        		break;
		            }
		            case "4. Četrstūris": {
		            	Centrs centraP1 = new Centrs(0, 101);
		            	Cetrsturis c4 = new Cetrsturis(centraP1, 5, 10);
		        		JOptionPane.showMessageDialog(null,
		        		"Četrstūra augstums: "
		        		+ c4.augstums
		        		+ "\nplatums: "
		        		+ c4.platums
		        		+ "\ncentra punkts: " 
		        		+ c4.punkts.izvaditKoordinatas());
		            	break;
		            }

		
	  } 
    }  while (!izvelne.equals("Aizvērt"));
  }
}
*/
