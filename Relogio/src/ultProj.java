import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;





public class ultProj extends JFrame{
	DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
	
	public ultProj(){
		
		//Componente();
		initComponents(); 
		
		setTitle(" Relógio Digital ");  // Titulo para o relogio
        setSize(400, 200);  //Tamanho Tela
        setLocationRelativeTo(null);
        //setVisible(true);
        //this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Thread relogio = new Thread(new Clock());
        relogio.start();
	}
	
	private JLabel horas;
	
	private void initComponents() {

        horas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        horas.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        horas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(horas, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        
        
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ultProj().setVisible(true);;
            }
        });
	}

	class Clock implements Runnable{
		public void run() {
			while (true) {
				//.setText(formatoHora.format(new Date()));
	            //(formatoHora.format(new Date()));
	            horas.setText(formatoHora.format(new Date()));
	            try {
	                Thread.sleep(1000);  // CONTAGEM DOS SEGUNDOS. THREAD DORMI 1 SEGUNDO CHAMANDO O LOOP
	                
	            } catch (Exception e) {}
	            
	        }
		}
	}
	
}
