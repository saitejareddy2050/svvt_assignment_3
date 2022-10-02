import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTestSaiteja {
    Saiteja ob = new Saiteja();
    //Test-1
    @Test
    public void testBinarySearchNotInNums() {
        int[] nums = {1, 2, 3, 4, 5};
        int result = ob.search(nums, 6);
        Assertions.assertEquals(-1,result);
    }

    //Test-2
    @Test
    public void testBinarySearchFoundInNums() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, 5);
        Assertions.assertEquals(4,result);
        // If its false then error is reported
    }

    //Test-3
    @Test
    public void testBinarySearchForStartingTarget() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, 1);
        Assertions.assertEquals(0,result);
        // If its false then error is reported
    }

    //Test-4
    @Test
    public void testBinarySearchForEndTarget() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, 7);
        Assertions.assertEquals(6,result);
        // If its false then error is reported
    }

    //Test-5
    @Test
    public void testBinarySearchForNegativeNotinNums() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, -3);
        Assertions.assertEquals(-1,result);
        // If its false then error is reported
    }

    //Test-6
    @Test
    public void testBinarySearchForZero() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, 0);
        Assertions.assertEquals(-1,result);
        // If its false then error is reported
    }

    //Test-7
    @Test
    public void testBinarySearchForNegative() {
        int[] nums = {-7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, -2);
        Assertions.assertEquals(5,result);
        // If its false then error is reported
    }

    //Test-8
    @Test
    public void testBinarySearchForDuplicates() {
        int[] nums = {1, 2, 2, 3, 4, 5, 6, 7};
        int result = ob.search(nums, 2);
        //Should print first number of duplicate index value
        Assertions.assertEquals(1,result);
        // If its false then error is reported
    }

    //Test-9
    @Test
    public void testBinarySearchForOddNumbers() {
        int[] nums = {2, 3, 5, 7, 9, 11, 13};
        int result = ob.search(nums, 9);
        Assertions.assertEquals(4,result);
        // If its false then error is reported
    }

    //Test-10
    @Test
    public void testBinarySearchForWholeNumbers() {
        int[] nums = {2, 3, 5, 7, 11, 13, 17, 19, 22};
        int result = ob.search(nums, 4);
        Assertions.assertEquals(-1,result);
        // If its false then error is reported
    }

    //Test-11
    @Test
    public void testBinarySearchForNotInNegativeNumbers() {
        int[] nums = {-2, -3, -5, -7, 11, 13, 17, 19, 22};
        int result = ob.search(nums, -4);
        Assertions.assertEquals(-1,result);
        // If its false then error is reported
    }
}
