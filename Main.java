
public class Main {

	public static void main(String[] args) {
		// Lambda expression to reverse a string
        StringReverser reverser = (input) -> {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        };

        // Test the lambda expression
        String original = "abracadabraBum";
        String reversed = reverser.reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
	}


