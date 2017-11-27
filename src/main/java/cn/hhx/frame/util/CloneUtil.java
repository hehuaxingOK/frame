package cn.hhx.frame.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CloneUtil {
	@SuppressWarnings("unchecked")
	public static <T> T clone(T obj)throws Exception{
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		ObjectOutputStream oot = new ObjectOutputStream(bout);
		oot.writeObject(obj);
		
		ByteArrayInputStream bint = new ByteArrayInputStream(bout.toByteArray());
		ObjectInputStream oit = new ObjectInputStream(bint);
		return (T)oit.readObject();
		// 说明：调用ByteArrayInputStream或ByteArrayOutputStream对象的close方法没有任何意义
        // 这两个基于内存的流只要垃圾回收器清理对象就能够释放资源，这一点不同于对外部资源（如文件流）的释放
	}
}
