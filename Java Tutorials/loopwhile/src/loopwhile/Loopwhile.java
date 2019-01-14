/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopwhile;

/**
 *
 * @author wmc
 */
public class Loopwhile {
    public static void main(String[] args){
        String[] videoCourses =
        {
            "C++",
            "C++ operating on files",
            "Java",
            "JavaScript",
            "Grunt.JS",
            "Node.JS"
        };
        System.out.println("---- Old Way ----");
        System.out.println(videoCourses[0]);
        System.out.println(videoCourses[1]);
        System.out.println(videoCourses[2]);
        System.out.println(videoCourses[3]);
        System.out.println(videoCourses[4]);
        System.out.println();
        System.out.println("---- While Loop Way ----");
        
        // While checks conditions first then executes.
        int i = 0;
        while(i < videoCourses.length){
            System.out.println(videoCourses[i]);
            i++;
        }
        System.out.println();
        System.out.println("---- Do While Loop Way ----");

        
        // Do While executes first then checks the condition at end.
        i = 0;
        do{
            System.out.println(videoCourses[i]);
            i++;
        }while(i < videoCourses.length);
    }
    
}
