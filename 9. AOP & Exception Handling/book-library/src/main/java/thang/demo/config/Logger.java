package thang.demo.config;

import thang.demo.exception.NotAvailableException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;


@Aspect
public class Logger {

    @AfterThrowing(value = "execution(public * thang.demo.service.BookService.*(..))", throwing = "e")
    public void logException(JoinPoint joinPoint, NotAvailableException e){
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        String arr = Arrays.toString(joinPoint.getArgs());

        System.err.printf("Exception: %s.%s.%s : %s" , className ,methodName, arr, e.getMessage() + "\n");
    }

    @AfterReturning("execution(public * thang.demo.service.BookService.*(..))")
    public void clickToBooks(JoinPoint joinPoint) {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        System.err.println("Phương thức được gọi là: " + className + " " + methodName);
    }

}
