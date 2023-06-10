class MyBase{
    int a=12;
    final int b=34;
    static int c=86;
    public void show(){
        System.out.println("In MyBase show");
    }
}
class MyDerive extends MyBase{
    public void show(){
        super.a=44;
        super.c=66;
        System.out.println("In MyDerive show");
    }
}
public class overriding {
    public static void main(String[] args){
        MyDerive derive = new MyDerive();
        derive.show();
        System.out.println("..............");
        MyBase base =new MyDerive();
        base.show();
    }
}
