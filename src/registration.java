class Test
{
    Test()
    {
        System.out.println("Registration process of student");
    }
    Test(String name, String address)
    {
        System.out.println("Name is:" + name);
        System.out.println("Address is:" +address);
    }
    Test( double phone,  double adhar, double parentphone)
    {
        System.out.println("Phone number is:" + phone);
        System.out.println("Adhar number is:" + adhar);
        System.out.println("Parent phone number is:" + parentphone);
    }
}
public class registration {
    public static void main(String[] args){
        Test t1 = new Test();
        Test t2 = new Test("Saumya","Ahmedabad");
        Test t3 = new Test(9016,1234,7020);
    }
}
