package homeworktocheck.hw010pro.task002;

import java.io.*;

public class Run {
    public static void main(String[] args) {
        Bird bird = new Bird("Страус", 200);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);

            outputStream.writeObject(bird);
            outputStream.flush();
            outputStream.close();

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);

            Bird cloneBird = (Bird) inputStream.readObject();
            inputStream.close();
            cloneBird.setWeight(200.0); // сетером добавил вес птицы, т.к. поле помечено несериализуемым модификатором;

            System.out.println("Оригинальный объект: ");
            System.out.println(bird);
            System.out.println("Клонированный объект: ");
            System.out.println(cloneBird);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}