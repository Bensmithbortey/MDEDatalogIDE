# MDEDatalogIDE
Datalog IDE for Model-driven Development
Authors: Robert Ciochina K1888810
         Benjamin-Smith Jnr Bortey, 1528719
         
 1. After pulling the project from GitHub, the folders datalog.xpect, datalogTest and runtime.datalog must be placed in the runtime version of eclipse. All the other folder will remain in the main window.
 2. In order to build the Artefact, open the folder org.xtext.datalog/src/org.xtext and right click on Datalog.xtext->Run As-> Generate Artefact. 
 3. Then right click on org.xtext.datalog-> Run As->Eclipse Application
 4. In order to test syntax/grammar and code validation the file testDatalog.datalog, in the folder datalogTest/src, contains the code with the features.
 5. To run the implemented tests, the folder datalog.xpect/src/datalog.xpect holds the test file test1.datalog.xt. By right clicking on it -> Run As->JUnit Test, the tests will run. (The second test will fail due to reasons specified in the report at page 4).
 6. To run the pre-made code, accessing runtime.datalog/runtime.datalog and then right click DatalogTest.java->Run As-> Java Application will run the program.
