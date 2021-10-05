//the resource br is opened but not closed.
public class CloseReader {
        public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt"));
                System.out.println(br.readLine());
                // ...
        }
}


//nested class instance creation expressions of Readers or InputStreams are not safe to use if the constructor of the outer expression may throw an exception. In the following example, the InputStreamReader may throw an exception, in which case the inner FileInputStream is not closed.

public class CloseReaderNested {
        public static void main(String[] args) throws IOException {
                InputStreamReader reader = null;
                try {
                        // InputStreamReader may throw an exception, in which case the ...
                        reader = new InputStreamReader(
                                        // ... FileInputStream is not closed by the finally block
                                        new FileInputStream("C:\\test.txt"), "UTF-8");
                        System.out.println(reader.read());
                }
                finally {
                        if (reader != null)
                                reader.close();
                }
        }
}