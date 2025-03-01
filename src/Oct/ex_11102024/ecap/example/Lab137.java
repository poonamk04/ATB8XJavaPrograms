package Oct.ex_11102024.ecap.example;

public class Lab137 {
    public static void main(String[] args) {
        ICICIBank poonam = new ICICIBank("poonam",100);
        //poonam.setBal(100000);
        //admin
        boolean are_yoy_admin = true;

        ICICIBank admin = new ICICIBank("admin",1000);
        admin.setBal(500000,true);
        System.out.println(admin.getName());
        System.out.println(admin.getBal());


    }
}
