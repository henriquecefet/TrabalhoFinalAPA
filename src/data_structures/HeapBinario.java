package src.data_structures;

public class HeapBinario {
    private int[] elementos;
    private int tamanho;

    public HeapBinario(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
        subir(this.tamanho - 1);
    }

    public int remover() {
        if (this.tamanho == 0) {
            throw new IllegalStateException("Heap vazio");
        }
        int elementoRemovido = this.elementos[0];
        this.elementos[0] = this.elementos[this.tamanho - 1];
        this.tamanho--;
        descer(0);
        return elementoRemovido;
    }

    private void subir(int indice) {
        int pai = (indice - 1) / 2;
        while (indice > 0 && this.elementos[indice] < this.elementos[pai]) {
            trocar(indice, pai);
            indice = pai;
            pai = (indice - 1) / 2;
        }
    }

    private void descer(int indice) {
        int filhoEsquerdo = 2 * indice + 1;
        int filhoDireito = 2 * indice + 2;
        int menorFilho;
        if (filhoDireito < this.tamanho && this.elementos[filhoDireito] < this.elementos[filhoEsquerdo]) {
            menorFilho = filhoDireito;
        } else {
            menorFilho = filhoEsquerdo;
        }
        while (menorFilho < this.tamanho && this.elementos[indice] > this.elementos[menorFilho]) {
            trocar(indice, menorFilho);
            indice = menorFilho;
            filhoEsquerdo = 2 * indice + 1;
            filhoDireito = 2 * indice + 2;
            if (filhoDireito < this.tamanho && this.elementos[filhoDireito] < this.elementos[filhoEsquerdo]) {
                menorFilho = filhoDireito;
            } else {
                menorFilho = filhoEsquerdo;
            }
        }
    }

    private void trocar(int i, int j) {
        int temp = this.elementos[i];
        this.elementos[i] = this.elementos[j];
        this.elementos[j] = temp;
    }

	public int getTamanho() {
		return tamanho;
	}
}