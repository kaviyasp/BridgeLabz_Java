package collectionsandstreams.generics.applications;

/*
 * Class: Meal
 * Description: Generic meal handler.
 */
public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void generateMeal() {
        System.out.println("Generated: " + mealPlan.getMealType());
    }
}
