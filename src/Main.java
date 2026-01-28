public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        UserManager userManager = new UserManager();

        userManager.addUser(new User("Kirill Filatov", "filatov.k@gmail.com", Role.USER));
        userManager.addUser(new User("Didarbek Ramazanov", "ramazanov.d@gmail.com", Role.USER));
        userManager.addUser(new User("Shakhlovich Maksim", "shakhlovich.m@gmail.com", Role.USER));
        logger.logList(userManager.getUsers());

        userManager.removeUser("ramazanov.d@gmail.com");
        logger.logList(userManager.getUsers());

        userManager.updateUser("shakhlovich.m@gmail.com", "Shakhlovich Maksim", "shakhlovich.m@gmail.com", Role.ADMIN);
        logger.logList(userManager.getUsers());
    }
}