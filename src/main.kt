fun main(){
    var me = Human("Mitchelle",19,72)
    me.eat(2)
    println(me.weight)
    me.speak("life is good")
    me.birthday(22)
    var person=User("prudence","Ahimbisibwe","4637738783789","help","ahimbisibweprudence@gmail.com")
    println(person.firstName)
    println(person.lastName)
    println(person.phoneNumber)
    println(person.password)
    println(person.email)

}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+= foodWeight
    }
fun speak( speech:String){
    println(speech)
     }
fun birthday (increment:Int) {
    age++
    println(age)
}


     }
class User(var firstName:String,var lastName:String,var phoneNumber:String,var password:String,var email:String){

}



