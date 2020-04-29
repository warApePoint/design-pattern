package com.warape.designpattern.singleton;


import com.warape.designpattern.singleton.seriable.SeriableSingleton;

import java.io.*;

/**
 *
 */
public class SerializableSingletonTest   {
    public static void main(String[] args) {

        SeriableSingleton s1;
        SeriableSingleton s2 = SeriableSingleton.getInstance();

        FileOutputStream fos;
        try {

            fos = new FileOutputStream("SeriableSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1 == s2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
