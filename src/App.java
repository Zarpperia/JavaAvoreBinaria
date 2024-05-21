public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria Avores = new ArvoreBinaria();

        Avores.inserir(8);

        /*System.out.println("Avores da Raiz"); 
        System.out.println(Avores.getRaiz().getValor());*/

        Avores.inserir(10);
        Avores.inserir(3);

        /*System.out.println("Avores da Esquerda");
        System.out.println(Avores.getRaiz().getEsquerda().getValor());

        System.out.println("Avores da Direito");
        System.out.println(Avores.getRaiz().getDireita().getValor());*/

        Avores.inserir(6);
        Avores.inserir(14);
        Avores.inserir(1);

        Avores.inserir(13);
        Avores.inserir(7);
        Avores.inserir(4);
        Avores.inserir(4);

        //Chamando o percorrerPreOrder(No no):void...
        Avores.percorrerPreOrdem(Avores.getRaiz());

        System.err.println("");
        //Chamando o percorrerEmOrder(No no):void...
        Avores.percorrerEmOrdem(Avores.getRaiz());

        System.err.println("");
        //Chamando o percorrerPosOrder(No no):void...
        Avores.percorrerPosOrdem(Avores.getRaiz());
        
        System.err.println("");
        //Chamando o percorrerEmOrder(No no):void...
        Avores.percorrerEmOrdemDecrescente(Avores.getRaiz());
    }
}