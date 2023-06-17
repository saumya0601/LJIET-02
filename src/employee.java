public class employee {

        private static int count = 0;
        private String name;

        public employee(String name) {
            this.name = name;
            count++;
        }

        public static int getCount() {
            return count;
        }


        public static void main(String[] args) {

            employee employee1 = new employee("Raj");
            employee employee2 = new employee("Reema");
            employee employee3 = new employee("Vijay");
            employee employee4 = new employee("Rahul");
            employee employee5 = new employee("Kavya");

            // Display the count of employees
            System.out.println("Number of employees: " + employee.getCount());
        }
    }


