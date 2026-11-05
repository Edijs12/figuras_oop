package figuras;

import javax.swing.JOptionPane;

public class burtnica {
	
	/*public static void main(String[] args) {
		Centrs centraP1 = new Centrs(0, 101);
		JOptionPane.showMessageDialog(null,
		"Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(),
		"Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		centraP1.parvietot(5, -51);
		
		JOptionPane.showMessageDialog(null,
		"Pirmā punkta koordinātas: "
		+ centraP1.izvaditKoordinatas(),
		"Infomrācija",
		JOptionPane.PLAIN_MESSAGE);
		
		Cetrsturis c1 = new Cetrsturis();
		JOptionPane.showMessageDialog(null, 
		"Četrstūra augstums: "
		+ c1.augstums
		+ "\nplatums: "
		+ c1.platums
		+ "\ncentra punkts: "
		+ c1.punkts.izvaditKoordinatas());
		
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
*/
    static int ievaditSkaitli(String zinojums, String noklusejums) {
        String ievade;
        
            ievade = JOptionPane.showInputDialog(null, zinojums, noklusejums);
            if (ievade == null) {
                return -1;
            }
        
        
            return Integer.parseInt(ievade.trim());
    }

    public static void main(String[] args) {
        String izvelne;
        
        String[] darbibuSaraksts = {
            "1. Cetrstūris (bez Centra)",
            "2. Cetrstūris (ar Centru)",
            "3. Cetrstūris (ar platumu un augstumu)",
            "4. Cetrstūris (ar Centru, platumu un augstumu)",
            "Aizvērt"};

        do {
            izvelne = (String) JOptionPane.showInputDialog(
                    null,
                    "Izvēlies četrstūra izveides veidu:",
                    "Darbību izvēle",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    darbibuSaraksts,
                    darbibuSaraksts[0]);

            if (izvelne == null) {
                izvelne = "Aizvērt";
            }

            switch (izvelne) {
                
                case "1. Cetrstūris (bez Centra)": {
                    Cetrsturis c1 = new Cetrsturis();
                    JOptionPane.showMessageDialog(null, 
                            "1. Četrstūris izveidots!\n\n"
                            + "Augstums: " + c1.augstums + "\n"
                            + "Platums: " + c1.platums + "\n"
                            + "Centra punkts: " + c1.punkts.izvaditKoordinatas()
                            + "\nLaukums: " + c1.cLaukums(),
                            "Informācija", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                
                case "2. Cetrstūris (ar Centru)": {
                   
                    int x = ievaditSkaitli("Ievadi centra punkta X koordinātu:", "0");
                    if (x == -1) break;
                    
                    int y = ievaditSkaitli("Ievadi centra punkta Y koordinātu:", "101");
                    if (y == -1) break;
                    
                    Centrs centraP1 = new Centrs(x, y);
                    Cetrsturis c2 = new Cetrsturis(centraP1);
                    
                    JOptionPane.showMessageDialog(null,
                            "2. Četrstūris izveidots!\n\n"
                            + "Augstums: " + c2.augstums + "\n"
                            + "Platums: " + c2.platums + "\n"
                            + "Centra punkts: " + c2.punkts.izvaditKoordinatas()
                            + "\nLaukums: " + c2.cLaukums(),
                            "Informācija", JOptionPane.INFORMATION_MESSAGE);
                    break;         	 		
                }
                
                case "3. Cetrstūris (ar platumu un augstumu)": {
                    int platums = ievaditSkaitli("Ievadi četrstūra platumu:", "10");
                    if (platums == -1) break;
                    
                    int augstums = ievaditSkaitli("Ievadi četrstūra augstumu:", "8");
                    if (augstums == -1) break;
                    
                    Cetrsturis c3 = new Cetrsturis(platums, augstums);
                    
                    JOptionPane.showMessageDialog(null,
                            "3. Četrstūris izveidots!\n\n"
                            + "Augstums: " + c3.augstums + "\n"
                            + "Platums: " + c3.platums + "\n"
                            + "Centra punkts: " + c3.punkts.izvaditKoordinatas()
                            + "\nLaukums: " + c3.cLaukums(),
                            "Informācija", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
                
                case "4. Cetrstūris (ar Centru, platumu un augstumu)": {
                    int x = ievaditSkaitli("Ievadi centra punkta X koordinātu:", "0");
                    if (x == -1) break;
                    
                    int y = ievaditSkaitli("Ievadi centra punkta Y koordinātu:", "101");
                    if (y == -1) break;
                    
                    int platums = ievaditSkaitli("Ievadi četrstūra platumu:", "5");
                    if (platums == -1) break;
                    
                    int augstums = ievaditSkaitli("Ievadi četrstūra augstumu:", "10");
                    if (augstums == -1) break;
                    
                    Centrs centraP1 = new Centrs(x, y);
                    Cetrsturis c4 = new Cetrsturis(centraP1, platums, augstums);
                    
                    JOptionPane.showMessageDialog(null,
                            "4. Četrstūris izveidots!\n\n"
                            + "Augstums: " + c4.augstums + "\n"
                            + "Platums: " + c4.platums + "\n"
                            + "Centra punkts: " + c4.punkts.izvaditKoordinatas()
                            + "\nLaukums: " + c4.cLaukums(),
                            "Informācija", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }

                case "Aizvērt":
                    break;
            }

        } while (!izvelne.equals("Aizvērt"));
    }
  }

