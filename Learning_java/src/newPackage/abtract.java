package newPackage;
interface A{
    void a();
    void b(); 
    void c();
    void d();
}
abstract class B implements A{
    public void c(){
        System.out.println("i am c : ");
    }
}
class M extends B{
    public void a(){
        System.out.println("i am a");
    }
    public void b(){
        System.out.println("i am b");
    }
    public void d(){
        System.out.println("i am d");
    }
}
/*
class honda extends bike{
    int getRateOfInterest(){
        return 7;
    }
}
class ferrari extends honda{
    public ferrari(){
        System.out.println("ferrari iyimidir acep!!!! ");
    }
}
*/
public class abtract {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        //bike b;
        //b = new honda();
        //System.out.println(" 'in the main'>> rate of interest is : "+b.getRateOfInterest());
        //b = new ferrari();
        //System.out.println("oysa herkes oldurur sevdigini corak gonullere ekiliyor ::: <<  m a i n  >>");

    }
}
