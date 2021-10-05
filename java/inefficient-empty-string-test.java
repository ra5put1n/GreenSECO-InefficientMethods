// Inefficient version
class InefficientDBClient {
        public void connect(String user, String pw) {
                if (user.equals("") || "".equals(pw))
                        throw new RuntimeException();
        }
}
