public class MakeTurtle {

    public static void make()
    {
        Turtle t = new Turtle();
        Turtle.bgcolor("lightblue");
        t.penColor("red");
        t.width(10);
        for (int i = 0; i < 200; i++)
        {
            t.forward(10);
            t.left(10);
        }
    }

}

