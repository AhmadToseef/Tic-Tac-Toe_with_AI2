import java.util.*;

class AsciiCharSequence implements CharSequence/* extends/implements */ {
    private final byte[] byteStream;
    public AsciiCharSequence(byte[] byteStream) {
        this.byteStream = byteStream;
    }
    @Override
    public int length() {
        return byteStream.length;
    }

    @Override
    public char charAt(int i) {
        return (char) byteStream[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        try {
            return byteStream.toString().substring(i, i1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (CharSequence) new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        String result = "";
        for (byte b : byteStream) {
            result += (char)b;
        }
        return result;
    }
    // implementation


}