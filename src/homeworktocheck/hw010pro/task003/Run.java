package homeworktocheck.hw010pro.task003;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Белоголовый орлан", 2, 30.5, 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;

        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;

        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            outputStream = new ObjectOutputStream(byteArrayOutputStream);

            outputStream.writeObject(eagle);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            inputStream = new ObjectInputStream(byteArrayInputStream);

            Eagle cloneEagle = (Eagle) inputStream.readObject();

            System.out.println("Оригинальный объект: ");
            System.out.println(eagle);
            System.out.println("Клонированный объект: ");
            System.out.println(cloneEagle);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}