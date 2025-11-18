# 1 选择基础镜像（相当于选一个带Java环境的操作系统）
# 因为Spring Boot需要Java运行环境，所以选一个包含JRE的镜像
FROM openjdk:8-jre-slim

# 2 通过WORKDIR命令，在容器内创建一个工作目录app
WORKDIR /app

# 3 把本地打包好的jar包复制到容器的/app目录里
COPY target/shuyx-user-1.0-SNAPSHOT.jar /app/app.jar

# 4 暴露容器的端口（和项目配置一致）
EXPOSE 38010

# 5 定义容器启动时执行的命令（可添加JVM参数）（启动Spring Boot应用）
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
