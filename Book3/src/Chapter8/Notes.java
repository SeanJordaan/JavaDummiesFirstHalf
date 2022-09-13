/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter8;

/**
 *
 * @author Sean
 */
public class Notes {
    /*
    
    
Working with Packages and the New Java Module System    
    This chapter shows you how to work with classes and how to put those clase into packages
    and then you can reuse those "classes" in other ptojects  
    
    
    
    
Working with Packages
    A package is a group of classes that belong together. Without packages, the entire 
    universe of Java classes would be a huge, unorganized mess.
    

Importing classes and packages

    We know how to do this already
    import java.util.*; to import everything from the util package
    import java.util.ArrayList; this is to only import the ArrayList from  the util package
    You don’t have to use an import statement to use a class from a package. 
    But if you don’t use an import statement, you must fully qualify any references to 
    the class.
    java.util.ArrayList = new java.util.ArrayList();
    its allways best to import an entire package becase it elimanates errors 
    You never have to explicitly import two packages:
    1)java.lang:Examples of the classes in this package are String, Exception, 
      and the various wrapper classes, such as Integer and Boolean
    2)The default package: This package contains classes that aren’t specifically 
      put in some other package
    Creating simple java apps its okay to use the defualt ones but once you get more 
    seriuos apps its best to put diffrent classes in packages 



Creating your own packages
    Creating your own packages to hold your classes is easy. Well, relatively easy, 
    anyway. You must go through a few steps:
    1)Pick a name for your package;
    You can chose anyname you want but if you own a domain you can put it like
    com.(WTF ever the name is) so the package will then be named com.wtf(thats an example) 
    2)Choose a directory on your hard drive to be the root of your class library.
    You need a place on your hard drive to store your classes
    3)Create subdirectories within the root directory for your package name.
    4) Add the root directory for your package to the ClassPath environment 
    variable.
    You  can set it like this,
    .;c:\util\classes
    Then you modify it to look like this:
    .;c:\util\classes;c:\javaclasses
    5)Save the files for any classes you want to be in a particular package in the 
    directory for that package
    6) Add a package statement to the beginning of each source file that 
    belongs in a package.

    
    
    
Puttinng packages into a JAR File
    

    A JAR file is a single file that can contain more than one class in a compressed 
    format that the Java Runtime Environment can access quickly
    JAR stands for Java Archive
    An app with many or few classes is saved in a rt.java file (RT stands for runtime)
    JAR files are created by the jar utility, which you find in the Java bin directory
    along with the other Java command-line tools, such as java and javac
    

Archiving a package
   
    The most common use for the jar utility is to create an archive of an entire package
    1) Open a command window, this is opening a cmd window.
    2) Use a cd command to navigate to your package root.
       For example, if your packages are stored in c:\javaclasses, use this 
       command:cd \javaclasses
    3) Use a jar command that specifies the options cf, the name of the jar file, 
       and the path to the class files you want to archive.
       jar cf utils.jar com\lowewriter\util\*.class
    4) To verify that the jar file was created correctly, use the jar command 
       that specifies the options tf and the name of the jar file.
       jar tf utils.jar
    
    
Adding a jar to your classpath
    
    To use the classes in an archive, you must add the jar file to your ClassPath environment variable.
    To add an archive to the ClassPath variable
    .;c:\javaclasses\utils.jar;c:\javaclasses
    To add all jar files to the classpath just use, 
    .;c:\javaclasses/*(a forward slash with a start) 
    
    
Running a program directly from an archive
    
    With just a little work, you can set up an archive so that a Java program can be run 
    directly from it. All you have to do is create a manifest file before you create the 
    archive. Then, when you run the jar utility to create the archive, you include the 
    manifest file on the jar command line.
    A manifest file is a simple text file that contains information about the files in the 
    archive. Although it can contain many lines of information, it needs just one line 
    to make an executable jar file:
    Main-Class: ClassName
    
    
Using JavaDoc to Document Your Classes

    Java provides a tool called JavaDoc that can automatically create fancy HTML-based 
    documentation based on comments in your source files
    
    
Adding JavaDoc comments
    
    The basic rule for creating JavaDoc comments is that they begin with /** and end with */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
}
