/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verificaprimo_2;

public class OperacoesPrimo_2 {
    // Método que verifica se um número é primo
    public boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false; // Números <= 1 não são primos
        }
        
        for (int divisor = 2; divisor <= numero / 2; divisor++) {
            if (numero % divisor == 0) {
                return false; // Não é primo
            }
        }
        return true; // É primo
    }
}


