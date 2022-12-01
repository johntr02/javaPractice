public class Main {
    public static void main(String args[]){
        SuperHero batman = new SuperHero();
        batman.setName("batman");
        batman.setAge(30);
        batman.setSuperPower("martial arts");
        batman.setWeakness("guns");
        System.out.println(batman.getAge());
        System.out.println(batman.getName());
        System.out.println(batman.getSuperPower());
        System.out.println(batman.getWeakness());
        printSlogan("IM BATMAN");
    }

    public static void printSlogan(String newSlogan){
        System.out.println(newSlogan);
    }
}

// a repository is a place where you can store all of your projects files and also the revisions of those files
// git / github allows for better management of a project and gives the ability to collarborate on the same project.
// a commit is a snapshot or saved version of your code. you can go back to previous commits, compare any changes, and also see your progess on the project
// a directory is the viewable folder in which you can see the commits people have added to the project
// the staging area is the middle ground between your code and the repository. it allows you to set exactly what you will be committing. 
// branches are piece(s) of working code that work parallel to the main branch. we use them to see if certain code is working and 
    //prevent putting the code as the master branch without knowing if it works
// local is what is close to you which in this case would be the device you are working on. remote would be a server or something that is run somewhere else. 