import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Horas {
	DateFormat formato = new SimpleDateFormat("HH:mm:ss");
	private void label(){
		lbhora = new javax.swing.JLabel();
		lbhora.setFont(new Font("Times New Roman", 1, 12));
		Thread r = new Thread(new Horas.Clock());
		r.start();
		
	}
	
	private javax.swing.JLabel lbhora;
	
	class Clock implements Runnable{
		public void run(){
			while(true){
				lbhora.setText(formato.format(new Date()));
				try{
					Thread.sleep(1000);
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Horas();
		JFrame janela = new JFrame("Relógio");
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(240, 320);
		
		
		Container c = janela.getContentPane();
		c.setLayout(new FlowLayout());
		
//		c.add();
//	
//		//JLabel lbHoras = new JLabel();
//		//lbhora.setFont(new Font("Times New Roman", 1, 12));
//		
//		
//		
//		
//		janela.setVisible(true);
//		
		
	}

}
