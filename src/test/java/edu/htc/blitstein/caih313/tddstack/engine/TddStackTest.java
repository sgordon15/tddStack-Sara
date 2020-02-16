package edu.htc.blitstein.caih313.tddstack.engine;

import edu.htc.blitstein.caih313.tddstack.resource.campus.Faculty;
import edu.htc.blitstein.caih313.tddstack.IStackable;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class TddStackTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testPublicConstructor() {
        TddStack firstStack = new TddStack();
        assertEquals(100, TddStack.DEFAULT_DEPTH);
    }

    @Test
    public void testIsEmpty() {
        TddStack firstStack = new TddStack();
        assertEquals(true, TddStack.isEmpty());

    }

    @Test
    public void testIsFull() {
        TddStack firstStack = new TddStack();
        assertEquals(false, TddStack.isFull());
    }

    @Test
    public void testPop() {
        TddStack firstStack = new TddStack();
        assertNull(firstStack);
    }

    @Test
    public void testPushThenNotEmpty() {
        TddStack firstStack = new TddStack();
        IStackable iStackable1 = new Faculty();
        firstStack.push(iStackable1);
        assertEquals(false, firstStack.isEmpty());
    }

    @Test
    public void testFullWithThree() {
        TddStack firstStack = new TddStack(3);
        IStackable iStackable1 = new Faculty();
        firstStack.push(iStackable1);
        IStackable iStackable2 = new Faculty();
        firstStack.push(iStackable2);
        IStackable iStackable3 = new Faculty();
        firstStack.push(iStackable3);
        assertEquals(true, firstStack.isFull());
    }

    @Test
    public void testPopIsPush() {
        TddStack tddStack = new TddStack();
        //Faculty implements IStackable
        IStackable iStackableOrig = new Faculty();
        tddStack.push(iStackableOrig);
        IStackable iStackablePopped = tddStack.pop();
        assertEquals(iStackableOrig, iStackablePopped);
    }
}














