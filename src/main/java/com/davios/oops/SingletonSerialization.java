package com.davios.oops;

import java.io.*;

public class SingletonSerialization {

    public static void main(String... s) throws IOException, ClassNotFoundException {

    Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\MCA\\projects\\mca-source\\mca-feed\\mca-feed-common\\src\\main\\java\\com\\markit\\mca\\alertDAO\\file.ser"));
        outputStream.writeObject(singleton);
        outputStream.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\MCA\\projects\\mca-source\\mca-feed\\mca-feed-common\\src\\main\\java\\com\\markit\\mca\\alertDAOfile.ser"));
        Singleton obj2 = (Singleton) in.readObject();

        System.out.println(singleton.hashCode());
        System.out.println(obj2.hashCode());

}

}
