package creational.builder;

public class Main {
    public static void main(String[] args) {
//        User user = new User.Builder()
//                .setName("Ali")
//                .setEmail("najimovm11@gmail.com")
//                .build();
//        System.out.println(user.toString());


        Pizza pizza = new Pizza.Builder("Large")
                .addCheese()
                .addBacon()
                .addExtraSauce()
                .build();
        System.out.println(pizza);
    }
}
