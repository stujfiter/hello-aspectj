package bday;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.CodeSignature;

aspect Logging {

    pointcut personCelebrate(): within(Person) && execution(* celebrate());

    Object around(): personCelebrate() {
        System.out.println("Executing Advice");
        Object result = proceed();
        return result;
    }
}
