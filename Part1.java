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
    }

    public class A implements Comparable<A> {
        Integer a;

        A(Integer x) {
            this.a = x;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
