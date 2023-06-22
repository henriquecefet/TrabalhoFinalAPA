package Codigo;
//Classe que representa uma lista encadeada genérica
public class ListaEncadeada<T> {
 // Atributos que armazenam o primeiro e o último nó da lista, e o seu tamanho
 private No<T> primeiro;
 private No<T> ultimo;
 private int tamanho;

 // Construtor que inicializa os atributos com valores padrão
 public ListaEncadeada() {
     this.primeiro = null;
     this.ultimo = null;
     this.tamanho = 0;
 }

 // Método que adiciona um elemento no final da lista
 public void adicionar(T elemento) {
     // Cria um novo nó com o elemento passado como parâmetro
     No<T> novoNo = new No<>(elemento);
     // Verifica se a lista está vazia
     if (this.primeiro == null) {
         // Se estiver, o novo nó é o primeiro e o último da lista
         this.primeiro = novoNo;
         this.ultimo = novoNo;
     } else {
         // Se não estiver, o novo nó é inserido após o último nó da lista
         this.ultimo.setProximo(novoNo);
         this.ultimo = novoNo;
     }
     // Incrementa o tamanho da lista
     this.tamanho++;
 }

 // Método que recupera um elemento da lista dada uma posição
 public T recuperar(int posicao) {
     // Verifica se a posição é válida
     if (posicao < 0 || posicao >= this.tamanho) {
         // Se não for, lança uma exceção
         throw new IllegalArgumentException("Posição inválida");
     }
     // Cria uma variável para percorrer a lista a partir do primeiro nó
     No<T> atual = this.primeiro;
     // Repete até chegar na posição desejada
     for (int i = 0; i < posicao; i++) {
         // Avança para o próximo nó da lista
         atual = atual.getProximo();
     }
     // Retorna o elemento do nó atual
     return atual.getElemento();
 }

 // Método que apaga um elemento da lista dada uma posição
 public void apagar(int posicao) {
     // Verifica se a posição é válida
     if (posicao < 0 || posicao >= this.tamanho) {
         // Se não for, lança uma exceção
         throw new IllegalArgumentException("Posição inválida");
     }
     // Verifica se a posição é a primeira da lista
     if (posicao == 0) {
         // Se for, faz o primeiro nó apontar para o próximo nó da lista
         this.primeiro = this.primeiro.getProximo();
         // Verifica se a lista tem apenas um elemento
         if (this.tamanho == 1) {
             // Se tiver, faz o último nó apontar para null também
             this.ultimo = null;
         }
     } else {
         // Se não for, cria uma variável para percorrer a lista a partir do primeiro nó
         No<T> anterior = this.primeiro;
         // Repete até chegar na posição anterior à desejada
         for (int i = 0; i < posicao - 1; i++) {
             // Avança para o próximo nó da lista
             anterior = anterior.getProximo();
         }
         // Faz o nó anterior apontar para o nó seguinte ao da posição desejada
         anterior.setProximo(anterior.getProximo().getProximo());
         // Verifica se a posição é a última da lista
         if (posicao == this.tamanho - 1) {
             // Se for, faz o último nó apontar para o nó anterior
             this.ultimo = anterior;
         }
     }
     // Decrementa o tamanho da lista
     this.tamanho--;
 }

 // Método que retorna o tamanho da lista
 public int getTamanho() {
     return tamanho;
 }

 // Classe interna que representa um nó da lista encadeada
 private static class No<T> {
     // Atributos que armazenam o elemento e o próximo nó da lista
     private T elemento;
     private No<T> proximo;

     // Construtor que recebe o elemento e inicializa o próximo nó com null
     public No(T elemento) {
         this.elemento = elemento;
         this.proximo = null;
     }

     // Método que retorna o elemento do nó
     public T getElemento() {
         return elemento;
     }

     // Método que altera o elemento do nó
     public void setElemento(T elemento) {
         this.elemento = elemento;
     }

     // Método que retorna o próximo nó da lista
     public No<T> getProximo() {
         return proximo;
     }

     // Método que altera o próximo nó da lista
     public void setProximo(No<T> proximo) {
         this.proximo = proximo;
     }
 }
}