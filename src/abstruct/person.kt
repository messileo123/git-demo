package abstruct

 abstract class person {
     abstract var name:String
     open var age:Int=0
     open var gender:String=""
     fun display(){
         println("name:$name")
         println("age:$age")
         println("gender:$gender")

     }
     abstract fun work()

}