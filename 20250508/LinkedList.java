public class LinkedList<T> {
    private Node<T> head; //referencia para o primeiro nó da lista

    public LinkedList(){
        this.head = null;
    }

    public void addFirst(T data){
        Node<T> novoNo = new Node<T>(data);
        novoNo.next = head;
        head = novoNo;
    }

    public void addLast(T data) {
        Node<T> novoNo = new Node<T>(data);
        if(head == null) {
            head = novoNo;
        } else {
            Node<T>atual = head;
            while(atual.next!=null){
                atual = atual.next;
            }
            atual.next=novoNo;
        }
    }

    public boolean remove(T data){
        if (head == null) {
            return false;
        }
        if(head == data){
            head = head.next;
            return true;
        }
        Node<T> atual=head;
        Node<T> anterior = null;
        while (atual !=null && atual.data != data){
            anterior = atual;
            atual=atual.next;
        }

        

        return false;
    }

}
