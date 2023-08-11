package file;
import java.io.*;
public class FileOps1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String path1="C:\\FileProgs1\\Input.txt.txt";
String path2="C:\\FileProgs1\\Output.txt.txt";
//FileInputStream fis=new FileInputStream(path1);
/*FileReader fr= new FileReader(path1);
BufferedReader br=new BufferedReader(fr);
int temp;
// string temp;
//FileOutputStream  fos=new FileOutputStream(path2);
FileWriter fw=new FileWriter(path2);
BufferedWriter bw=new BufferedWriter(fw);
/*while((temp=fis.read())!=-1){
	 fos.write(temp);
}fos.close();
fis.close();
	}*/
// while((temp=fis.readline())!=null)
//fos.write(temp);
/*while((temp=fr.read())!=-1){
	 fw.write(temp);
}fw.flush();
fr.close();*/
/*while((temp=br.read())!=-1){
	 bw.write(temp);
}
bw.flush();
fw.flush();
br.close();
fr.close();*/
FileInputStream fis=new FileInputStream(path1);
BufferedInputStream bis=new BufferedInputStream(fis);
int temp;
FileOutputStream fos=new FileOutputStream(path2);
BufferedOutputStream bos=new BufferedOutputStream(fos);
while((temp=bis.read())!=-1){
	 bos.write(temp);
}
bos.flush();
fos.close();
bis.close();
fis.close();
	}}
