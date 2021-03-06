import org.junit.Test;
import org.junit.*; // before after ...
import static org.junit.Assert.assertEquals;

public class TestStack {
    private static Stack stack;

    @BeforeClass
    public static void beforeClass() {
        stack = new Stack();
    }

    @Before
    public void before() {
        // initial some node in stack structure
        stack.push(3);
        stack.push(2);
    }

    @After
    public void after() throws Exception {
        // clean all node in stack
        while (stack.size() != 0) {
            stack.pop();
        }
        // try to create some exception
	//stack.pop();
    }

    @AfterClass
    public static void afterClass() {
        stack = null;
    }

    @Test
    public void CaseInt() throws Exception {
        int value = 0xc8763;
        stack.push(value);
        assertEquals(value, stack.pop());
    }

    @Test
    public void CaseMagic() throws Exception {
        String magic = "c8763";
        stack.push(magic);
	assertEquals(magic, stack.pop());
    }
}
