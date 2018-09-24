package org.apache.commons.collections4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AmplFluentIterableTest {
    private Iterable<Integer> iterableA = null;

    private Iterable<Long> iterableB = null;

    private Iterable<Integer> iterableEven = null;

    private Iterable<Integer> iterableOdd = null;

    private Iterable<Integer> emptyIterable = null;

    @Before
    public void setUp() {
        Collection<Integer> collectionA = new ArrayList<Integer>();
        collectionA.add(1);
        collectionA.add(2);
        collectionA.add(2);
        collectionA.add(3);
        collectionA.add(3);
        collectionA.add(3);
        collectionA.add(4);
        collectionA.add(4);
        collectionA.add(4);
        collectionA.add(4);
        iterableA = collectionA;
        Collection<Long> collectionB = new LinkedList<Long>();
        collectionB.add(5L);
        collectionB.add(4L);
        collectionB.add(4L);
        collectionB.add(3L);
        collectionB.add(3L);
        collectionB.add(3L);
        collectionB.add(2L);
        collectionB.add(2L);
        collectionB.add(2L);
        collectionB.add(2L);
        iterableB = collectionB;
        iterableEven = Arrays.asList(2, 4, 6, 8, 10, 12);
        iterableOdd = Arrays.asList(1, 3, 5, 7, 9, 11);
        emptyIterable = Collections.emptyList();
    }

    private static Predicate<Number> EVEN = new Predicate<Number>() {
        public boolean evaluate(final Number input) {
            return ((input.intValue()) % 2) == 0;
        }
    };

    @Test(timeout = 10000)
    public void factoryMethodOf() throws Exception {
        List<Integer> result = FluentIterable.of(1, 2, 3, 4, 5).toList();
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
        Assert.assertTrue(result.contains(4));
        Assert.assertTrue(result.contains(5));
        List<Integer> o_factoryMethodOf__4 = Arrays.asList(1, 2, 3, 4, 5);
        Assert.assertTrue(o_factoryMethodOf__4.contains(1));
        Assert.assertTrue(o_factoryMethodOf__4.contains(2));
        Assert.assertTrue(o_factoryMethodOf__4.contains(3));
        Assert.assertTrue(o_factoryMethodOf__4.contains(4));
        Assert.assertTrue(o_factoryMethodOf__4.contains(5));
        result = FluentIterable.of(new Integer[0]).toList();
        result.isEmpty();
        final Iterable<Integer> it = null;
        result = FluentIterable.of(it).toList();
        result.isEmpty();
        result.isEmpty();
        Assert.assertTrue(result.isEmpty());
        Assert.assertTrue(o_factoryMethodOf__4.contains(1));
        Assert.assertTrue(o_factoryMethodOf__4.contains(2));
        Assert.assertTrue(o_factoryMethodOf__4.contains(3));
        Assert.assertTrue(o_factoryMethodOf__4.contains(4));
        Assert.assertTrue(o_factoryMethodOf__4.contains(5));
    }

    @Test(timeout = 10000)
    public void collate() throws Exception {
        List<Integer> result = FluentIterable.of(iterableOdd).collate(iterableEven).toList();
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
        Assert.assertTrue(result.contains(4));
        Assert.assertTrue(result.contains(5));
        List<Integer> combinedList = new ArrayList<Integer>();
        Assert.assertTrue(combinedList.isEmpty());
        boolean o_collate__7 = CollectionUtils.addAll(combinedList, iterableOdd);
        Assert.assertTrue(o_collate__7);
        boolean o_collate__8 = CollectionUtils.addAll(combinedList, iterableEven);
        Assert.assertTrue(o_collate__8);
        Collections.sort(combinedList);
        result = FluentIterable.of(iterableOdd).collate(null).toList();
        List<Integer> expected = IterableUtils.toList(this.iterableOdd);
        Assert.assertTrue(expected.contains(1));
        Assert.assertTrue(expected.contains(3));
        Assert.assertTrue(expected.contains(5));
        Assert.assertTrue(expected.contains(7));
        Assert.assertTrue(expected.contains(9));
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(3));
        Assert.assertTrue(result.contains(5));
        Assert.assertTrue(result.contains(7));
        Assert.assertTrue(result.contains(9));
        Assert.assertTrue(combinedList.contains(1));
        Assert.assertTrue(combinedList.contains(2));
        Assert.assertTrue(combinedList.contains(3));
        Assert.assertTrue(combinedList.contains(4));
        Assert.assertTrue(combinedList.contains(5));
        Assert.assertTrue(o_collate__7);
        Assert.assertTrue(o_collate__8);
    }

    @Test(timeout = 10000)
    public void zip() throws Exception {
        List<Integer> result = FluentIterable.of(iterableOdd).zip(iterableEven).toList();
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
        Assert.assertTrue(result.contains(4));
        Assert.assertTrue(result.contains(5));
        List<Integer> combinedList = new ArrayList<Integer>();
        Assert.assertTrue(combinedList.isEmpty());
        boolean o_zip__7 = CollectionUtils.addAll(combinedList, iterableOdd);
        Assert.assertTrue(o_zip__7);
        boolean o_zip__8 = CollectionUtils.addAll(combinedList, iterableEven);
        Assert.assertTrue(o_zip__8);
        Collections.sort(combinedList);
        result = FluentIterable.of(iterableOdd).zip(((Iterable<Integer>) (null))).toList();
        List<Integer> expected = IterableUtils.toList(iterableOdd);
        Assert.assertTrue(expected.contains(1));
        Assert.assertTrue(expected.contains(3));
        Assert.assertTrue(expected.contains(5));
        Assert.assertTrue(expected.contains(7));
        Assert.assertTrue(expected.contains(9));
        result = FluentIterable.of(Arrays.asList(1, 4, 7)).zip(Arrays.asList(2, 5, 8), Arrays.asList(3, 6, 9)).toList();
        combinedList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Assert.assertTrue(result.contains(1));
        Assert.assertTrue(result.contains(2));
        Assert.assertTrue(result.contains(3));
        Assert.assertTrue(result.contains(4));
        Assert.assertTrue(result.contains(5));
        Assert.assertTrue(combinedList.contains(1));
        Assert.assertTrue(combinedList.contains(2));
        Assert.assertTrue(combinedList.contains(3));
        Assert.assertTrue(combinedList.contains(4));
        Assert.assertTrue(combinedList.contains(5));
        Assert.assertTrue(o_zip__7);
        Assert.assertTrue(o_zip__8);
        Assert.assertTrue(expected.contains(1));
        Assert.assertTrue(expected.contains(3));
        Assert.assertTrue(expected.contains(5));
        Assert.assertTrue(expected.contains(7));
        Assert.assertTrue(expected.contains(9));
    }

    @Test(timeout = 10000)
    public void size() throws Exception {
        int o_size__1 = FluentIterable.of(((Iterable<?>) (null))).size();
        Assert.assertEquals(0, ((int) (o_size__1)));
        int o_size__3 = FluentIterable.of(emptyIterable).size();
        Assert.assertEquals(0, ((int) (o_size__3)));
        int o_size__5 = IterableUtils.toList(iterableOdd).size();
        Assert.assertEquals(6, ((int) (o_size__5)));
        int o_size__7 = FluentIterable.of(this.iterableOdd).size();
        Assert.assertEquals(6, ((int) (o_size__7)));
        Assert.assertEquals(0, ((int) (o_size__1)));
        Assert.assertEquals(0, ((int) (o_size__3)));
        Assert.assertEquals(6, ((int) (o_size__5)));
    }
}

