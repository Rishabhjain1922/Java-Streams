
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;





public class FuncationalInterface {
    public static void main(String[] args) {
       func f1=(x,y)->x+y;
       Predicate<Integer> p1=x->x%2==0;
       Function<Integer,Integer> doubleIt= x->x*2;
       Function<Integer,Integer> tripleIt= x->x*3;
       Function<Integer,Integer> identity= Function.identity();
      
       Consumer<Integer> print= x-> System.out.println(x);
       Supplier<String> s1=()->"Hello";

       System.out.println(f1.add(2,3));
       System.out.println(p1.test(7));
       System.out.println(p1.and(p1).test(8));
       System.out.println(doubleIt.apply(5));
       System.out.println(tripleIt.andThen(doubleIt).apply(5));
       System.out.println(identity.apply(5));
       print.accept(5);
       System.out.println(s1.get());

    }
}
interface func{
    int add(int x,int y);
}
