import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Relogioo {
	
	DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame janela = new JFrame("Relógio");
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(240, 320);
		
		
		Container c = janela.getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel H1 = new JLabel();
		c.add(H1);
		

		Thread t1 = new Thread();
		t1.start();
		
		janela.setVisible(true);
	}
	class MinhaThread implements Runnable{
		private JLabel rotulo;
		//Date dataatual = new Date();
		public MinhaThread(JLabel rotulo) {
			this.rotulo = rotulo;
			
			
		}
		


		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
	            rotulo.setText(formatoHora.format(new Date()));
	            
	            try {
	                Thread.sleep(1000);  // CONTAGEM DOS SEGUNDOS. THREAD DORMI 1 SEGUNDO CHAMANDO O LOOP
	                
	            } catch (InterruptedException ex) {
	                
	            }
	            
	        }
		}
	}

	
	
	

}
