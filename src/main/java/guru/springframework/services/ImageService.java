package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Luca Moro.
 */
public interface ImageService {

    void saveImageFile(String recipeId, MultipartFile file);
}
