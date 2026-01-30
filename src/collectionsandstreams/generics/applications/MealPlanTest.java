package collectionsandstreams.generics.applications;

/*
 * Class: MealPlanTest
 * Description: Demonstrates personalized meal plan generator.
 */
public class MealPlanTest {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());

        Meal<HighProteinMeal> proteinMeal =
                new Meal<>(new HighProteinMeal());

        vegMeal.generateMeal();
        veganMeal.generateMeal();
        proteinMeal.generateMeal();
    }
}
