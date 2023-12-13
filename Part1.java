import java.util.*;

public class Part1 {
    
    public class SortedList<T extends Comparable<T>> extends ArrayList<T> implements Comparable<SortedList<T>> {
        @Override
        public boolean add(T element) {
            super.add(element);
            Collections.sort(this);
            return true;
        }

        @Override
        public int compareTo(SortedList<T> secondSortedList) {
            int min_size = Math.min(this.size(), secondSortedList.size());

            for(int i = 0; i < min_size; i++)
            {
                int compareBool = this.get(i).compareTo(secondSortedList.get(i));
                if(compareBool != 0)
                    return compareBool; 
            }

            if(this.size() == secondSortedList.size())
                return 0;
            if(this.size() > secondSortedList.size())
                return 1;
            return -1;
        }

        @Override
        public String toString() {
            String mySortedList = "";

            for(int i = 0; i < this.size(); i++)
            {
                mySortedList += (this.get(i).toString() + " ");
            }

            return (mySortedList + '\n');
        }
    }

    public class A implements Comparable<A> {
        Integer a;

        A(Integer x) {
            this.a = x;
        }

        public Integer getInteger() {
            return this.a;
        }

        public Integer getSum() {
            return this.a;
        }

        @Override
        public int compareTo(A other) {
            return this.getInteger().compareTo(other.getInteger());
        }

        @Override
        public String toString() {
            return (this.getInteger().toString() + " ");
        }
    }

    public class B extends A {
        Integer a;
        Integer b;

        B(Integer x, Integer y) {
            super(x);
            this.b = y;
        }

        public Integer getSum() {
            return (this.a + this.b);
        }

        @Override
        public int compareTo(A other) {
            return this.getSum().compareTo(other.getSum());
        }

        @Override
        public String toString() {
            return (a.toString() + " " + b.toString() + " ");
        }
    }

    /*static void test() {
        SortedList<A> c1 = new SortedList<A>();
        SortedList<A> c2 = new SortedList<A>();
        for(int i = 35; i >= 0; i-=5) {
            addToSortedList(c1, new A(i));
            addToSortedList(c2, new B(i+2,i+3));
        }
        
        System.out.print("c1: ");
        System.out.println(c1);
        
        System.out.print("c2: ");
        System.out.println(c2);
    
        switch (c1.compareTo(c2)) {
        case -1: 
            System.out.println("c1 < c2");
            break;
        case 0:
            System.out.println("c1 = c2");
            break;
        case 1:
            System.out.println("c1 > c2");
            break;
        default:
            System.out.println("Uh Oh");
            break;
        }
       }*/

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
