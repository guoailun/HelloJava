package file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FileClass {
    // TODO 不同操作系统的同学可以更改这个值，比如mac或者linux可以写为~代表home目录
    private static final String ROOT = "." + File.separator;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("文件路径分隔符=》" + File.separator);
        System.out.println("环境变量分隔符=》" + File.pathSeparator);

        // TODO 使用File类，依次创建多层文件夹，修改文件夹名字，在指定文件夹创建文件，删除文件，删除文件夹
        File dir = createDirs();
        File newDir = rename(dir);
        System.out.println(newDir + newDir.getParent());
        String name = createFiles(newDir);
        String fileNameNew = renameFiles(newDir, name);

        deleteFiles(newDir, fileNameNew);

        deleteDir(newDir);




    }

    public static File createDirs() {
        List<String> pathList = new ArrayList<>();
        while (true) {
            System.out.println("请输入文件路径，如果为空则结束");
            String path = scanner.nextLine();
            if (path.isEmpty()) {
                break;
            }
            pathList.add(path);
        }
        return createDir(pathList.toArray(new String[pathList.size()]));  // 使用toArray(T[] a)方法

//        System.out.println(pathList.toArray(new String[pathList.size()]));
//
//        String[] a = pathList.toArray(new String[pathList.size()]);
//
//        for(String s : a) {
//            System.out.println(s);
//        }

        /* pathList.toArray(new String[pathList.size()]) 将数组中的元素类型，转换成String,
        原因呢：String[] 类型是 java.lang.Object 转换成java.lang.String会有问题,
        因为这里是一个向下转型，而虚拟机只保存了这是一个Object的数组，不能保证数组中的元素是String的，所以这个转型不能成功。数组里面的元素只是元素的引用，不是存储的具体元素，所以数组中元素的类型还是保存在Java虚拟机中的。
        ArrayList<String> list=new ArrayList<String>();
        String strings[]=(String [])list.toArray();*/   //使用toArray(T[] a)方法

    }

    private static File createDir(String... restPaths) { // 接收参数 String[]
        String rest = joinRestDir(restPaths);
        System.out.println("将在" + ROOT + "下创建" + rest);
        File dir = new File(ROOT, rest);
        if (dir.exists() && dir.isDirectory()) {
            System.out.println("文件夹已经存在" + dir.toString());
            return dir;
        } else {
            boolean createSuccess = dir.mkdirs();  // mkdirs(多层) mkdir(单层目录)
            if (createSuccess) {
                return dir;
            } else {
                throw new IllegalArgumentException("无法在" + ROOT + "下创建" + rest);
            }
        }
    }

    private static String joinRestDir(String... restPaths) {
        return Arrays.stream(restPaths).map(String::trim).collect(Collectors.joining(File.separator));
    }

    public static File rename(File dir) {
        System.out.println("请输入新的文件夹的名字：");
        String newDirName = scanner.nextLine().trim();

        File newDir = new File(dir.getParentFile(), newDirName);
        boolean renameSuccess = dir.renameTo(newDir);

        if (renameSuccess) {
            System.out.println("改名为" + newDirName + "成功");
        } else {
            System.out.println("改名为" + newDirName + "失败");
            return null;
        }
        return newDir;
    }

    public static String createFiles(File newDir) throws IOException {
        System.out.println("请输入文件名的前缀：");
        String fileName = scanner.next().trim();

        for (int i = 0; i < 5; i++) {
            File f = new File(newDir, fileName + i + ".txt");
            System.out.println("创建文件" + f.getName() + "：" + f.createNewFile());
        }
        return fileName;
    }

    private static String renameFiles(File newDir, String fileName) {
        System.out.println("请输入新的文件名的前缀：");
        String fileNameNew = scanner.next().trim();

        for (int i = 0; i < 5; i++) {
            File f = new File(newDir, fileName + i + ".txt");
            File fn = new File(newDir, fileNameNew + i + ".txt");
            System.out.println("重命名文件" + f.getName() + "：" + f.renameTo(fn));
        }
        return fileNameNew;
    }

    private static void deleteDir(File newDir) {
        System.out.println("删除文件夹？");

        boolean deleteDir = scanner.nextBoolean();

        // TODO 删除文件夹的前提是文件夹是空的，否则将删除失败
        if (deleteDir) {
            System.out.println("删除文件夹：" + newDir.delete());
        }
    }

    private static void deleteFiles(File newDir, String fileNameNew) {
        System.out.println("删除文件？");

        boolean deleteFiles = scanner.nextBoolean();

        if (deleteFiles) {
            for (int i = 0; i < 5; i++) {
                File fn = new File(newDir, fileNameNew  + i + ".txt");
                System.out.println("删除文件" + fn.delete());
            }
        }
    }
}
