package ru.job4j.oop;

        import org.junit.Test;

        import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax123Then3() {
        int result = Max.max(1, 2,3);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1234Then4() {
        int result = Max.max(1, 2,3, 4);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }
}