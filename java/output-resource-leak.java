//In the following example, the resource bw is opened but not closed.

public class CloseWriter {
        public static void main(String[] args) throws IOException {
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\test.txt"));
                bw.write("Hello world!");
                // ...
        }
}

// nested class instance creation expressions of Writers or OutputStreams are not safe to use if the constructor of the outer expression may throw an exception. In the following example, the OutputStreamWriter may throw an exception, in which case the inner FileOutputStream is not closed.

public class CloseWriterNested {
        public static void main(String[] args) throws IOException {
                OutputStreamWriter writer = null;
                try {
                        // OutputStreamWriter may throw an exception, in which case the ...
                        writer = new OutputStreamWriter(
                                        // ... FileOutputStream is not closed by the finally block
                                        new FileOutputStream("C:\\test.txt"), "UTF-8");
                        writer.write("Hello world!");
                }
                finally {
                        if (writer != null)
                                writer.close();
                }
        }
}