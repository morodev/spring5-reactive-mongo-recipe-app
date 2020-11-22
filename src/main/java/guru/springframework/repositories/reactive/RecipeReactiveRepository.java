package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created By Luca Moro on 22/11/2020 15:54
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
