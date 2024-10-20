import java.util.ArrayList;
import java.util.List;

public class JavaFileSelector
{
public static void main(String[] args)
{
String[] files = {"test.java","ABC.doc","Demo.pdf","add.java","factorial.java",
"sum.txt"};
List<String> javaFiles = selectJavaFiles(files);

for(String javaFile : javaFiles)
{
System.out.println(javaFile);
}
}
public static List<String> selectJavaFiles(String[] files) {
List<String> javaFiles = new ArrayList<>();
for (String file : files) {
if (file.endsWith(".java")) {
javaFiles.add(file);
}
}
return javaFiles;
}
}

****OUTPUT****
C:\JavaFileSelector>java JavaFileSelector
test.java
add.java
factorial.java
