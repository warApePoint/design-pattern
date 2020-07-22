package com.warape.designpattern.composite.v2;

import com.warape.designpattern.composite.v2.Directory;
import com.warape.designpattern.composite.v2.File;

public class Test {

    /**
     * System.out.println(System.getProperty("user.dir"));/
     * /eg/
     * /warape/a.txt
     * /warape/b.txt
     * /warape/movies/
     * /warape/movies/c.avi
     * <p>
     * /composite/
     * /composite/docs/
     * /composite/docs/d.txt
     */
    public static void main(String[] args) {
        //Users/wan/workspace/study/design-pattern
        String root = System.getProperty("user.dir");
        Directory fileSystemNode = new Directory(root + "/eg/");

        Directory eg_a_directory = new Directory(fileSystemNode.getPath() + "/a/");
        fileSystemNode.addSubNode(eg_a_directory);
        Directory eg_a_image_directory = new Directory(eg_a_directory.getPath() + "/image/");
        Directory eg_a_txt_directory = new Directory(eg_a_directory.getPath() + "/txt/");
        eg_a_directory.addSubNode(eg_a_image_directory);
        eg_a_directory.addSubNode(eg_a_txt_directory);

        File image_file = new File(eg_a_image_directory.getPath() + "/设计模式.png");
        eg_a_image_directory.addSubNode(image_file);

        File txt_file_1 = new File(eg_a_txt_directory.getPath() + "/test1.txt");
        File txt_file_2 = new File(eg_a_txt_directory.getPath() + "/test2.txt");
        eg_a_txt_directory.addSubNode(txt_file_1);
        eg_a_txt_directory.addSubNode(txt_file_2);

        //b
        Directory eg_b_directory = new Directory(fileSystemNode.getPath() + "/b/");
        fileSystemNode.addSubNode(eg_b_directory);
        File txt_file_demo = new File(eg_b_directory.getPath() + "/demo1.txt");
        eg_b_directory.addSubNode(txt_file_demo);

        System.out.println(fileSystemNode.countNumOfFiles());
        System.out.println(fileSystemNode.countSizeOfFiles());
    }

}
