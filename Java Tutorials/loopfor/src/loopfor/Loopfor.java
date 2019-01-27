package loopfor;

public class Loopfor {

    public static void main(String[] args) {
        String[] videoCourse = {
            "C++", "C++ Operating on files", "Java", "Java Android",
            "JavaScript", "Grunt.js", "SASS"
        };
        
        // Normal For Loop
        for(int k = 0; k < videoCourse.length; k++)
        {
            System.out.println(videoCourse[k]);
        }
        
        // Enhanced For Loop
        for(String myValue: videoCourse)
        {
            System.out.println(myValue);
        }
    }
    
}
