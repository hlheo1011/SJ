package ex02_writer;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XMLWriter {

	public static void main(String[] args) {

		// XML
		// 1. eXtensible Markup Language
		// 2. Ȯ�� ��ũ�� ���
		// 3. ǥ�� ��ũ�� ����� HTML�� Ȯ�� ����
		// 4. ������ �±� �� ����� ���� �±� ���
		/*
			<product>
				<number>100</number>
				<name>�����</name>
				<price>1500<price>
			</product>
			<product>
				<number>101</number>
				<name>���ĸ�</name>
				<price>2000<price>
			</product>
			<product>
				<number>102</number>
				<name>Ȩ����</name>
				<price>3000<price>
			</product>		
		*/

		try {
			// Document ����(���� ����)
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument();
			document.setXmlStandalone(true);
			
			List<String> product1 = Arrays.asList("100", "�����", "1500");
			List<String> product2 = Arrays.asList("101", "���ĸ�", "2000");
			List<String> product3 = Arrays.asList("102", "Ȩ����", "3000");
			
			List<List<String>> list = Arrays.asList(product1, product2, product3);
			
			for(List<String> line : list) {
				// �±� ����
				Element product = document.createElement("product");
				Element number = document.createElement("number");
				number.setTextContent(line.get(0));
				Element name = document.createElement("name");
				name.setTextContent(line.get(1));
				Element price = document.createElement("price");
				price.setTextContent(line.get(2));
				
				// �±� ��ġ
				document.appendChild(product);
				product.appendChild(number);
				product.appendChild(name);
				product.appendChild(price);
			}
			
			// XML ����
			TransformerFactory transformerFactory =  TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty("encoding", "UTF-8");
			transformer.setOutputProperty("indent", "true");
			
			Source source = new DOMSource(document);
			File file = new File("C:\\storage", "product.xml");
			StreamResult result = new StreamResult(file);
			
			transformer.transform(source, result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
