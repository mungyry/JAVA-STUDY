package example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class Book_wordSet {
	public static void main(String[] args) {
		// 책 전체 내용을 읽어서 단어로 분리해 리스트에 넣기
		// 이때 리스트는 단어가 중복 되지 않는다. 알파벳 순으로 저장 => tree set
		File Proposal = new File("Proposal.txt"); 
		File huck = new File("huck.txt"); 
		// C:\JAVA\JAVA-STUDY\CH22_CollectionsAPI\Proposal.txt
		System.out.println(Proposal.exists()); // 파일이 있는지 확인
		System.out.println(huck.exists()); 
		
		TreeSet<String> ProList = loadWords(Proposal);
		TreeSet<String> huckList = loadWords(huck);
			
		System.out.println(ProList.size());
		System.out.println(huckList.size());
//		
//		for(String w : ProList) {
//			System.out.println(w);
		}
		
		private static void displayWords(TreeSet<String>list) {
			
			int count= 0;
			for(String w: list) {
				System.out.printf("%--10s \t",w);
				count++;
				if (count == 6) { 
					System.out.println();
					count=0;
				}
		}
	}
	/**
	 * 입력된 파일을 읽어 단어를 저장해서 마지막에 트리셋 리스트로 리턴 
	 * @param file
	 * @return wordSet
	 */
	private static TreeSet<String> loadWords(File file) {
		TreeSet<String> wordSet = new TreeSet<>();
		// 파일 읽기
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line = null;
			// 한줄 읽기
			while((line = reader.readLine()) !=null){
				String[] words = line.split("[^a-zA-Z]+"); // +는 . 공배 등 영어외에 다른것들을 제거한다
				for(String w : words) {
					if(w.length() < 6) {
						continue;
					}
					wordSet.add(w.toLowerCase()); //소문자로 단어 입력
				}
			}
		} catch(FileNotFoundException e) {
			System.out.println("파일을 찾지 못했음");
		} catch(IOException e) {
			System.out.println("파일을 읽지 못함");
		}
		
		return null;
	}

}
