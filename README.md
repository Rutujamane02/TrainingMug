# TrainingMug

# Car Management System

This is a Spring Boot-based Car Management System API. It allows you to manage and interact with car data through API endpoints. The API is documented with Swagger and can be tested with tools like Postman.

---

## **Prerequisites**

1. Java Development Kit (JDK) 17 or higher installed.
2. Maven installed.
3. IDE like IntelliJ IDEA, Eclipse, or VS Code configured for Java.
4. Postman installed for API testing.

---

## **Setup Instructions**

### 1. Clone the Repository
```bash
# Clone this repository to your local machine
git clone <repository-url>
cd car-management-system
```

### 2. Build the Project
Run the following command to build the project and resolve dependencies:
```bash
mvn clean install
```

### 3. Run the Application
Execute the following command to start the application:
```bash
mvn spring-boot:run
```
The application will start on port **8080** by default.

---

## **API Documentation with Swagger**

### Access Swagger UI:
1. Open your browser and navigate to:
   ```
   http://localhost:8080/swagger-ui/
   ```

2. You will see a user-friendly interface where you can interact with the API endpoints, view request/response formats, and test the APIs directly.

---

## **API Testing with Postman**

### Importing the Postman Collection
1. Open Postman.
2. Create a new collection and manually add API endpoints, or export the Swagger/OpenAPI JSON and import it into Postman:
   - Swagger JSON URL: `http://localhost:8080/v3/api-docs`
   - In Postman, go to **File > Import**, then paste the Swagger JSON URL to import all endpoints.

### Using Postman
1. Test endpoints by specifying the following headers:
   - **Content-Type**: `application/json`

2. Add body payloads (if required) in the **Body** tab.
3. Example endpoints:
   - **GET** `/cars` - Retrieve a list of cars.
   - **POST** `/cars` - Add a new car (requires JSON body).
   - **PUT** `/cars/{id}` - Update car details by ID.
   - **DELETE** `/cars/{id}` - Delete a car by ID.

---

## **Common Endpoints**

### **Cars Resource**
| HTTP Method | Endpoint          | Description                 |
|-------------|-------------------|-----------------------------|
| GET         | `/cars`           | Retrieve all cars           |
| GET         | `/cars/{id}`      | Retrieve a car by ID        |
| POST        | `/cars`           | Add a new car               |
| PUT         | `/cars/{id}`      | Update a car by ID          |
| DELETE      | `/cars/{id}`      | Delete a car by ID          |

---

## **Configuration**

### Update `application.properties` (if needed):
```properties
# Server settings
server.port=8080

# Swagger settings
springdoc.swagger-ui.enabled=true
```

---

## **Troubleshooting**

1. **Swagger Not Loading:**
   - Ensure the correct dependencies for Swagger or SpringDoc are added in `pom.xml`.
   - Verify the Swagger configuration (if any).

2. **API Not Working on Postman:**
   - Confirm that the application is running and accessible on `localhost:8080`.
   - Double-check endpoint paths and request payloads.
