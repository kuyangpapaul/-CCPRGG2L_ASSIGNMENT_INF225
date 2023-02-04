public class App {
    public static void main(String[] args) {

       Person friend = new Person("Abi", 18);

       Myself me = new Myself("Paul", 20);

       me.addFriend(friend);
       
       Pet dog = new Pet("Bandar", friend);

       dog.showOwnerName();

       Car Honda = new Car("Honda Civic type R", me , 169 );

       Honda.showCarName();

    }   
}
