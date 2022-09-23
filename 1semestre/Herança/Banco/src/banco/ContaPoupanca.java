/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author aluno
 */
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    
    public void calcularNovoSaldo(double taxa) {
        setSaldo(getSaldo()+(getSaldo()*taxa));
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
