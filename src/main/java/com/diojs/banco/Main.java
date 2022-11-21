package com.diojs.banco;

public class Main {
    public static void main(String[] args) {
        Cliente a = new Cliente("Venilton");
        Conta cc = new ContaCorrente(a, 1, 0, 0),
            cp = new ContaPoupança(a, 2, 1, 0, 0.05, 3);
        cc.depositar(100);
        cc.transferir(37.70, cp);
        cc.extrato();
        cp.extrato();
    }
}
