package Builder模式;

public class Test {

    public static void main(String[] args) {

        Builder builder = new MacbookBuilder();

        Director director = new Director(builder);

        director.construct("inter","dell");

        System.out.println("Computer info :"+ builder.creat().toString());
    }



}
