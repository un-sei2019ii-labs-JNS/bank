/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;
import java.util.*;
/**
 *
 * @author Juan Sebastian Reina Zamora
 */
//I will implementate the Dikjstra Algorithm

public class Dijkstra {

    static class MinHeap {

    private int[] array;
    private int size;

    public MinHeap() {
        this.array = new int[2];
        this.size = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private int parent(int i) {
        // (i-1) / 2
        return i / 2;
    }

    private int leftChild(int i) {
        // 2i + 1
        return (2*i);
    }

    private int rightChild(int i) {
        // 2i + 2
        return (2*i) + 1;
    }

    private void swap(int i, int j) {
        int tmp = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = tmp;
    }

    private void siftUp(int i) {
        while (i != 0 && this.array[parent(i)] > this.array[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    public void siftDown(int i) {
        int minIndex = i;
        int left = leftChild(i);
        if (left < this.size && this.array[left] < this.array[minIndex]) {
            minIndex = left;
        }
        int right = rightChild(i);
        if (right < this.size && this.array[right] < this.array[minIndex]) {
            minIndex = rightChild(i);
        }
        if (i != minIndex) {
            swap(i, minIndex);
            siftDown(minIndex);
        }
    }

    public void buildHeap(int[] array) {
        this.array = array;
        this.size = array.length;
        for (int i = parent(this.size); i >=0; i--) {
            siftDown(i);
        }
    }

    public void insert(int value) {
        if (this.size == this.array.length) {
            int[] newArray = new int[this.size << 1];
            System.arraycopy(this.array, 0, newArray, 0, this.size);
            this.array = newArray;
        }
        this.array[this.size] = value;
        siftUp(this.size);
        this.size++;
    }

    public int getMin() {
    int min = this.array[1];
     return min;
    }
    
    public int extractMin() {
        if (this.size == 0) {
            throw new NoSuchElementException("No hay elementos");
        }
        int min = this.array[1];
        this.size--;
        this.array[1] = this.array[this.size];
        siftDown(1);

        return min;
    }

    public void changePriority(int i, int p){
    int oldp = this.array[i];
    this.array[i] = p;
    if(p<oldp){
     siftUp(i);
    }else{
     siftDown(i);
    }
    }
    
    public void sort(int[] array) {
        buildHeap(array);
        for (int i = array.length-1; i >= 0; i--) {
            int min = extractMin();
            array[i] = min;
        }
    }

    
    void printar(int[]arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }   
    }
    
    public boolean isEmpty(){
     boolean ans = true;
     if(this.size == 0){ 
     ans = true;
     }else{
      ans = false;
     }
     return ans;
    }
    
    void printHeap(MinHeap heap){
     while(!heap.isEmpty()){
         System.out.print(heap.extractMin()+" ");
     }
    }
}
    
    
    static class GraphNode{
    int id;
    int weight;

        public GraphNode(int id, int weight) {
            this.id = id;
            this.weight = weight;
        }
    }
    
    static class GraphEdge{
    GraphNode initGN;
    GraphNode finalGN;
    int moveCost;

        public GraphEdge(GraphNode initGN, GraphNode finalGN) {
            this.initGN = initGN;
            this.finalGN = finalGN;
            this.moveCost = this.finalGN.weight;
        }
         public GraphNode getInitGN() {
            return initGN;
        }

        public void setInitGN(GraphNode initGN) {
            this.initGN = initGN;
        }

        public GraphNode getFinalGN() {
            return finalGN;
        }

        public void setFinalGN(GraphNode finalGN) {
            this.finalGN = finalGN;
        }

        public int getMoveCost() {
            return moveCost;
        }

        public void setMoveCost(int moveCost) {
            this.moveCost = moveCost;
        }
    }

    static class Graph{
    ArrayList<GraphEdge> edges;
    ArrayList<GraphNode> nodes;
    int Amountnodes;
    
        public  Graph() {
        this.Amountnodes = 0;
        }
    
    public void CreateNodes(int AmountNodes,int[] weights){
      this.nodes = new ArrayList<GraphNode>();
       for(int i = 1 ; i <= AmountNodes;i++){
        nodes.add(new GraphNode(i,weights[i-1]));
       }    
        System.out.println("Nodes Created");
    }
   
     public GraphNode buscarNodoenGrafo(int id){
      int length = this.nodes.size();
      GraphNode ans = new GraphNode(-1,-1);
      for(int i=0;i<length;i++){
       if(nodes.get(i).id == id){
        ans = nodes.get(i);
       }
      }
     return ans;
     }
    
    public void CreateEdges(int AmountNodes,int AmountEdges,int[][] edge){
      this.edges = new ArrayList<GraphEdge>();
      for(int i = 0;i<AmountEdges;i++){
       this.edges.add(new GraphEdge(buscarNodoenGrafo(edge[0][i]),buscarNodoenGrafo(edge[1][i])));  
      } 
    }
    
    public int getPeso(int u, int v){
        int ans = -1;
        for(int i = 0;i<this.edges.size();i++){
          if(this.edges.get(i).initGN.id == u && this.edges.get(i).finalGN.id == v){
           ans = this.edges.get(i).moveCost;
          }
        }
     return ans;   
    }
    }
    
    public static int insertData(int n,Scanner scan){
      System.out.println("Digite el dato a ingresar");
      int data = scan.nextInt();
      if(data>n || data == 0){
      System.out.println("Digite un dato valido");
       data = insertData(n,scan);
      }else{
      }   
     return data;
    }
    
    public static void insertEdges(int[][] edges, int m,int n,Scanner scan){
     for(int i=0;i<m;i++){
       for(int j=0;j<2;j++){
       edges[j][i] = insertData(n,scan);  
      }
     }
    }
    
    public static int[] Dijkstra(Graph graph, int initNodeId){
    int[] dist = new int[graph.nodes.size()+1];
    int[] prev = new int[graph.nodes.size()+1];
    dist[0] = 0;
    prev[0] = 0;
    for(int u = 1;u <= graph.nodes.size();u++){
     dist[u] = Integer.MAX_VALUE;
     prev[u] = 0;
    }
    dist[initNodeId] = 0;
    MinHeap h = new MinHeap(); 
    for(int j = 0;j < graph.nodes.size();j++){
    h.insert(graph.nodes.get(j).weight);
    }
    while(!h.isEmpty()){
    int u = h.extractMin()+22;
    //System.out.println("Peso: "+String.valueOf(u));
     for(int m=0;m<graph.edges.size();m++){
      for(int n=0;n<graph.edges.size();n++){
       if(dist[n] > dist[m] + graph.getPeso(m,n)){
          dist[n] =  dist[m] + graph.getPeso(m,n);
          prev[n] = u;
          h.changePriority(n, dist[n]);
       }
      }
     }
    
    }
    return prev;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite cantidad de vertices");
        int n;
        n = scan.nextInt();
        Graph maingraph = new Graph();
        int[] weights = new int[n];
        for(int i = 0;i<n;i++){
        System.out.println("Digite peso del VERTICE "+String.valueOf(i+1)); 
        weights[i] = scan.nextInt();
        }
        maingraph.CreateNodes(n, weights);
        System.out.println("Digite cantidad de aristas");
        int m = scan.nextInt();
        int[][] edges = new int[2][m];     
        insertEdges(edges,m,n,scan);
        maingraph.CreateEdges(n, m, edges);
        System.out.println("Digite identificador de nodo origen:");
        int q = scan.nextInt();
        System.out.println("LA RUTA MAS CORTA Indicada en pesos desde el segundo nodo de izquierda a derecha hasta el penultimo:");
        System.out.println(Arrays.toString(Dijkstra(maingraph,q)));   
    }  
}
