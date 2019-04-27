import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Emplo> emplo = new ArrayList<Emplo>();
        for( int a = 0; a < 8 ; a++ )
        {
            Emplo employer = new Emplo(a,"Pracownik"+Integer.toString(a),10+a*100);
            emplo.add(employer);
            System.out.println(emplo.get(a).toString());
        }
    }
}
