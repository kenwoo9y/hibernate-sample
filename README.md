# hibernate-sample

### Create
`curl -XPOST -H "Content-Type: application/json" -d '{ "userName":"TaroYamada", "password":"zaq12wsx", "email":"taro.yamada@example.com", "firstName":"太郎", "lastName":"山田" }' http://localhost:8080/api/user`

### Read
#### findOne
`curl http://localhost:8080/api/user/1`
#### findAll
`curl http://localhost:8080/api/user`

### Update
`curl -XPUT -H "Content-Type: application/json" -d '{ "password":"abc1234" }' http://localhost:8080/api/user/update/1`

### Delete
`curl -XDELETE  http://localhost:8080/api/user/delete/1`
