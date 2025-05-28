 public class wrapper{
    public static void main(String args[]){
        int x = Integer.parseInt("123");
        Integer x1 = Integer.valueOf("10110",2);
        int y = x1.intValue();
        System.out.println(x);
        System.out.println(y);
    }
}




public class wrapper{
    public static void main(String args[]){
        int x = Integer.parseInt("123");
        Double x1 = Double.valueOf("123");
        double y = x1.doubleValue();
        System.out.println(x);
        System.out.println(y);
    }
}



public class wrapper{
    public static void main(String args[]){
        int x = Integer.parseInt("123");
        System.out.println(x);
        
        Double x1 = Double.valueOf("56");
        double y = x1.doubleValue();
        System.out.println(y);
        
        Integer i1 = Integer.valueOf("1000011",2);
        int z = i1.intValue();
        System.out.println(z);
    }
}
