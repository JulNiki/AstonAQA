/*3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.*/

package Task;
public class Park {
    String parkName;
    public Park(String parkName) {
        this.parkName = parkName;
    }

        public class Attraction {
        String attractionName;
        String workingHours;
        double price;

            public Attraction(String attractionName, String workingHours, double price) {
                this.attractionName = attractionName;
                this.workingHours = workingHours;
                this.price = price;
            }
            public void printInfoAttraction() {
                System.out.printf( "Аттракцион: %s;\nВремя работы: %s;\nСтоимость: %.2f;\n",attractionName, workingHours, price );
            }
        }
    public void printInfoPark() {
        System.out.println( "Парк: " + parkName );
    }

}
