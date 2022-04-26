# eCommerce
a simple ecommerce app using Spring boot REST APIs

1) HTTP METHOD: GET , URL PATH: localhost:8080/categories , HTTP STATUS CODE: 200 OK , DESCRIPTION: get all categories, SAMPLE REQUEST : localhost:8080/categories , Sample Response : [
    {
        "id": 1,
        "name": "product1"
    }
]


2) HTTP METHOD: POST , URL PATH: localhost:8080/addCategories , HTTP STATUS CODE:200 OK , DESCRIPTION: add a category, SAMPLE REQUEST : localhost:8080/addCategory , Sample Response : 200 OK
3) HTTP METHOD: GET , URL PATH: localhost:8080/subCategories , HTTP STATUS CODE: 200 OK, DESCRIPTION: get all sub categories, SAMPLE REQUEST : localhost:8080/subCategories , Sample Response : [
    {
        "id": 3,
        "name": "SubCategory1"
    }
]
4) HTTP METHOD: POST , URL PATH: localhost:8080/addSubCategories , HTTP STATUS CODE: 200 OK, DESCRIPTION: add a sub category, SAMPLE REQUEST : localhost:8080/addSubCategory , Sample Response : 200 OK
5) HTTP METHOD: GET , URL PATH: localhost:8080/products , HTTP STATUS CODE: 200 OK, DESCRIPTION: get all products, SAMPLE REQUEST : localhost:8080/products , Sample Response : [
    {
        "id": 1,
        "name": "product1"
    }
]
6) HTTP METHOD: POST , URL PATH: localhost:8080/addProduct , HTTP STATUS CODE: 200 OK, DESCRIPTION: add a product, SAMPLE REQUEST : localhost:8080/addProduct , Sample Response : 200 OK
