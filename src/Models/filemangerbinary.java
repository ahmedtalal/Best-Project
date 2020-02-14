package Models;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class filemangerbinary implements Serializable {
    public boolean write(String FilePath, Object data) {
        try (ObjectOutputStream writter = new ObjectOutputStream(new FileOutputStream(FilePath))) {
            writter.writeObject(data);
            writter.close();
        } catch (IOException e) {
        }
        return true;
    }
    public Object read(String FilePath) {
        Object Result = null;
        File file = new File(FilePath);
        try {
            if (file.exists() == false) {
                file.createNewFile();
                return null;
            }

            try (ObjectInputStream Reader = new ObjectInputStream(new FileInputStream(FilePath))) {
                Result = Reader.readObject();
                Reader.close();
            }
        } catch (IOException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(filemangerbinary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Result;
    }
}
