public void sayHello(String world) {
        // AVOID
        String message = new String("hello ");
        // AVOID
        message = new String(message + world);
        // AVOID
        System.out.println(new String(message));
}