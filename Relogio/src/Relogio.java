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
		//declarando vari�veis
	    int hh,mm,ss; //*
	    Calendar hora; //*Hora
		DecimalFormat formato; //*
		/* abrindo o m�todo construtor da classe
		 * Esse trecho do c�digo [ou da clase] ser� o respos�vel pela CONSTRU��O da interface gr�fica na mem�ria, 
		 * por isso tem esse nome.
		 * o construtor deve ser p�blico e ter o mesmo nome da classe, 
		 * lembrando que java � case sensitive, ent�o o nome do construtor deve ser identico ao da classe.
		 */ 
	    public Relogio() {
	    	//definindo o t�tulo da janela
	    	super("Rel�gio");
			//definindo tamanho e layout da janela
			setSize (100,55);
			setLocationRelativeTo(null);//centralizando a janela
			setLayout(new FlowLayout()); //falaremos mais tarde sobre layouts
			//definindo opera��o padr�o para o bot�o fechar
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//sem esta linha a janela n�o fecha pelo bot�o fechar.
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
	    /* Abrindo o m�todo principal da classe [Main em ingl�s significa principal]
	     * Este m�todo deve ser p�blico, est�tico e vazio, ou seja, sempre vai ter a mesma estrutura;
	     * Na sua cria��o � definida uma String, que receber� possiveis argumentos passados pelo usu�rio.
	     * o nome da string costuma ser args [por abrevia��o de argumentos] 
	     * mas pode ser outro nome qualquer, como a, argumentos, parametros, param, etc 
	     *
	     * mais tarde podemos trabalhar com classes usando argumentos para String
	     */
	    public static void main(String[] args) {
	    	/*instanciando o m�todo construtor
	    	 *mais tarde falaremos sobre inst�ncias do Java
	    	 */
	    	Janela instancia = new Janela();//nesta linha o c�digo carrega o construtor para mem�ria, montando a tela NA MEM�RIA
	    	//definindo a visibilidade da tela
	 		instancia.setVisible(true); 
		}
	}


