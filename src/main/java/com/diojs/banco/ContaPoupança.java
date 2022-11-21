package com.diojs.banco;

public class ContaPoupança extends Conta {

    protected double rendimento;
    protected int variacao;

    public ContaPoupança(Cliente dono, int numero, int agencia, double saldo, double rendimento, int variacao) {
        super(dono, numero, agencia, saldo);
        this.variacao=variacao;
    }
    
    @Override
    public void extrato(){
        System.out.println( String.format(
             "A conta poupança %d da agência %d com variação %d do cliente %s tem saldo %.2f"   
            , this.numero, this.agencia, this.variacao, this.dono.getNome(), this.saldo
            ));
    }

    @Override
    public int compareTo(Conta o) {
        
        if(this.agencia != o.agencia){
            return Integer.compare(this.agencia, o.agencia);
        }else if(this.numero != o.numero){
            return Integer.compare(this.numero, o.numero);
        }else if (!(o instanceof ContaPoupança)){
            return 1;
        }else return 0;
    }

    @Override
    public boolean equals(Object o){
        if(o.getClass() != this.getClass()){
            return false;
        }else{
            ContaPoupança p = (ContaPoupança) o;
            return (this.compareTo(p) == 0);
        }
    }
}
