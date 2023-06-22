package Codigo;

//Classe que representa uma estrutura de dados do tipo heap mínimo binário
public class HeapBinario {
 // Atributo que armazena os elementos do heap em um vetor
 private int[] elementos;
 // Atributo que armazena o número de elementos do heap
 private int tamanho;

 // Construtor que recebe a capacidade máxima do heap e inicializa o vetor de elementos
 public HeapBinario(int capacidade) {
     this.elementos = new int[capacidade];
     this.tamanho = 0;
 }

 // Método que adiciona um elemento no heap, mantendo a propriedade de min-heap
 // O método adicionar tem complexidade O(log n), pois insere o elemento na última posição do vetor
 // e depois chama o método subir, que percorre o caminho da folha até a raiz do heap, trocando o elemento com seu pai se necessário. 
 // Esse caminho tem no máximo log n passos, pois o heap é uma árvore binária completa.
 
 public void adicionar(int elemento) {
     // Insere o elemento na última posição livre do vetor
     this.elementos[this.tamanho] = elemento;
     // Incrementa o tamanho do heap
     this.tamanho++;
     // Chama o método subir para ajustar a posição do elemento inserido, se necessário
     subir(this.tamanho - 1);
 }

 // Método que remove e retorna o menor elemento do heap, mantendo a propriedade de min-heap
 // O método remover tem complexidade O(log n), pois remove o elemento da raiz do heap e depois chama o método descer,
 // que percorre o caminho da raiz até uma folha do heap, trocando o elemento com seu menor filho se necessário. 
 // Esse caminho também tem no máximo log n passos, pelo mesmo motivo.


 public int remover() {
     // Verifica se o heap está vazio
     if (this.tamanho == 0) {
         // Se estiver, lança uma exceção
         throw new IllegalStateException("Heap vazio");
     }
     // Armazena o menor elemento do heap, que é o primeiro do vetor
     int elementoRemovido = this.elementos[0];
     // Substitui o primeiro elemento do vetor pelo último
     this.elementos[0] = this.elementos[this.tamanho - 1];
     // Decrementa o tamanho do heap
     this.tamanho--;
     // Chama o método descer para ajustar a posição do elemento substituído, se necessário
     descer(0);
     // Retorna o elemento removido
     return elementoRemovido;
 }

 // Método auxiliar que sobe um elemento no heap até encontrar sua posição correta
 private void subir(int indice) {
     // Calcula o índice do pai do elemento
     int pai = (indice - 1) / 2;
     // Repete enquanto o elemento não estiver na raiz e for menor que seu pai
     while (indice > 0 && this.elementos[indice] < this.elementos[pai]) {
         // Troca o elemento com seu pai
         trocar(indice, pai);
         // Atualiza o índice do elemento para o do pai
         indice = pai;
         // Recalcula o índice do pai do elemento
         pai = (indice - 1) / 2;
     }
 }

 // Método auxiliar que desce um elemento no heap até encontrar sua posição correta
 private void descer(int indice) {
     // Calcula os índices dos filhos esquerdo e direito do elemento
     int filhoEsquerdo = 2 * indice + 1;
     int filhoDireito = 2 * indice + 2;
     // Define o menor filho como sendo o esquerdo por padrão
     int menorFilho = filhoEsquerdo;
     // Verifica se o filho direito existe e é menor que o esquerdo
     if (filhoDireito < this.tamanho && this.elementos[filhoDireito] < this.elementos[filhoEsquerdo]) {
         // Se for, define o menor filho como sendo o direito
         menorFilho = filhoDireito;
     }
     // Repete enquanto o menor filho existir e for menor que o elemento
     while (menorFilho < this.tamanho && this.elementos[indice] > this.elementos[menorFilho]) {
         // Troca o elemento com seu menor filho
         trocar(indice, menorFilho);
         // Atualiza o índice do elemento para o do menor filho
         indice = menorFilho;
         // Recalcula os índices dos filhos esquerdo e direito do elemento
         filhoEsquerdo = 2 * indice + 1;
         filhoDireito = 2 * indice + 2;
         // Verifica novamente se o filho direito existe e é menor que o esquerdo
         if (filhoDireito < this.tamanho && this.elementos[filhoDireito] < this.elementos[filhoEsquerdo]) {
             // Se for, define o menor filho como sendo o direito
             menorFilho = filhoDireito;
         } else {
             // Se não for, define o menor filho como sendo o esquerdo
             menorFilho = filhoEsquerdo;
         }
     }
 }

 // Método auxiliar que troca dois elementos de posição no vetor
 private void trocar(int i, int j) {
     // Armazena temporariamente o elemento na posição i
     int temp = this.elementos[i];
     // Coloca o elemento na posição j na posição i
     this.elementos[i] = this.elementos[j];
     // Coloca o elemento temporário na posição j
     this.elementos[j] = temp;
 }

 // Método que retorna o tamanho do heap
	public int getTamanho() {
		return tamanho;
	}
}