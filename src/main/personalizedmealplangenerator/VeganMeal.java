package personalizedmealplangenerator;

public class VeganMeal implements MealPlan{
        String name;
        public VeganMeal(String name){
            this.name=name;
        }
        @Override
        public void showMeal(){
            System.out.println("Its a VeganMeal");
        }
        @Override
        public String getName() {
            return name;
        }
    }


