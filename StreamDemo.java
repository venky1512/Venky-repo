import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class StreamDemo
{
    public static void main(String[]args)
    {
        List<Integer>nums=Arrays.asList(4,5,6,1,3);

        Stream<Integer> str=nums.stream();
        Stream<Integer> str1=str.filter(n -> n%2==0);
        Stream<Integer> str2=str1.map(n->n*2);
        str2.forEach(n -> System.out.println(n));
        
        int sum = nums.stream()
                      .filter(n->n%2==0)
                      .reduce(0,(c,e)->c+e); 
        System.out.println(sum);

        Stream<Integer> str3=nums.stream();
        str3.forEach(n->System.out.println(n));

        List<String> products = Arrays.asList("Laptop", "Pen", "Notebook", "Headphones", "Smartphone");

        System.out.println(products);
        
        List<String> str5=products.stream()
                                  .filter(s->s.length()>5)
                                  .map(s->s.toUpperCase())
                                  .sorted()
                                  .toList();

        System.out.println(str5);
    }
}