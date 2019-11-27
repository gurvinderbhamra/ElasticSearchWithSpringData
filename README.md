**Elasticsearch with Spring Data**

Pre-requisites:
To setup the application, following are the pre-requisites:
- _JDK 1.8_
- _Elasticsearch 5.5.0_
- _Maven 3.6.0_

To run application locally, the command is: 
- **mvn spring-boot:run**
- or you can directly execute the main function in SpringDataElasticSearchApplication.java 

API details:
1. API to create or save customer:
    
    `curl --header "Content-Type: application/json" --request POST --data '{"id":"3","name":"def","address":"delhi","age":20}' http://localhost:8080/customer/save`
    
    Response:
    `{
      "id":"3",
      "name":"def",
      "address":"delhi",
      "age":20
    }`
    
    
2. API to get all saved customers: 
    
    `curl -X GET http://localhost:8080/customer/findAll `
   
   Response:
    `{ "content": [ 
        {"id":"1","name":"xyz","address":"xyz","age":24},
        {"id":"2","name":"abc","address":"abc","age":24},
        {"id":"3","name":"def","address":"delhi","age":20}
      ],
      "pageable":{
         "sort":{"unsorted":true,"sorted":false,"empty":true},
         "pageSize":2,
         "pageNumber":0,
         "offset":0,
         "unpaged":false,
         "paged":true
       },
       "facets":[],
       "aggregations":null,
       "scrollId":null,
       "maxScore":1.0,
       "totalPages":1,
       "totalElements":2,
       "last":true,
       "first":true,
       "sort":{"unsorted":true,"sorted":false,"empty":true},
       "numberOfElements":2,
       "size":2,
       "number":0,
       "empty":false
     }`
     
3. API to delete customers:
          `curl -X DELETE http://localhost:8080/customer/delete/3`
