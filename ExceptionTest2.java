public class ExceptionTest2 {
    public static void main(String[] args) {
        System.out.println("Begin main");
        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.processFiles();
        System.out.println("End main");

    }
}
class FileProcessor
{
    void processFiles() {
        try {
            double value = Math.random();
            System.out.println("random value " + value);
            System.out.println("Opening file1");
            System.out.println("Opening file2");
            System.out.println("Opening file3");

            System.out.println("\tProcessing file1");
            if (value > 0.30) {
                RuntimeException someProblem1 = new RuntimeException("Some problem while processing file1....");
                throw someProblem1; //it will exit from this code
            }

            System.out.println("\tProcessing file2");
            if (value > 0.60) {
                RuntimeException someProblem2 = new RuntimeException("Some problem while processing file2....");
                throw someProblem2;
            }

            System.out.println("\tProcessing file3");
            if (value > 0.90) {
                RuntimeException someProblem3 = new RuntimeException("Some problem while processing file3....");
                throw someProblem3;
            }
        }
        finally { //this block would be called regardless exception
            System.out.println("Closing file1");
            System.out.println("Closing file2");
            System.out.println("Closing file3");
        }
    }
}
