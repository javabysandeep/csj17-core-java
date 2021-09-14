package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Bitwise operators are used to bitwise operation ---> &, |, ^, ~, <<, >>, >>>

        // 1. Bitwise and & will perform bitwise & operation between the bits
        System.out.println(4 & 5); // 4
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        // & -------------
        //        1 0 0

        // 2. Bitwise OR | will perform bitwise | operation between the bits
        System.out.println(4 | 5); // 5
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        // | ------------
        //        1 0 1

        // 3. Bitwise XOR ^ will perform bitwise ^ operation between the bits
        System.out.println(4 ^ 5); // 1
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        // ^ ------------
        //        0 0 1

        // 4. Bitwise left shift << will shift the bits to the left by specified no. of bits
        System.out.println(4 << 1); // 4 * 2^1--> 8
        // 4 ---> 0 1 0 0 --> 1 0 0 0

        // 5. Bitwise right shift << will shift the bits to the right by specified no. of bits
        System.out.println(4 >> 1); // 4 / 2^1--> 2
        // 4 ---> 0 1 0 0 --> 0 0 1 0

        // 5. Bitwise ~ will negate the bits. It is unary operator
        System.out.println(~4); // -(num+1) ---> -5

    }
}
