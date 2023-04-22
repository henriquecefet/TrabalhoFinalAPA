package Codigo;
public class ListaEncadeada<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void adicionar(T elemento) {
        No<T> novoNo = new No<>(elemento);
        if (this.primeiro == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
        }
        this.tamanho++;
    }

    public T recuperar(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        No<T> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual.getElemento();
    }

    public void apagar(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if (posicao == 0) {
            this.primeiro = this.primeiro.getProximo();
            if (this.tamanho == 1) {
                this.ultimo = null;
            }
        } else {
            No<T> anterior = this.primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                anterior = anterior.getProximo();
            }
            anterior.setProximo(anterior.getProximo().getProximo());
            if (posicao == this.tamanho - 1) {
                this.ultimo = anterior;
            }
        }
        this.tamanho--;
    }

    public int getTamanho() {
        return tamanho;
    }

    private static class No<T> {
        private T elemento;
        private No<T> proximo;

        public No(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }

        public T getElemento() {
            return elemento;
        }

        public void setElemento(T elemento) {
            this.elemento = elemento;
        }

        public No<T> getProximo() {
            return proximo;
        }

        public void setProximo(No<T> proximo) {
            this.proximo = proximo;
        }
    }
}