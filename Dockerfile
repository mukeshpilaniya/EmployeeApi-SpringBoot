FROM openjdk:8
ADD /target/EmployeeApi-Springboot.jar EmployeeApi-Springboot.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","EmployeeApi-Springboot.jar"]