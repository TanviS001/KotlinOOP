class Car(name: String, model: Int){
    var name: String? = null
    var model: Int? = null
    
    init{
        this.name = name
        this.model = model
    }
    
    fun show(){
        println("My car is $name and it is $model model")
    }
}

fun main() {
    //Creating an object
    var myCar = Car("Mercedes", 2020)
    //Using an object to access the class
    myCar.show()
}
