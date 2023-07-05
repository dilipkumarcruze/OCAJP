package practice;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadedFileDownloader {
    private static final int MAX_THREADS = 5;
    
    public static void main(String[] args) {
        String[] fileUrls = {
            "https://file-examples.com/wp-content/storage/2017/10/file-sample_150kB.pdf",
            
        };
        
        ExecutorService executor = Executors.newFixedThreadPool(MAX_THREADS);
        
        for (String fileUrl : fileUrls) {
            executor.execute(() -> {
                try {
                    downloadFile(fileUrl);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        }
        
        executor.shutdown();
    }
    
    private static void downloadFile(String fileUrl) throws IOException {
        URL url = new URL(fileUrl);
        String fileName = fileUrl.substring(fileUrl.lastIndexOf('/') + 1);
        
        try (BufferedInputStream in = new BufferedInputStream(url.openStream());
             FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
        
        System.out.println("Downloaded: " + fileName);
    }
}
