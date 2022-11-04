package week2;

public class PriorityQueue <T>{
    //elemanlar nasıl tutulsun.
    // burası ana sınıf ekleme çıkarma burada


    // iki node tutalım
    private  Node<T> head;
    private Node<T> tail;

    int size =0;
    // ekleme cıkarma sınırlarında bunu kullanabiliriz
    // eklerken ++
    // çıkartırken -- gibi.


    public void add(T ob, Priority priority){
        // t tipinde ki obje que' ekle
        Node<T> node = new Node<>(ob ,null,null,priority);
        if (head == null){
            head =node;
            tail = node;
            // null olırsa aynı şeyleri gösterecek.
        }else {

            // priority check
            if (tail.getPriority().getValue()>= node.getPriority().getValue()){
                // düşük se sola doğrı
                tail.setNext(node);
                node.setPrev(tail);
                tail=node;

            }else {
                // iterasyon yapılaak
                Node<T> tempNode =tail.getPrev();
                // geriye doğru gitmek içi
                while (tempNode.getPrev()!=null){
                    if (tempNode.getPriority().getValue()>= node.getPriority().getValue()){
                        node.setNext(tempNode.getNext());
                        tempNode.setNext(node);
                        node.setPrev(tempNode);
                        node.getNext().setPrev(node);
                        break;
                    }
                    tempNode = tempNode.getPrev();
                    // burada geriye doğru gidiyoruz.


                }
            }


        }

        // şimd ilişkinin yönünü değiştirircez



    }
    public  T peek(){
        if (head == null){
            return  null;
        }
            return head.getValue();

    }

    public  T pop(){
        if (head == null){

            return  null;
        }

        Node<T> temp =head;

        head= temp.getNext();
        if (head==null){
            tail=null;
            // head boş ise eleman kalmamıştır
            // aama normalde referasn kullanılıyorudı tail de
            // yani tailde son popun referansı vardı
            // biz onu da null hale getirdik.

        }

        return temp.getValue();

    }

}
