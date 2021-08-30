
----------------query-------------
GraphiQL http://localhost:8081/graphiql

{
pets {
name type age
}
animals
}

![GraphiQLQuery.png](GraphiQLQuery.png)

or

curl -i -X POST -d  '{"query": "{pets{name type age}animals}"}' http://127.0.0.1:8081/graphql && echo


or

postman

{
"query": "{pets{name type age}animals}",
"operationName": "",
"variables": {}
}

![postmanQuery.png](postmanQuery.png)


----------------mutation-----------
GraphiQL http://localhost:8081/graphiql

mutation {
savePet(pet: {name: "Covey's dog", age: 3, type: DOG}) {
id
name
age
type
}
}

![GraphiQLMutation.png](GraphiQLMutation.png)


or
curl 'http://localhost:8081/graphql' -d $'{"query":"mutation {savePet(pet: {name: \\"Covey\'s dog\\", age: 3, type: DOG}) {id name age type}}","variables":null}'

or

postman

{
"query": "mutation {savePet(pet: {name: \"Covey's dog\", age: 3, type: DOG}) {id name age type}}",
"operationName": "",
"variables": null
}
![postmanMutation.png](postmanMutation.png)