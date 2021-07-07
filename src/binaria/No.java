/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaria;

/**
 *
 * @author Usuario
 */
public class No {

    private int valor;
    private No esquerda;
    private No direita;

    public No(int valor) {
        this.valor = valor;
    }

    public void preenchefilho(No pai, No filho) {

        No aux = pai;

        if (aux.esquerda == null) {
            aux.setEsquerda(filho);

        } else {
            aux.setDireita(filho);

        }
    }
    
    
     public void inserir(No node, int valor) {

   if (node != null) {
    
    if (valor < node.valor) {
        
        if (node.esquerda != null) {
            inserir(node.esquerda,valor);
           
        } else {
            
          
            node.esquerda = new No(valor);
            
        }
    
    } else if (valor > node.valor) {
       
        if (node.direita != null) {
            inserir(node.direita,valor);
        } else {
            
            
            node.direita = new No(valor);
        
        }
    }
  }
}

    public int altura(No r) {
        if (r == null) {
            return 0;
        } else {
            int he = altura(r.getEsquerda());
            int hd = altura(r.getDireita());
            if (he < hd) {
                return (hd + 1);
            } else {
                return (he + 1);
            }
        }
    }

    public void red(No no) {
        
        if (no != null) {
       
            System.out.print(no.valor+ " ");
            
            red(no.getEsquerda());
            red(no.getDireita());
        }
    }
    
    public void erd(No No) {
        if (No != null) {
            erd(No.getEsquerda());
            System.out.print(No.getValor() + " ");
            erd(No.getDireita());
        }
    }
    public void po(No No){
    if(No != null){
       po(No.esquerda);
        po(No.direita);
        System.out.print(No.valor+" ");
    }
}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

   

 

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }
}