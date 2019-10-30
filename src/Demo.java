public class Demo {
    public static void main(String[] args) {
        String key = "secret";
        String message = "This is a secret message";
        System.out.println("Original message: " + message);

        // Encrypt
        String enc = null;
        try {
            enc = EnDecryptor.encrypt(message, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Encrypted message: " + enc);

        // Decrypt
        String dec = null;
        try {
            dec = EnDecryptor.decrypt(enc, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Decrypted message: " + dec);
    }
}
