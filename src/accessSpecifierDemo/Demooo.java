package accessSpecifierDemo;

public class Demooo {
    public static void main(String[] args) {

    }

    interface Compilable {
        boolean compile();
    }

    static class JavaProgram implements Compilable {
        private String code;

        public JavaProgram(String code) {
            this.code = code;
        }

        public boolean compile() {
            System.out.println("Compiling Java program...");
            return true;
        }
    }
}

class Main {
    public static void main(String[] args) {
        accessSpecifierDemo.Demooo.JavaProgram program = new accessSpecifierDemo.Demooo.JavaProgram("public class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello, World!\"); } }");

        boolean isCompiled = program.compile();

        if (isCompiled) {
            System.out.println("Java program compiled successfully.");
        } else {
            System.out.println("Java program compilation failed.");
        }
    }
}