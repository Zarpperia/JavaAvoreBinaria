public class ArvoreBinaria {
    private No Raiz;

    public ArvoreBinaria() {
        this.Raiz = null;
    }

    public No getRaiz() {
        return Raiz;
    }

    public void setRaiz(No Raiz) {
        this.Raiz = Raiz;
    }

    public void inserir (int valor) {
        this.Raiz = this.InserirRecursivamente(this.Raiz, valor);
    }

    private No InserirRecursivamente(No noDaVez, int valor) {
        // Se a árvore estiver vazia (raiz é nula), cria um nó na raiz...
        if (noDaVez == null) {
            return new No(valor);
        }
        else
        {
            // Percorre a árvore recursivamente para encontrar o lugar correto..
            if (valor < noDaVez.getValor()){
                noDaVez.setEsquerda(InserirRecursivamente(noDaVez.getEsquerda(), valor));
            }
            else
            {
                noDaVez.setDireita(InserirRecursivamente(noDaVez.getDireita(), valor));
            }

            return noDaVez;
        }
    }
 
    // Percorrer : técnica Pré-Ordem : nó-da-vez, filho esquerdo, filho direito..
    public void percorrerPreOrdem(No no)
    {
        if (no != null) {
            System.out.print(no.getValor() + " ");
            this.percorrerPreOrdem(no.getEsquerda());
            this.percorrerPreOrdem(no.getDireita());
        }
    }

    // Percorrer : técnica Em-Ordem : filho esquerdo, nó-da-vez, filho direito..
    public void percorrerEmOrdem(No no)
    {
        if (no != null) {
            this.percorrerEmOrdem(no.getEsquerda());
            System.out.print(no.getValor() + " ");
            this.percorrerEmOrdem(no.getDireita());
        }
    }

    // Percorrer : técnica Pos-Ordem : filho esquerdo, filho direito, nó-da-vez ..
    public void percorrerPosOrdem(No no)
    {
        if (no != null) {
            this.percorrerPosOrdem(no.getEsquerda());
            this.percorrerPosOrdem(no.getDireita());
            System.out.print(no.getValor() + " ");
        }
    }

    // Percorrer : técnica Em-Ordem : filho direito, nó-da-vez, filho esquerdo..
    public void percorrerEmOrdemDecrescente(No no)
    {
        if (no != null) {
            this.percorrerEmOrdemDecrescente(no.getDireita());
            System.out.print(no.getValor() + " ");
            this.percorrerEmOrdemDecrescente(no.getEsquerda());
        }
    }
}