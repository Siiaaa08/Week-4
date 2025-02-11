package personalizedmealplangeneratortest;

import org.junit.Assert;
import org.junit.Test;
import personalizedmealplangenerator.Meal;
import personalizedmealplangenerator.VeganMeal;

public class MealPlanerTest {
        @Test
        public void tester1(){
            VeganMeal veganMeal1=new VeganMeal("Aalu pratha");
            Meal<VeganMeal> veganMealList =new Meal<>();
            veganMealList.addItem(veganMeal1);
            Assert.assertEquals(1,veganMealList.getItem().size());
        }


    }


