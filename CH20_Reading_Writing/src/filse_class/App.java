package filse_class;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		// 파일 객체 만들기
		File currentDirectory = new File("."); // .은 현재 폴더 위치로 객체 생성
		
		System.out.println(currentDirectory.getAbsolutePath()); // 파일객체의 절대경로 출력  I:\JAVA\JAVA-STUDY\CH20_Reading_Writing\.
		System.out.println(currentDirectory.getCanonicalPath()); // 파일객체의 절대경로 출력  I:\JAVA\JAVA-STUDY\CH20_Reading_Writing
		
		// 폴더 내부 파일들을 출력
		for(String f : currentDirectory.list()) {
			System.out.println(f);
		}
		

	}

}
