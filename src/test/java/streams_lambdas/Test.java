package streams_lambdas;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class Test 
    extends TestCase
{
    
    public Test( String testName )
    {
        super( testName );
    }

    public static TestSuite suite()
    {
        return new TestSuite( Test.class );
    }

    public void testApp()
    {
        assertTrue( true );
    }
}