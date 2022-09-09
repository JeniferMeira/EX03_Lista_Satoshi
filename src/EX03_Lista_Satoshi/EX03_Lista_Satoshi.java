package EX03_Lista_Satoshi;
import javax.swing.JOptionPane;
public class EX03_Lista_Satoshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double altura, base, area;
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triangulo"));
		base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do Triangulo"));
		
		area = ((altura*base)/2);
		
		JOptionPane.showMessageDialog(null, "Cálculo da area do triangulo é: "+ area);
	}

}
