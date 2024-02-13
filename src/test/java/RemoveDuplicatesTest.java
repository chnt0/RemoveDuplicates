import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @org.junit.jupiter.api.Test
    void removeStringDuplicates() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();

        // Test case 1: String with duplicates
        String input1 = "aabbcc";
        String expected1 = "abc";
        assertEquals(expected1, removeDuplicates.removeStringDuplicates(input1));

        // Test case 2: String without duplicates
        String input2 = "abcdef";
        String expected2 = "abcdef";
        assertEquals(expected2, removeDuplicates.removeStringDuplicates(input2));

        // Test case 3: Empty string
        String input3 = "";
        String expected3 = "";
        assertEquals(expected3, removeDuplicates.removeStringDuplicates(input3));

        // Test case 4: String with mixed case duplicates
        String input4 = "AAaBBbCCc";
        String expected4 = "AaBbCc";
        assertEquals(expected4, removeDuplicates.removeStringDuplicates(input4));

        // Test case 5: String with special characters and duplicates
        String input5 = "!@#$%aaaabbbbcccc";
        String expected5 = "!@#$%abc";
        assertEquals(expected5, removeDuplicates.removeStringDuplicates(input5));

        // Test case 6: String with null value
        String input6 = null;
        String expected6 = "";
        assertEquals(expected6, removeDuplicates.removeStringDuplicates(input6));
    }
}