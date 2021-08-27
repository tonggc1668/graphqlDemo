http://localhost:8081/graphiql
left page input below
{
pets {
name type age
}
animals
}

or

curl -i -X POST -d  '{"query": "{pets{name type age}animals}"}' http://127.0.0.1:8081/graphql && echo