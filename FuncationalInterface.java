
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

 

public class FuncationalInterface {
    public static void main(String[] args) {
       func f1=(x,y)->x+y;
       Predicate<Integer> p1=x->x%2==0;
       Function<Integer,Integer> doubleIt= x->x*2;
       Function<Integer,Integer> tripleIt= x->x*3;
       Function<Integer,Integer> identity= Function.identity();
      
       Consumer<Integer> print= x-> System.out.println(x);
       Supplier<String> s1=()->"Hello";

    //    System.out.println(f1.add(2,3));
    //    System.out.println(p1.test(7));
    //    System.out.println(p1.and(p1).test(8));
    //    System.out.println(doubleIt.apply(5));
    //    System.out.println(tripleIt.andThen(doubleIt).apply(5));
    //    System.out.println(identity.apply(5));
    //    print.accept(5);
    //    System.out.println(s1.get());


    BiPredicate <Integer,Integer> b1=(x,y)->x>y;
    System.out.println(b1.test(5, 3));

    BiConsumer<Integer,Integer> b2=(x,y)->System.out.println(x+y);
    b2.accept(5,10);

    UnaryOperator<Integer> sqr=(m)->m*m;
    System.out.println(sqr.apply(5));
    

    BinaryOperator<Integer> add=(x,y)->x+y;
    System.out.println(add.apply(5, 10));
    List<String> names=List.of("A","B","C","D");

    List<Mobileph> phone=names.stream().map(Mobileph::new).collect(Collectors.toList());




}
} 
interface func{
    int add(int x,int y);
}

class Mobileph{
    String name;
    public Mobileph(String name) {
        this.name = name;
    }
}
