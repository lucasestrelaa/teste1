import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Relogio extends JFrame {
		//declarando os componentes da janela
		JLabel lblHorario;
		//declarando variáveis
	    int hh,mm,ss; //*
	    Calendar hora; //*Hora
		DecimalFormat formato; //*
		/* abrindo o método construtor da classe
		 * Esse trecho do código [ou da clase] será o resposável pela CONSTRUÇÃO da interface gráfica na memória, 
		 * por isso tem esse nome.
		 * o construtor deve ser público e ter o mesmo nome da classe, 
		 * lembrando que java é case sensitive, então o nome do construtor deve ser identico ao da classe.
		 */ 
	    public Relogio() {
	    	//definindo o título da janela
	    	super("Relógio");
			//definindo tamanho e layout da janela
			setSize (100,55);
			setLocationRelativeTo(null);//centralizando a janela
			setLayout(new FlowLayout()); //falaremos mais tarde sobre layouts
			//definindo operação padrão para o botão fechar
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sem esta linha a janela não fecha pelo botão fechar.
			lblHorario = new JLabel("");//configurando o label inicial
			add(lblHorario);//adicionando o label configurado a janela
	        Timer time = new Timer(1000,ativar);
	        time.start();	
	    }
		private void HORAS(){
			hora = Calendar.getInstance();
		    hh = hora.get(Calendar.HOUR_OF_DAY);
		    mm = hora.get(Calendar.MINUTE);
		    ss = hora.get(Calendar.SECOND);
		    lblHorario.setText(formatar(hh)+":"+formatar(mm)+":"+formatar(ss));
		}
		private String formatar(int num){
	        formato = new DecimalFormat("00");
	        return formato.format(num);
	    }
	    ActionListener ativar = (
	    	new ActionListener(){
	    		public void actionPerformed(ActionEvent e){
	    			HORAS();
	    		}
	        }
	    );
	    /* Abrindo o método principal da classe [Main em inglês significa principal]
	     * Este método deve ser público, estático e vazio, ou seja, sempre vai ter a mesma estrutura;
	     * Na sua criação é definida uma String, que receberá possiveis argumentos passados pelo usuário.
	     * o nome da string costuma ser args [por abreviação de argumentos] 
	     * mas pode ser outro nome qualquer, como a, argumentos, parametros, param, etc 
	     *
	     * mais tarde podemos trabalhar com classes usando argumentos para String
	     */
	    public static void main(String[] args) {
	    	/*instanciando o método construtor
	    	 *mais tarde falaremos sobre instâncias do Java
	    	 */
	    	Janela instancia = new Janela();//nesta linha o código carrega o construtor para memória, montando a tela NA MEMÓRIA
	    	//definindo a visibilidade da tela
	 		instancia.setVisible(true); 
		}
	}


