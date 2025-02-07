import java.lang.*;
import java.util.*;
import java.io.*;

public class Account {
    private String username, password, phn, email;
    private File file;
    private FileWriter fileWriter;
    private Scanner sc;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account(String username, String password, String phn, String email) {
        this.username = username;
        this.password = password;
        this.phn = phn;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPhn() {
        return this.phn;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void addInfo() {
        try {
            file = new File("./files/info.txt");
            file.createNewFile();
            fileWriter = new FileWriter(file, true);
            fileWriter.write(getUsername() + "\t");
            fileWriter.write(getPhn() + "\t");
            fileWriter.write("   " + getEmail() + "\t");
            fileWriter.write(getPassword() + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public void addAccount() {
        try {
            file = new File("./files/acc.txt");
            file.createNewFile();
            fileWriter = new FileWriter(file, true);
            fileWriter.write(getUsername() + "\t");
            fileWriter.write(getPassword() + "\n");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    public boolean checkAccount() {
        boolean flag = false;
        file = new File("./files/acc.txt");
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] value = line.split("\t");
                if (value[0].equals(username) && value[1].equals(password)) {
                    flag = true;
                    break;
                }
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
        return flag;
    }
}