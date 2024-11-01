package aprendendo.joptionpane;

import javax.swing.JOptionPane;

public class media {
	
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("nota1");
		String nota2 = JOptionPane.showInputDialog("nota2");
		String nota3 = JOptionPane.showInputDialog("nota3");
		String nota4 = JOptionPane.showInputDialog("nota4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if(media >= 50) {
			if(media >= 70) {
				JOptionPane.showInputDialog(null, "O aluno esta aprovado com a media de: " +media);
			}
			else {
				JOptionPane.showInputDialog(null, "O aluno esta em recuperação com a media de: " +media);
			}
		}
		else {
			JOptionPane.showInputDialog(null, "O aluno esta reprovado com a media de: " +media);

		}
	} 
}
