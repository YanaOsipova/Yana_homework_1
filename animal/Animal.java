package animal;

    public abstract class Animal {
        protected String name;
        protected int age;
        protected int weight;
        protected String color;

        public void say() {System.out.println("Я говорю");}

        protected void go() {System.out.println("Я иду");}

        protected void eat() {
            System.out.println("Я ем");
        }

        protected void drink(){
            System.out.println("Я пью");
        }

        public static class Age {
            int age = 5;
            int ageLastNumber = age % 10;
            String old;
            public static void appendAge(int age, int ageLastNumber, String old){
                boolean exclusion = (age % 100 >= 11) && (age % 100 <= 14);
                if (ageLastNumber == 1)
                    old = "год";
                else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
                    old = "лет";
                else if(ageLastNumber >= 2 && ageLastNumber <= 4)
                    old = "года";
            }
            String myAge = age + old;
        }

        @Override
        public String toString(){
            int ageLastNumber = this.age % 10;
            boolean isExclusion = (this.age % 100 >= 11) && (this.age % 100 <= 14);
            String old = "";
            if (ageLastNumber == 1)
                old = "год";
            else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
                old = "лет";
            else if(ageLastNumber >= 2 && ageLastNumber <= 4)
                old = "года";
            if (isExclusion)
                old = "лет";
            return "Привет! Меня зовут "+ name+", мне "+ age+ " "+old+", я вешу - "+ weight+" кг, мой цвет - "+color;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

