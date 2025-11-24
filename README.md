# shuyx-admin-services

## 项目简介

shuyx-admin-services 是一个基于 Spring Cloud Alibaba 微服务架构的后台管理系统，提供用户管理、媒体管理、文件管理等核心功能，通过网关进行统一访问控制和路由转发。

## 技术栈

- **基础框架**: Spring Boot 2.3.12.RELEASE
- **微服务框架**: Spring Cloud Hoxton.SR12
- **微服务组件**: Spring Cloud Alibaba 2.2.8.RELEASE
- **ORM框架**: MyBatis-Plus 3.5.2
- **数据库**: MySQL 8.0.25
- **消息队列**: RocketMQ 2.2.3
- **API文档**: Swagger 2.9.2
- **认证授权**: JWT 3.4.0
- **数据加密**: JBCrypt
- **JSON工具**: Fastjson 1.2.83
- **代码简化**: Lombok 1.18.20
- **构建工具**: Maven
- **容器化**: Docker

## 系统架构

系统采用典型的微服务架构，主要包含以下几个部分：

1. **网关层**: shuyx-gateway - 负责请求路由、负载均衡、统一认证等
2. **服务层**:
    - shuyx-user - 用户管理服务
    - shuyx-media - 媒体管理服务
    - shuyx-file - 文件管理服务
3. **公共层**: shuyx-commons - 提供公共组件、工具类、实体类等

## 目录结构

shuyx-admin-services/ 
├── shuyx-commons/ # 公共模块 
│ ├── src/main/java/ # 公共Java代码 
│ └── src/main/resources/# 公共资源文件 
├── shuyx-user/ # 用户服务模块 
│ ├── src/main/java/ # 用户服务Java代码 
│ └── src/main/resources/# 用户服务配置文件 
├── shuyx-media/ # 媒体服务模块 
│ ├── src/main/java/ # 媒体服务Java代码 
│ └── src/main/resources/# 媒体服务配置文件 
├── shuyx-file/ # 文件服务模块 
│ ├── src/main/java/ # 文件服务Java代码 
│ └── src/main/resources/# 文件服务配置文件 
├── shuyx-gateway/ # 网关服务模块 
│ ├── src/main/java/ # 网关服务Java代码 
│ └── src/main/resources/# 网关服务配置文件 
├── docker-compose.yml # Docker Compose配置 
├── pom.xml # Maven父项目配置 
└── README.md # 项目说明文档

## 快速开始

### 环境要求

- JDK 1.8+
- Maven 3.6+
- MySQL 8.0+
- RocketMQ 4.9+
- Docker (可选)

### 本地开发

1. **克隆项目**

```bash
git clone [项目地址]
cd shuyx-admin-services
```

2. **配置数据库**

创建数据库并导入初始数据（具体SQL请参考各模块的说明）。

3. **修改配置文件**

根据实际环境修改各模块的 `application.yml` 和 `bootstrap.yml` 配置文件。

4. **编译项目**

```bash
mvn clean install
```

5. **启动服务**

按照以下顺序启动各模块：
- shuyx-commons (编译即可，无需单独启动)
- shuyx-user
- shuyx-media
- shuyx-file
- shuyx-gateway

### 使用Docker部署

1. **构建镜像**

在shuyx-admin-services目录下执行以下命令：
```bash
docker-compose build
```

2. **启动容器**

在shuyx-admin-services目录下执行以下命令：
```bash
docker-compose up -d
```

## API文档

启动网关服务后，可通过以下地址访问Swagger API文档： ```http://localhost:[网关端口]/swagger-ui.html```


## 主要功能

- **用户管理**: 用户注册、登录、权限控制等
- **媒体管理**: 媒体资源的上传、存储、检索等
- **文件管理**: 文件的上传、下载、预览等
- **统一认证**: 基于JWT的身份认证和授权
- **统一网关**: 请求路由、负载均衡、限流熔断等

## 注意事项

1. 请确保在生产环境中修改默认的数据库连接信息和密钥
2. 生产环境建议配置HTTPS以确保数据传输安全
3. 定期备份数据库以防止数据丢失

## 许可证

[在此添加许可证信息]

## 联系信息

如有任何问题或建议，请联系项目维护者。