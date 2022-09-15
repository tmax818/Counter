# Counter

- create [MainController](src/main/java/tylermaxwell/counter/MainController.java)
- add:
```html
<!-- Here we have to import the Date class. -->
<!-- You will put the import in the first line of the jsp tag. Use the import attribute -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Counter</title>
    </head>
<body>
</body>
</html>

```
- to [index.jsp](src/main/webapp/WEB-INF/index.jsp)
- add `spring.mvc.view.prefix=/WEB-INF/` to [application.properties](src/main/resources/application.properties)
- add:
```xml
<dependencies>
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        </dependency>
</dependencies>    	


```
to the [pom](pom.xml) file.

## Tasks

- [ ] Create and display a counter on http://localhost:8080/counter

- [ ] Increment the counter on each visit to http://localhost:8080/

- [ ] Counter must start at zero

- [ ] No errors regardless of which page is visited first

- [ ] NINJA BONUS: Create a third page that will increment the counter by 2

- [ ] NINJA BONUS: Create a reset button to set the counter back to zero