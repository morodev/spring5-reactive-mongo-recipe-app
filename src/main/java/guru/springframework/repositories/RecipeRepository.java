package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Luca Moro.
 */
public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
