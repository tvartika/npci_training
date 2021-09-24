package com.company;

import java.util.*;

public class Main {
    int Id;
    String Name;
    public Main(Integer Id, String Name)
    {
        this.Id = Id;
        this.Name = Name;
    }
    public Integer getId(){return Id;}
    public void setId(Integer Id) {this.Id = Id;}
    public String getName(){return Name;}
    public void setName(String Name) {this.Name = Name;}

    @Override
    public String toString()
    {
        return "Employee (Id: " +Id+ ", Name: " +Name+ ")";
    }
    static class  Sorting implements Comparator<Main>{
        @Override
        public  int compare(Main C1, Main C2)
        {
            int IdCompare = C1.getId().compareTo(C2.getId());
            int NameCompare = C1.getName().compareTo(C2.getName());

            return  (IdCompare == 0)? NameCompare:IdCompare;
        }
    }

    public static void main(String[] args) {
        List<Main> L1 = new ArrayList<>();
        Main obj1 = new Main(15, "Adam");
        Main obj2 = new Main(12, "John");
        Main obj3 = new Main(15, "Eva");
        Main obj4 = new Main(13, "Peter");
        Main obj5 = new Main(13, "Dave");
        Main obj6 = new Main(17, "Ron");

        L1.add(obj1);
        L1.add(obj2);
        L1.add(obj3);
        L1.add(obj4);
        L1.add(obj5);
        L1.add(obj6);

        Iterator<Main> empIterator = L1.iterator();
        System.out.println("Inital: ");
        while (empIterator.hasNext()) {
            System.out.println((empIterator.next()));
        }
        Collections.sort(L1, new Sorting());

        System.out.println(("\n Sorted:\n"));
        for (Main employee :L1) {
            System.out.println(employee);
        }
    }

