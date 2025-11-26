FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY . .
RUN javac CalculatorApp.java
CMD ["java", "CalculatorApp"]
