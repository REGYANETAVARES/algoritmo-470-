/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verificaprimo_2;

import javax.swing.JOptionPane;

public class VerificaPrimo_2 {
    public static void main(String[] args) {
        OperacoesPrimo_2 operacoes = new OperacoesPrimo_2();
        
        // Solicitar um número ao usuário
        String input = JOptionPane.showInputDialog(null, "Digite um número maior que 0:");
        
        try {
            int numero = Integer.parseInt(input);
            
            if (numero <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número maior que 0.");
            } else {
                // Verificar se o número é primo
                boolean primo = operacoes.ehPrimo(numero);
                
                if (primo) {
                    JOptionPane.showMessageDialog(null, numero + " é primo.");
                } else {
                    JOptionPane.showMessageDialog(null, numero + " não é primo.");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
        }
    }
}
