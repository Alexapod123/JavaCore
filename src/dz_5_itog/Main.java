package dz_5_itog;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            createBackup("./src/dz_3_4", "./backup");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createBackup(String sourceDir, String backupDir) throws IOException {
        Path sourcePath = Paths.get(sourceDir);
        Path backupPath = Paths.get(backupDir);

        if (!Files.exists(backupPath)) {
            Files.createDirectories(backupPath);
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(sourcePath)) {
            for (Path entry : stream) {
                if (Files.isRegularFile(entry)) {
                    copy(entry, backupPath.resolve(entry.getFileName()));
                }
            }
        }
    }

    private static void copy(Path source, Path destination) throws IOException {
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }
}
