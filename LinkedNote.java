/**
 * Created by Fisher on 25.05.2016.
 */
public class LinkedNote <T> {
    Note first;

     public LinkedNote () {
            this.first = null;
            }

     public boolean isEmpty() {
        return  (first == null);
    }

     public void add(T data) {
         Note newNote = new Note(data);

         if (isEmpty() == true) {
             first = newNote;
         } else {
             Note current = first;
             Note previos = null;

             while (current != null) {
                 previos = current;
                 current = current.next;
             }
             previos.next = newNote;
         }
     }

    public T get (int n) {
        Note current = first;
        int count = 1;
        while (current != null) {
            if (count != n) {
                current = current.next;
                count++;
            } else {
                return current.data;
            }
        }
        return null;
    }

    public void delete(T data) {
         Note current = first;
         Note previos = null;
         while (current != null) {
             if (current.data.equals(data)) {
              previos.next = current.next;
             }
         previos = current;
         current = current.next;
         }
     }

    public void print() {
         System.out.println("Список элементов:");
         Note current = first;
         while (current != null) {
                current.printNote();
                current = current.next;
            }
         System.out.println("");
        }

public class Note {
    T data;
    Note next;

    public Note(T data) {
        this.data = data;
        this.next = null;
    }

    public void printNote() {
        System.out.println(data.toString());
    }
    }
}

