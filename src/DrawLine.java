import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import java.awt.Graphics;

public class DrawLine extends JPanel{
   
    /*Como a classe DrawLine herda de Jpanel, ela passa a ter acesso a esse método
    que recebe como parâmetro uma referência da classe Graphics
    */
    public void paintComponent(Graphics graphics){
        /* Acessando o método da super classe. */
        super.paintComponent(graphics);
        /*Desenhando a linha (x1,y1) (x2,y2), os valores devem ser do tipo int */
        graphics.drawLine(0, 0, 250, 250);
    }

    public static void main(String[] args) {
        
        /*Instanciando o JFrame para criação da janela.*/
        JFrame jFrame = new JFrame("Draw Line With Graphis Java");

        /*Método que encerra a aplicação ao fechar a janela */
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        /* Definindo o tamanho da janela */
        jFrame.setSize(550, 430);
        /* Tornando a janela visível*/
        jFrame.setVisible(true);
        /* Adicionando a instancia da classe responsável pela criação da linha à janela.*/
        jFrame.add(new DrawLine());
    }
}
