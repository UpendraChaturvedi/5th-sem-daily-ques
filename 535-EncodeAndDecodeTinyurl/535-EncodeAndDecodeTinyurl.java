// Last updated: 9/4/2025, 12:04:25 PM
public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String l) {
        l="1"+l;
        return l;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String s) {
        return s.substring(1);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));