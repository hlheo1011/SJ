package ex02_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void m1() {
		
		File dir = new File("C:\\storage");
		
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir, "m1.txt");
		
		FileWriter fw = null;
		try {
			// c:\\storage\\m1.txt ���ϰ� ����Ǵ� ���� ��� ��Ʈ�� ����
			// ��� ��Ʈ���� �����Ǹ� ���ϵ� ���� ������
			fw = new FileWriter(file);	// new FileWriter("c:\\storage\\m1.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
			if (fw !=null) {
					fw.close();
				} 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// ���� ���� ���� ���� ó���� �� �߻��� ���ϱ⶧���� close�� ���� �÷��ش�.
		
	}
	
	public static void m2() {
		
		File file = new File("C:\\storage", "m2.txt");
		
		FileWriter fw = null;
		try {
			// ��� ��Ʈ�� ����(���ϵ� �Բ� ����)
			fw = new FileWriter(file);
			
			// ����� ������ 
			// 1. 1���� : int
			// 2. ���� ��¥ : char[], String
			int c = 'I';
			char[] cbuf = {' ', 'a', 'm'};
			String str = " IronMan";
			
			// ��� ��Ʈ������ ������(���)
			fw.write(c);
			fw.write(cbuf);
			fw.write(str);
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void m3() {
		
		// try - catch - resources��
		// 1. resources�� �ڿ��� �ǹ���
		// 2. ���⼭ �ڿ��� ��Ʈ��(stream)�� �ǹ���
		// 3. ��Ʈ���� ����(close)�� �ڵ����� ó���ϴ� try-catch���� �ǹ���
		// 4. ����
		//	  try(��Ʈ�� ����) {
		//			�ڵ�
		//	  } catch (Exception e) {
		//			e.printStackTrace();
		//	  }
		
		File file = new File("c:\\storage", "m3.txt");
		try (FileWriter fw = new FileWriter(file)){
			
			fw.write("���� ���̾���̴�.");
			fw.write("\n");
			fw.write("�ʴ� Ÿ�뽺��?\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void m4() {
		
		File file = new File("C:\\storage", "m4.txt");
		
		try(FileWriter fw = new FileWriter(file)) {
			char[] cbuf = {'a', 'b', 'c', 'd', 'e'};
			String str = "abcde";
			
			fw.write(cbuf, 0, 2);	// �ε��� 0���� 2���ڸ� ��
			fw.write(str, 2, 3);		// �ε��� 2���� 3���ڸ� ��
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void m5() {
		
		// FileWriter�� ������ ������
		// ���� �ӵ��� �ʿ��� ��� BufferenWriter�� �߰��ؼ� �Բ� ����Ѵ�.
		
		File file = new File("C:\\storage", "m5.txt");
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			//��� ���� ��Ʈ��
			fw = new FileWriter(file);
			
			// �ӵ� ����� ���� ���� ��Ʈ��
			// ���� �� ��Ʈ���� ������ ��� �Ұ�
			bw = new BufferedWriter(fw);
			
			bw.write("������ �������ε� ������ �� ������. ������");		
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ���� ��Ʈ���� ���� �ʿ䰡 ����
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	public static void main(String[] args) {
		m5();
	}

}
