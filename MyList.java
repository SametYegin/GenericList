package GenericOdev;


import java.util.Arrays;

public class MyList<T>  {
    T[] arr = (T[]) new Object[10];
    static int i = 0; //add metodunda kullanılıyor
    static int j = 0; //substring metodunda kullanılıyor.


    public MyList() {

        this.arr = arr;
    }

    public MyList(int capacity) {
        this.arr = (T[]) new Object[capacity];

    }

    public int size(){
        int count = 0;
        for(T s : arr){
            if(s != null){
                count++;
            }
        }
        return count;
    }


    public int getCapacity(){
        return arr.length;
    }

    public void add(T data){
        arr[i] = data;
        i++;
        //eğer arrayin boyutu bittiyse boyut 2 katına çıkarılacak.
    }

    public T get(int index){
        if(arr[index] != null){
            return arr[index];
        }
        return null;
    }

    public boolean contains(T data){
        for(T j : arr){
            if(j == data){
                return true;

            }
        }
        return false;
    }
    public void set(int index , T data){

        if(arr[index] != null) {
            arr[index] = data;
        }else{
            System.out.println("Null");
        }

    }

    public String toString(){
        return Arrays.toString(arr);
    }

    public int indexOf(T data){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == data){
                return i;

            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        for(int i = arr.length-1; i>-1; i--){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty(){
        for(T j : arr){
            if(j != null){
                return false;
            }
        }
        return true;
    }

    public void clear(){
        for(int i =0; i<arr.length; i++){
            arr[i]= null;

        }
    }

    //toArray ve sublist metotları yapılacak.


}
