package readuserinput;

public class User {
        private String name;
        private int age;
        private String favoriteLanguage;

        public User(String name, int age, String favoriteLanguage) {
            this.name = name;
            this.age = age;
            this.favoriteLanguage = favoriteLanguage;
        }

        @Override
        public String toString() {
            return "Name: " + name + "\nAge: " + age + "\nFavorite Language: " + favoriteLanguage + "\n------------------------\n";
        }
    }


