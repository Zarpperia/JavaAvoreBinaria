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
}