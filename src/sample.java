public class sample
{
    String s ;
    String second ;
    sample(String s)
    {
        this.s = s ;
    }
    String getS()
    {
        return s;
    }

    public static void main(String[] args)
    {
        sample obj = new sample("Abhigyan") ;
        System.out.println(obj.getS());
        System.out.println(obj.second);

    }

}
