package com.mytest.junidemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {
    @Test
    @Disabled("Dont run ultil JIRA #123 is resolved")
    void basicTest(){
        //execute methos and perform assert
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        //execute methos and perform assert
    }
    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){
        //execute methos and perform assert
    }

    @Test
    @EnabledOnOs({OS.MAC,OS.WINDOWS})
    void testForMacAndWindows(){
        //execute methos and perform assert
    }

    @Test
    @EnabledOnOs({OS.LINUX})
    void testForLinux(){
        //execute methos and perform assert
    }
    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17(){
        //execute methos and perform assert
    }
    @Test
    @EnabledOnJre(JRE.JAVA_21)
    void testForOnlyForJava21(){
        //execute methos and perform assert
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_17,max=JRE.JAVA_21)
    void testForOnlyForJavaRange(){
        //execute methos and perform assert
    }
    @Test
    @EnabledForJreRange(min=JRE.JAVA_17)
    void testForOnlyForJavaRangeMin(){
        //execute methos and perform assert
    }

    @Test
    @EnabledIfEnvironmentVariable(named="MiVariable_ENV",matches="DEV")
    void testOnlyForDevEnviroment(){
        //execute methos and perform assert
    }
    @Test
    @EnabledIfSystemProperty(named="MiVariable_SYS_PROP",matches="CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){
        //execute methos and perform assert
    }
}
