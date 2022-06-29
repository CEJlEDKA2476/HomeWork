package com.company.collections;

import java.util.HashMap;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("abc1", "bda1");
        Book book2 = new Book("abd2", "bdb2");
        Book book3 = new Book("abe3", "bdc3");
//
//        Book[] massiveBook = new Book[]{
//                book1, book2, book3
//        };
//
//        for(int i = 0; i <= 2; i++){
//            massiveBook[i].getName();
//        }
//
//        ArrayList<Book> arrayList = new ArrayList<>();
//        arrayList.add(book1);
//        arrayList.add(arrayList.size() - 1, book1 );
//        arrayList.get(0);
//        arrayList.remove(book1);


//
//        LinkedList<Book> linkedList = new LinkedList<>();
//        linkedList.add(book1);
//        linkedList.get(0);
//        linkedList.remove(book1);
//
//        List<Book> list = arrayList;
//        list = linkedList;
//        list.add(book1);


//        HashSet<Book> hashSet = new HashSet<>(arrayList);
//        hashSet.add(new Book("abc1", "bda1"));
//        hashSet.add(new Book("abc2", "bda2"));
//        hashSet.add(new Book("abc3", "bda3"));


//        for(Book str:hashSet){
//            System.out.println("str = " + str + " Hash = " + str.hashCode());
//        }

//        hashSet.add(new Book("abc2", "bda2"));
//        System.out.println("***");
//        for(Book str:hashSet){
//            System.out.println("str = " + str + " Hash = " + str.hashCode());
//        }

        Hashtable<Integer, Book> hashtable = new Hashtable<>();
        hashtable.put(0, book1);
        hashtable.get(0);

        HashMap<String, Book> hashMap = new HashMap<>();
        hashMap.put("0", book1);
        hashMap.put("1", book2);
        hashMap.put("2", book3);


    }
}
