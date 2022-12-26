package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * ѹ��
 * P284
 * @author tzh666
 *
 */
public class ZipTest {
	
	private void zip(String zipFileName,File inputFile) throws Exception{
		
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName)); //����ZipOutputStream�����
		zip(out,inputFile,"");
		System.out.println("ѹ����.....");
		out.close();
		
	}
	 
    private void zip(ZipOutputStream out,File f,String base) throws Exception {
    	
    	if(f.isDirectory()) {
    		File[] fl = f.listFiles();
    		if(base.length() != 0) {
    			out.putNextEntry(new ZipEntry(base + "/"));
    		}
    		for(int i =0;i<fl.length;i++) {
    			zip(out, fl[i], base + fl[i]);
    		}
    	}
    	else {
    		out.putNextEntry(new ZipEntry(base));
    		FileInputStream in = new FileInputStream(f);
    		int b;
    		System.out.println(base);
    		while((b = in.read()) != -1) {
    			out.write(b);
    		}
    		in.close();
    	}
	}
    
    public static void main(String[] args) {
		ZipTest myzip = new ZipTest();
		
		try {
			myzip.zip("c:/1.zip", new File("c:/1.txt"));
			System.out.println("ѹ�����");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
