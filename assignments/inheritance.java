class grandfather{
    public void house1(){
        System.out.println("House 1");
    }
}
class father extends grandfather{
    public void house2(){
        System.out.println("House 2");
    }
}
class child extends father{
    public void car1(){
        System.out.println("Car 1");
    }
}
public class heirloom {
    public static void main(String[] args)
    {
        child a = new child();
        a.house1();
        a.house2();
        a.car1();
    }
}

