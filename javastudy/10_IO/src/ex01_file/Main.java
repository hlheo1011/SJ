package ex01_file;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

public class Main {
	
	public static void m1() {
		
		// File Ŭ����
		// 1. ��Ű�� : java.io
		// 2. ���� �� ���͸� ����
		// 3. ���� ���
		//		1) new File(���, ����)
		//		2) new File(����)
		// 4. �������� ��� ���� ��� : �齽���� (\)
		// 5. �������� ��� ���� ��� : ������(/)
		
		// ����(���͸�) �����
		File dir = new File("c:\\storage");
		
		// �������� ������ ����ڴ�.
		if(dir.exists() == false) {	// ������ ���� if(!dir.exists())
			dir.mkdirs();
		}
		// �����ϸ� �����ϰڴ�.
		else {
			dir.delete();	// ���� �����.
			dir.deleteOnExit(); 	// JVM�� ����Ǹ� �����.
		}
	
		
	}

	public static void m2() {
		
		File file = new File("C:\\storage", "my.txt");
		
		try {
			if(file.exists() == false) {
				file.createNewFile();
			}
			else {
				file.delete();
			}
		} catch (IOException e) {
			// ������ �� �ִ� catch  ��� �ڵ�
			e.printStackTrace(); 	// ������ �ֿܼ� ����. ��� ��
		}
	}
	
	public static void m3() {
		
		File file = new File("C\\storage", "my.txt");
		
		System.out.println("���ϸ� : " + file.getName());
		System.out.println("��� : " + file.getParent());
		System.out.println("��ü���(��� + ���ϸ�) : " + file.getPath());
		
		System.out.println("���͸��ΰ�? " + file.isDirectory());
		System.out.println("�����ΰ�? " + file.isFile());
		
		long lastModifiedDate = file.lastModified();
		System.out.println("�����ѳ�¥ : " + lastModifiedDate);
		
		
		String lastModified = new SimpleDateFormat("a hh:mm yyyy-MM-dd").format(lastModifiedDate);
		System.out.println("�����ѳ�¥ : " + lastModified);
		
		long size = file.length();	// ����Ʈ ����
		System.out.println("����ũ�� : " + size + "byte");			
		
	}
	
	public static void m4() {
		
		File dir = new File("F:\\gdj\\GDJ");
		
		File[] list = dir.listFiles();
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].getName());
		}
		
	}
		
	public static void m5() {
		// �÷������� �ٸ� ��� ������ ����
		// ������ \\, �������� // �̱⶧���� File.separator�� ������ ���ش�
		File file = new File("c:" + File.separator + "storage" + File.separator + "my.txt");
		System.out.println(file.getName());
	}
	
	public static void q1() {
		
		File dir = new File("F:\\gdj\\GDJ\\javastudy");
		File[] list = dir.listFiles();
		
		int dirCnt = 0;
		int fileCnt = 0;
		long totalSize = 0;
		
		for(File file : list) {
			if(file.isHidden()) {
				continue;
			}
			String lastModified = new SimpleDateFormat("yyy-MM-dd a hh:mm").format(file.lastModified());
			String directory = "";
			String size = "";
			if(file.isDirectory()) {
				directory = "<DIR>";
				size = "     ";
				dirCnt++;
			} else if (file.isFile()) {
				directory = "     ";
				size = new DecimalFormat("#,##0").format(file.length()) + "";
				fileCnt++;
				totalSize += Long.parseLong(size.replace(",", ""));
			}
			String name = file.getName();
			System.out.println(lastModified + " " + directory + " " + size + " " + name);
		}
		
		System.out.println(dirCnt + "�� ���͸�");
		System.out.println(fileCnt + "�� ���� " + new DecimalFormat("#,##0").format(totalSize) + "����Ʈ");
		
	}
	
	public static void q2() {

		// C:\storage ���͸� �����ϱ�
		
		String sep = File.separator;
		
		File file = new File("c:" + sep + "storage", "mytxt");
		if(file.exists()) {
			file.delete();
		}
		
		File dir = new File("C:" + sep + "storage");
		
		if(dir.exists()) {
			dir.delete();
		}
		
	}
	
	public static void main(String[] args) {	
		q2();
	}

}
