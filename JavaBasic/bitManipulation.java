public class bitManipulation {
    public static void main(String[] args) {

        // Get bit
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        int getBit = n & bitMask;
        if (getBit == 0) {
            System.out.println("The bit was zero");
        } else {
            System.out.println("The bit was one");
        }

        // Set bit
        // set bit to one at any position
        int n2 = 5; // 0101 -> 5
        int pos2 = 1;
        int bitMask2 = 1 << pos2;
        int newBit2 = n2 | bitMask2; // 0111 -> 7
        System.out.println(newBit2);

        // Clear bit
        int n3 = 5; // 0101 -> 5
        int pos3 = 2;
        int bitMask3 = ~(1 << pos3);
        int newBit3 = n3 & bitMask3; // 0001
        System.out.println(newBit3);

        // Update bit
        // Update bit is a combination of set bit and clear bit

    }
}
