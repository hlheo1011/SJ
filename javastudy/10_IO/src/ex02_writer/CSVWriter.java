package ex02_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class CSVWriter {

	public static void main(String[] args) {
		
		// CSV
		// 1. Commat Separate Values
		// 2. �޸��� �и��� ����
		// 3. Ȯ���� .csv�� ����(�⺻ �������α׷�-����, �޸������� ���� ����)
		
		// C:\storage\product.csv
		// ��ǰ��ȣ, ��ǰ��, ����\n
		// 100,�����,1500 \n
		// 101,���ĸ�,2000 \n
		// 103,Ȩ����,3000 \n
		
		List<String> header = Arrays.asList("��ǰ��ȣ", "��ǰ��", "����");
		List<String> product1 = Arrays.asList("100", "�����", "1500");
		List<String> product2 = Arrays.asList("101", "���ĸ�", "2000");
		List<String> product3 = Arrays.asList("102", "Ȩ����", "3000");
		
		List<List<String>> list = Arrays.asList(header, product1, product2, product3);
		
		File file = new File("C:\\storage", "product.csv");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file, StandardCharsets.UTF_8);
			bw = new BufferedWriter(fw);
			for(int i = 0, length = list.size(); i < length; i++) {
				List<String> line = list.get(i);
				for(int j = 0, size = line.size(); j < size; j++) {
					if(j == size - 1) {
						bw.write(line.get(j) + "\n");
					} else {
						bw.write(line.get(j) + ",");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
			} catch(IOException e ) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		for(int i = 0, length = list.size(); i < length; i++) {
			System.out.println(list.get(i));			
		}
			

	}

}
