package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class countCharacterTest {
    @Test
    public void testNodeCoverage(){
        // Test case to achieve 100% node coverage
        char[] array = {'a'};
        char target = 'a';
        int expected = 1;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }

    @Test
    public void testEdgeCoverage(){
        // Test cases to achieve 100% edge coverage
        char[] array1 = {'a', 'b', 'a', 'c', 'd', 'a'};
        char target1 = 'a';
        int expected1 = 3;
        int actual1 = countCharacter.countOccurrences(array1, target1);
        assertEquals(expected1, actual1);

        char[] array2 = {'a', 'b', 'c', 'd'};
        char target2 = 'e';
        int expected2 = 0;
        int actual2 = countCharacter.countOccurrences(array2, target2);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testEdgePairCoverage(){
        // Test cases to achieve 100% edge-pair coverage
        char[] array3 = {'a', 'b', 'a', 'c', 'd', 'a'};
        char target3 = 'a';
        int expected3 = 3;
        int actual3 = countCharacter.countOccurrences(array3, target3);
        assertEquals(expected3, actual3);

        char[] array4 = {'a', 'b', 'c', 'd'};
        char target4 = 'e';
        int expected4 = 0;
        int actual4 = countCharacter.countOccurrences(array4, target4);
        assertEquals(expected4, actual4);
    }
}
class PrimePaths {
    //The following tests prime paths 1,2,3,4
    @Test
    public void testPrimePath_1() {
        char[] array = {'a'};
        char target = 'a';
        int expected = 1;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }

    //The following tests prime paths 1,2,3,5
    @Test
    public void testPrimePath_2() {
        char[] array = {'b'};
        char target = 'a';
        int expected = 0;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }

    //The following tests prime paths 2,3,5,2
    @Test
    public void testPrimePath_3() {
        char[] array = {'a', 'b'};
        char target = 'a';
        int expected = 1;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }

    //The following tests prime paths 3,4,5,6
    @Test
    public void testPrimePath_4() {
        char[] array = {'a', 'b', 'a'};
        char target = 'a';
        int expected = 2;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }

    //The following tests prime paths [3,4,5,2], [3,5,2,3] [3,5,6,7], [4,5,6,7], [4,5,2,3], [5,2,3,5], [5,2,3,4,5]
    @Test
    public void testPrimePath_5() {
        char[] array = {'a', 'b', 'a'};
        char target = 'b';
        int expected = 1;
        int actual = countCharacter.countOccurrences(array, target);
        assertEquals(expected, actual);
    }
}
