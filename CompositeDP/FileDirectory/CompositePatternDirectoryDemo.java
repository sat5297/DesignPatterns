package FileDirectory;

public class CompositePatternDirectoryDemo {
    public static void main(String[] args) {
        Directory homeDirectory = new Directory("home");

        Directory sub1 = new Directory("Desktop");
        Directory sub2 = new Directory("Download");
        Directory file1 = new Directory("file1");

        Directory down1 = new Directory("Download1");
        Directory down2 = new Directory("Download2");

        homeDirectory.add(sub1);
        homeDirectory.add(sub2);
        homeDirectory.add(file1);

        sub2.add(down1);
        sub2.add(down2);

        System.out.println(homeDirectory);

        for(Directory dir : homeDirectory.getDirectories()){
            System.out.println(dir);

            for(Directory dir1 : dir.getDirectories()){
                System.out.println(dir1);
            }
        }
    }
}