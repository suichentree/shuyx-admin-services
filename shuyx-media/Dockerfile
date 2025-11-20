# 第一阶段：构建阶段
FROM maven:3.8.6-openjdk-8-slim AS builder

# 设置工作目录
WORKDIR /app

# 先复制pom.xml并下载依赖（利用Docker缓存机制）
COPY pom.xml .
RUN mvn dependency:go-offline -B

# 复制源代码并构建JAR包
COPY src ./src
RUN mvn clean package -DskipTests

# 第二阶段：运行阶段
FROM openjdk:8-jre-slim

# 设置工作目录
WORKDIR /app

# 从构建阶段复制JAR包到运行阶段（这是多阶段构建的关键步骤）
COPY --from=builder /app/target/shuyx-media-1.0-SNAPSHOT.jar /app/app.jar

# 暴露容器的端口
EXPOSE 38070

# 定义容器启动时执行的命令
ENTRYPOINT ["java", "-jar", "/app/app.jar"]