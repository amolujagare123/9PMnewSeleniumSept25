package TestNG.Demo2;

import org.testng.annotations.*;

public class ClassThree {

    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("******* >> beforeSuite >>");
    }

    @AfterSuite
    public void afterSuite()
    {
        System.out.println("******* >> afterSuite >>");
    }

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }

    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }

    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
