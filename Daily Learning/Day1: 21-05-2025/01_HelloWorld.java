// A first step into exploring the realm of Java.

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, unknown World!");
    }
}

/*
 * Breakdown:
 *
 * 1. 'public class HelloWorld':
 *    - Declares a public class named HelloWorld.
 *    - In Java, the file name **must match** the public class name exactly (case-sensitive).
 *
 * 2. 'public static void main(String[] args)':
 *    - This is the **entry point** of any standalone Java application.
 *    - 'public' makes it accessible from outside the class.
 *    - 'static' allows the JVM to call it without creating an object of the class.
 *    - 'void' means it returns nothing.
 *    - 'String[] args' allows command-line arguments.
 *
 * 3. 'System.out.println("Hello, unknown World!");':
 *    - 'System' is a built-in class in java.lang.
 *    - 'out' is a static field (PrintStream) that points to standard output (usually the console).
 *    - 'println()' prints the given message and appends a new line.
 *
 *    Note: We're using the full qualified syntax to access system-level output
 *    without needing any custom print utilities — very common in simple Java apps.
 */
