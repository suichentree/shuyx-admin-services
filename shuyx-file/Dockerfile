# 选择基础镜像
FROM openjdk:8-jre-slim

# 创建工作目录
WORKDIR /app

# 复制jar包
COPY ./target/shuyx-file-1.0-SNAPSHOT.jar /app/app.jar

# 暴露端口
EXPOSE 38090

# 启动命令
ENTRYPOINT ["java", "-jar", "/app/app.jar"]