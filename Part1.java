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

        @Override
        public int compareTo(A other) {
            return this.getInteger().compareTo(other.getInteger());
        }

        @Override
        public String toString() {
            return (this.getInteger().toString() + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
