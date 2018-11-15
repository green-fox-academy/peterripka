import java.nio.file.*;


public class CopyFile {

    public static void main(String[] args) {
        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String copyThis = "fileToCopy.txt";
        String intoThis = "copiedFile.txt";

        copyFile( "fileToCopy.txt", "copiedFile.txt" );

        if (copyFile( copyThis, intoThis )) {
            System.out.println( ("The copy process was successful!") );
        } else {
            System.out.println( ("The copy process was UNsuccessful!") );
        }
    }

    public static Boolean copyFile(String copyThis, String intoThis) {
        Path copyFilePath = Paths.get(copyThis);
        Path pasteFilePath = Paths.get(intoThis);
        try {
            Files.copy(copyFilePath, pasteFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException exception) {
            return true;
        } catch (Exception exception) {
            return false;
        }
        return true;
    }
}