import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fisica4 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora de distancia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(6, 2));

        JLabel labelTrem1 = new JLabel("Velocidade do primeiro trem em km/h: ");
        JTextField fieldTrem1 = new JTextField();
        JLabel labelTrem2 = new JLabel("Velocidade do segundo trem em km/h: ");
        JTextField fieldTrem2 = new JTextField();
        JLabel labelDistancia = new JLabel("Distancia entre os dois trens em km: ");
        JTextField fieldDistancia = new JTextField();
        JLabel labelPassaro = new JLabel("Velocidade do passaro em km/h: ");
        JTextField fieldPassaro = new JTextField();
        JButton calcularButton = new JButton("Calcular");
        JLabel resultadoLabel = new JLabel("Distancia que o passaro percorre ate a colisao: ");

        frame.add(labelTrem1);
        frame.add(fieldTrem1);
        frame.add(labelTrem2);
        frame.add(fieldTrem2);
        frame.add(labelDistancia);
        frame.add(fieldDistancia);
        frame.add(labelPassaro);
        frame.add(fieldPassaro);
        frame.add(new JLabel()); 
        frame.add(calcularButton);
        frame.add(resultadoLabel);
        frame.add(new JLabel()); 

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float vTrem1 = Float.parseFloat(fieldTrem1.getText());
                    float vTrem2 = Float.parseFloat(fieldTrem2.getText());
                    float distancia = Float.parseFloat(fieldDistancia.getText());
                    float vPassaro = Float.parseFloat(fieldPassaro.getText());

                    float vTotal = vTrem1 + vTrem2;
                    float colisao = distancia / vTotal;
                    float dPassaro = vPassaro * colisao;

                    resultadoLabel.setText(String.format("Distancia que o passaro percorre ate a colisao: %.2f km", dPassaro));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "insira numeros válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}