package com.warape.designpattern.composite.v1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSystemNode {

    private String path;
    private boolean isFile;
    private List<FileSystemNode> subNodes = new ArrayList<>();

    public FileSystemNode(String path, boolean isFile) {
        this.path = path;
        this.isFile = isFile;
    }

    public int countNumOfFiles() {
        if (isFile) {
            return 1;
        }
        int numOfFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            numOfFiles += fileOrDir.countNumOfFiles();
        }
        return numOfFiles;
    }

    public long countSizeOfFiles() {
        if (isFile) {
            File file = new File(path);
            if (!file.exists()) {
                return 0;
            }
            return file.length();
        }
        long sizeofFiles = 0;
        for (FileSystemNode fileOrDir : subNodes) {
            sizeofFiles += fileOrDir.countSizeOfFiles();
        }
        return sizeofFiles;
    }

    public String getPath() {
        return path;
    }

    public void addSubNode(FileSystemNode fileOrDir) {
        subNodes.add(fileOrDir);
    }

    public void removeSubNode(FileSystemNode fileOrDir) {
        int size = subNodes.size();
        int i = 0;
        for (; i < size; ++i) {
            if (subNodes.get(i).getPath().equalsIgnoreCase(fileOrDir.getPath())) {
                break;
            }
        }
        if (i < size) {
            subNodes.remove(i);
        }
    }

    public static void main(String[] args) {
        String root = System.getProperty("user.dir");
        FileSystemNode fileSystemNode = new FileSystemNode(root + "/eg", false);
        FileSystemNode eg_a = new FileSystemNode(fileSystemNode.getPath()+ "/a", false);
        fileSystemNode.addSubNode(eg_a);
        FileSystemNode eg_a_image = new FileSystemNode(eg_a.getPath()+ "/image", false);
        eg_a.addSubNode(eg_a_image);
        FileSystemNode eg_a_image_png = new FileSystemNode(eg_a_image.getPath()+ "/设计模式.png", true);
        eg_a_image.addSubNode(eg_a_image_png);
        System.out.println(fileSystemNode.countNumOfFiles());
        System.out.println(fileSystemNode.countSizeOfFiles());
    }
}
