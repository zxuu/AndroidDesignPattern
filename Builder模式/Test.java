package Builder模式;

public class Test {

    public static void main(String[] args) {

        Builder builder = new MacbookBuilder();

        Director director = new Director(builder);

        director.construct("inter","dell");

        System.out.println("Computer info :"+ builder.creat().toString());
    }



}

#输出
Computer info :computer [mBoard=inter, mDisplay=dell, mOsMac Os X 10.10]
 [Markdown](https://www.jianshu.com/p/e2a2fe3555b9)
