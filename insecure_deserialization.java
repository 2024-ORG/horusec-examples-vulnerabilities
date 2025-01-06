import java.io.*;

public class InsecureDeserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialized_data"));
        Object obj = ois.readObject();
        ois.close();

        // ... use the deserialized object 
    }

}
