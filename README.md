# Calci-kernel
A complex calculation kernel in Java (for Calci calculator)

These are complex-number classes to implement complex calculation.<br/>
The content of each class is as follows:<br/>

* Complex.java: Contains a complex number, implemented complex number display (toString method) and some basic complex functions
* Expression.java: Expression parser and expressional functions (such as diff, integ, fzero & so on)
* Result.java: Contains a complex result and error codes
* Function.java: Function names and serials used in Expression.java is registrated in this class
* ParseNumber.java: Number parser for different radixes
* TestMain.java: A sample to test this package

Files are encoded in UTF8. Class Complex, Result & ParseNumber must be used together. Class Expression & Function may separate.<br/>

***
The simplest way to parse an expression and calculate its value is:<br/>
```java
Expression expr = new Expression(string);
System.out.println(expr.value().val);
```

Parsable string examples:<br/>
```
-3*(6+2.5)/4E2-.7*-1.01π
fzero(x^2-x-1,1)
sqrt(4+i)/arctan(-2i-1.1)^i
```

## Maven

Step 1. Add the JitPack repository to your build file

```xml
<repositories>
	<repository>
		   <id>jitpack.io</id>
		   <url>https://www.jitpack.io</url>
	</repository>
</repositories>
```

Step 2. Add the dependency
```xml
<dependency>
	 <groupId>com.github.eiriksgata</groupId>
	    <artifactId>Calci-kernel-java</artifactId>
	 <version>Tag</version>
</dependency>
```

Other import dependency
[jitpack/eiriksgata/Calci-kernel-java](https://www.jitpack.io/#eiriksgata/Calci-kernel-java/1.0)

An Android app using this kernel (Calci_X.X.X.apk) is provided.<br/>
The present package is used in Calci 1.3.3.<br/>
