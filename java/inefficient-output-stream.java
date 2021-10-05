//a subclass of OutputStream that simply wraps a DigestOutputStream to confirm that the data it writes to a file has the expected MD5 hash. Without an implementation of write(byte[] b, int off, int len) this will be very slow, because it makes a call to DigestOutputStream.write(byte b) and FileOutputStream.write(byte b) for each byte written.

public class DigestCheckingFileOutputStream extends OutputStream {
        private DigestOutputStream digest;
        private byte[] expectedMD5;
        public DigestCheckingFileOutputStream(File file, byte[] expectedMD5)
                throws IOException, NoSuchAlgorithmException {
                        this.expectedMD5 = expectedMD5;
                        digest = new DigestOutputStream(new FileOutputStream(file),
                                                                                        MessageDigest.getInstance("MD5"));
                }
        @Override
        public void write(int b) throws IOException {
                digest.write(b);
        }
        @Override
        public void close() throws IOException {
                super.close();
                digest.close();
                byte[] md5 = digest.getMessageDigest().digest();
                if (expectedMD5 != null && !Arrays.equals(expectedMD5, md5)) {
                        throw new InternalError();
                }
        }
}
