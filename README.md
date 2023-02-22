# Project Tutorials 1

## Mục lục
***
- [Phần 1: Spring Boot Tests](#phan-1)
  - [1)Thực hiện viết code cho từng layer, Entity tùy chọn](#1)
    - [Xây dựng Entity](#2)
    - [Xây dựng tầng Repository](#2)
    - [Xây dựng tầng Serivice](#3)
    - [Xây dựng tầng Controller](#4)
  - [2)Thực hiện viết test case cho từng layer ](#5)
    - [Test trên tầng Repository](#6)
    - [Test trên tầng Serivice](#7)
    - [Test trên tầng Controller](#8)
- [Phần 2:](#phan-2)
  - [1)Sử dụng Actuator](#9)
    - [Cài đặt port quản lý giám sát, enable và truy vấn tất cả các endpoints](#10)
    - [Truy vấn thông tin sức khỏe ứng dụng](#11)
    - [Thực hiện shutdown ứng dụng](#12)
  - [2)Sử dụng Devtools](#13)
    - [Thực hiện đổi port quản lý giám sát](#14)
    - [Thực hiện truy vấn tất cả các endpoints](#17)

### Phần 1: Spring Boot Tests

#### 1)Thực hiện viết code cho từng layer, Entity tùy chọn
* **Create a Tutorial**
* **Postman:**
![API 1A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/1..png)
* **H2 DB:**  
![API 1B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/2..png)

#### API 2: GET /api/tutorials
* **Get all Tutorial**
* **Postman:**
![API 2A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/3..png)
* **H2 DB:**  
![API 2B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/2..png)

#### API 3: GET /api/tutorials/{id}
* **Get all Tutorial by Id**
* **Postman:**
![API 3A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/4..png)
* **H2 DB:**  
![API 3B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/2..png)


#### API 4: PUT /api/tutorials/{id}
* **Edit Tutorial by Id**
* **Postman:**
![API 4A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/5..png)

* **H2 DB:**  
![API 4B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/7..png)


#### API 5: DELETE /api/tutorials/{id}
* **Delete Tutorial by Id**
* **Postman:**
![API 5A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/8..png)

* **H2 DB:**  
![API 5B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/9..png)


#### API 6: DELETE /api/tutorials
* **Delete All Tutorial**
* **Postman:**
![API 6A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/10..png)

* **H2 DB:**  
![API 6B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/11..png)


#### API 7: GET /api/tutorials/published
* **Get All Tutorial by Published**
* **Postman:**
![API 7A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/12..png)

* **H2 DB:**  
![API 7B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/13..png)


#### API 8: GET /api/tutorials?title={title}
* **Get All Tutorial by Title**
* **Postman:**
* **Postman:**
![API 8A](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/14..png)

* **H2 DB:**  
![API 8B](https://github.com/Bachos0605/ProjectTutorials/blob/main/Project_Tutorials/src/main/resources/Static/15..png)


