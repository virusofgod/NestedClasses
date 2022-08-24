package nested_classes.inner_classes;

public class Parcel {
    private String recepient;
    private int mass;



    class Destination{
        private int roomNumber;
        private String street;
        private int homeNumber;
        private static int a;

        enum Abc{
            a,b,c;
        }
        public void doSmth(){
            System.out.println(mass);

        }
    }


}