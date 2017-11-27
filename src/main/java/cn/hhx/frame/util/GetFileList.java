package cn.hhx.frame.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class GetFileList {
	public static void main(String[] args) {
        //showDirectory(new File("D:/project/CF_IT/01SystemManagement/01QLS/trunk/code/BD/BD-20171104-com.tansun.service.quickloan-QC生成报文协议改为异步，上传FTP改为批量/com.tansun.service.quickloan"));
		Path initPath = Paths.get("D:/project/CF_IT/01SystemManagement/01QLS/trunk/code/BD/BD-20171106-com.tansun.service.quickloan-QC二审回退资料修改缺陷/com.tansun.service.quickloan/");
        try {
			Files.walkFileTree(initPath, new SimpleFileVisitor<Path>() {
			    @Override
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) 
			            throws IOException {
			        System.out.println(file.getFileName().toString());
			        return FileVisitResult.CONTINUE;
			    }
 
			});
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
    public static void showDirectory(File f) {
        _walkDirectory(f, 0);
    }
 
    private static void _walkDirectory(File f, int level) {
        if(f.isDirectory()) {
            for(File temp : f.listFiles()) {
                _walkDirectory(temp, level + 1);
            }
        }
        else {
            for(int i = 0; i < level - 1; i++) {
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
}
