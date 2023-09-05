public class ExemploArvoreBi {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria();
        a.insere(555, "A");
        a.insere(333, "B");
        a.insere(888, "C");
        a.insere(111, "D");
        a.insere(444, "E");
        a.insere(999, "F");
        a.imprimeElementosArvore();
        System.out.println("Altura: " + a.alturaArvore());
    }
}
